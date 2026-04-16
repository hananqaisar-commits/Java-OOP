import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

// ── Represents a single Collatz sequence result ──────────────────────────────
class CollatzResult {
    private final int startValue;
    private final List<Integer> sequence;

    CollatzResult(int startValue, List<Integer> sequence) {
        this.startValue = startValue;
        this.sequence  = Collections.unmodifiableList(sequence);
    }

    public int getStartValue()   { return startValue; }
    public int getStepCount()    { return sequence.size() - 1; } // exclude starting value
    public int getPeakValue()    { return Collections.max(sequence); }
    public List<Integer> getSequence() { return sequence; }

    @Override
    public String toString() {
        return String.format("n=%-6d | steps=%-5d | peak=%-10d", startValue, getStepCount(), getPeakValue());
    }
}

// ── Core engine: computes the Collatz sequence ────────────────────────────────
class CollatzEngine {

    // No state – pure computation, returns a rich result object
    public CollatzResult compute(int n) {
        if (n <= 0) throw new IllegalArgumentException("Input must be a positive integer.");

        List<Integer> sequence = new ArrayList<>();
        sequence.add(n);

        int current = n;
        while (current != 1) {
            if (current % 2 == 0) {
                current = current / 2;
            } else {
                current = current * 3 + 1;
            }
            sequence.add(current);
        }
        return new CollatzResult(n, sequence);
    }
}

// ── Keeps a log of all computed results in the session ───────────────────────
class SessionHistory {
    private final List<CollatzResult> history = new ArrayList<>();

    public void add(CollatzResult result) {
        history.add(result);
    }

    public boolean isEmpty() { return history.isEmpty(); }

    public CollatzResult getLongestSequence() {
        return history.stream()
                .max((a, b) -> Integer.compare(a.getStepCount(), b.getStepCount()))
                .orElse(null);
    }

    public CollatzResult getHighestPeak() {
        return history.stream()
                .max((a, b) -> Integer.compare(a.getPeakValue(), b.getPeakValue()))
                .orElse(null);
    }

    public void printHistory() {
        if (isEmpty()) {
            System.out.println("  (No history yet.)");
            return;
        }
        System.out.printf("  %-8s  %-8s  %-12s%n", "Start", "Steps", "Peak Value");
        System.out.println("  " + "─".repeat(34));
        for (CollatzResult r : history) {
            System.out.printf("  %-8d  %-8d  %-12d%n",
                    r.getStartValue(), r.getStepCount(), r.getPeakValue());
        }
    }
}

// ── Pretty printer / UI helper ────────────────────────────────────────────────
class Display {

    static void printBanner() {
        System.out.println();
        System.out.println("╔══════════════════════════════════════════════════╗");
        System.out.println("║       COLLATZ CONJECTURE  SEQUENCE EXPLORER      ║");
        System.out.println("║  (every positive integer eventually reaches 1)   ║");
        System.out.println("╚══════════════════════════════════════════════════╝");
    }

    static void printMenu() {
        System.out.println();
        System.out.println("┌─────────────────────────────┐");
        System.out.println("│  [1] Compute sequence        │");
        System.out.println("│  [2] View session history    │");
        System.out.println("│  [3] Session statistics      │");
        System.out.println("│  [4] Exit                    │");
        System.out.println("└─────────────────────────────┘");
        System.out.print("  Choice: ");
    }

    static void printSequence(CollatzResult result, boolean verbose) {
        System.out.println();
        System.out.println("  ── Collatz Sequence for n = " + result.getStartValue() + " ──");

        if (verbose) {
            List<Integer> seq = result.getSequence();
            for (int i = 0; i < seq.size(); i++) {
                String arrow = (i < seq.size() - 1) ? " →" : "";
                System.out.printf("  Step %-4d : %d%s%n", i, seq.get(i), arrow);
            }
            System.out.println();
        }

        System.out.println("  ┌───────────────────────────────────┐");
        System.out.printf( "  │  Total steps  : %-18d│%n", result.getStepCount());
        System.out.printf( "  │  Peak value   : %-18d│%n", result.getPeakValue());
        System.out.printf( "  │  Final value  : %-18d│%n", 1);
        System.out.println("  └───────────────────────────────────┘");
    }

    static void printStats(SessionHistory history) {
        System.out.println();
        System.out.println("  ── Session Statistics ──");
        if (history.isEmpty()) {
            System.out.println("  No computations performed yet.");
            return;
        }
        CollatzResult longest = history.getLongestSequence();
        CollatzResult highest = history.getHighestPeak();
        System.out.println("  Longest sequence : " + longest);
        System.out.println("  Highest peak     : " + highest);
    }
}

// ── Main application: wires everything together ───────────────────────────────
public class Nifty_Sequence_Generator {

    public static void main(String[] args) {

        Scanner        scanner = new Scanner(System.in);
        CollatzEngine  engine  = new CollatzEngine();
        SessionHistory history = new SessionHistory();

        Display.printBanner();

        boolean running = true;
        while (running) {
            Display.printMenu();

            int choice = readInt(scanner, 1, 4);
            switch (choice) {
                case 1 -> handleCompute(scanner, engine, history);
                case 2 -> {
                    System.out.println("\n  ── Session History ──");
                    history.printHistory();
                }
                case 3 -> Display.printStats(history);
                case 4 -> {
                    System.out.println("\n  Goodbye! Come back for more sequences.\n");
                    running = false;
                }
            }
        }

        scanner.close();
    }

    // ── Handles option 1: Compute + display a new sequence ───────────────────
    private static void handleCompute(Scanner scanner, CollatzEngine engine, SessionHistory history) {
        System.out.print("\n  Enter a positive integer: ");
        int n = readInt(scanner, 1, Integer.MAX_VALUE);

        CollatzResult result;
        try {
            result = engine.compute(n);
        } catch (IllegalArgumentException e) {
            System.out.println("  Error: " + e.getMessage());
            return;
        }

        history.add(result);

        System.out.print("  Show full step-by-step sequence? (y/n): ");
        boolean verbose = scanner.next().trim().equalsIgnoreCase("y");
        scanner.nextLine(); // consume newline

        Display.printSequence(result, verbose);
    }

    // ── Safe integer reader with range validation ─────────────────────────────
    private static int readInt(Scanner scanner, int min, int max) {
        while (true) {
            try {
                int val = scanner.nextInt();
                scanner.nextLine(); // consume rest of line
                if (val >= min && val <= max) return val;
                System.out.printf("  Please enter a number between %d and %d: ", min, max);
            } catch (InputMismatchException e) {
                scanner.nextLine(); // discard bad token
                System.out.print("  Invalid input – enter a whole number: ");
            }
        }
    }
}