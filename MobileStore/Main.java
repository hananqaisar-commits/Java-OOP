package MobileStore;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/**
 * Entry point for the Mobile Store Management System.
 * Demonstrates all advanced features: add/remove/search/sort/stats.
 */
public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // ── Build inventory ───────────────────────────────────────────────────
        Store mobileOyee = new Store("Mobile Oyee",   "Lahore, Pakistan");
        Store mobileWorld = new Store("Mobile World", "New York, USA");

        populateStore(mobileOyee, mobileWorld);

        // ── Interactive menu loop ─────────────────────────────────────────────
        boolean running = true;
        while (running) {
            printMenu();
            int choice = readInt(1, 9);
            switch (choice) {
                case 1 -> mobileOyee.displayInventory();
                case 2 -> mobileWorld.displayInventory();
                case 3 -> searchByBrand(mobileOyee);
                case 4 -> searchByBudget(mobileOyee);
                case 5 -> sortMenu(mobileOyee);
                case 6 -> showPriceExtremes(mobileOyee);
                case 7 -> Store.displayGlobalStats();
                case 8 -> addPhoneInteractive(mobileOyee);
                case 9 -> {
                    System.out.println("\n  Thanks for visiting Mobile Oyee! Goodbye.\n");
                    running = false;
                }
            }
        }

        scanner.close();
    }

    // ── Pre-populate stores with sample data ──────────────────────────────────
    private static void populateStore(Store s1, Store s2) {

        Battery bigBattery   = new Battery(5000, Battery.BatteryType.LI_PO);
        Battery appleBattery = new Battery(4422, Battery.BatteryType.LI_ION);
        Battery fastBattery  = new Battery(4600, Battery.BatteryType.GRAPHENE);

        Phone samsung = new Phone("Samsung", "Galaxy S24",  435_933.90, 12, 256, bigBattery);
        Phone oppo    = new Phone("Oppo",    "Reno 12 Pro",  34_500.50,  8, 128, fastBattery);
        Phone apple   = new Phone("Apple",   "iPhone 17 Pro",560_000.00, 8, 256, appleBattery);
        Phone nokia   = new Phone("Nokia",   "3310 Revival",  3_500.00,  2,   8, new Battery(1200, Battery.BatteryType.LI_ION));
        Phone redmi   = new Phone("Redmi",   "Note 13 Pro",  43_000.99,  8, 128, bigBattery);

        // store 1
        s1.addPhone(samsung);
        s1.addPhone(oppo);
        s1.addPhone(apple);
        s1.addPhone(redmi);
        s1.addPhone(nokia);
        s1.addPhone(new Phone(redmi));   // copy – same model, separate stock item
        s1.addPhone(new Phone(redmi));

        // store 2
        s2.addPhone(new Phone(apple));
        s2.addPhone(new Phone(apple));
        s2.addPhone(new Phone(redmi));
    }

    // ── Menu ──────────────────────────────────────────────────────────────────
    private static void printMenu() {
        System.out.println();
        System.out.println("┌────────────────────────────────────────┐");
        System.out.println("│     📱  Mobile Store Manager           │");
        System.out.println("├────────────────────────────────────────┤");
        System.out.println("│  [1] View Mobile Oyee inventory        │");
        System.out.println("│  [2] View Mobile World inventory       │");
        System.out.println("│  [3] Search by brand (Mobile Oyee)     │");
        System.out.println("│  [4] Search by budget (Mobile Oyee)    │");
        System.out.println("│  [5] Sort inventory (Mobile Oyee)      │");
        System.out.println("│  [6] Cheapest / most expensive         │");
        System.out.println("│  [7] Global stats (all stores)         │");
        System.out.println("│  [8] Add a new phone (Mobile Oyee)     │");
        System.out.println("│  [9] Exit                              │");
        System.out.println("└────────────────────────────────────────┘");
        System.out.print("  Choice: ");
    }

    // ── Feature handlers ──────────────────────────────────────────────────────

    private static void searchByBrand(Store store) {
        System.out.print("  Enter brand name: ");
        String brand = scanner.nextLine().trim();
        List<Phone> results = store.findByBrand(brand);
        if (results.isEmpty()) {
            System.out.println("  No phones found for brand: " + brand);
        } else {
            System.out.println("  Found " + results.size() + " result(s):");
            results.forEach(p -> System.out.println("    • " + p));
        }
    }

    private static void searchByBudget(Store store) {
        System.out.print("  Enter max budget (PKR): ");
        double budget = readDouble();
        List<Phone> results = store.findByMaxPrice(budget);
        if (results.isEmpty()) {
            System.out.println("  No phones found within PKR " + String.format("%,.2f", budget));
        } else {
            System.out.printf("  %d phone(s) within your budget (sorted cheapest first):%n", results.size());
            results.forEach(p -> System.out.println("    • " + p));
        }
    }

    private static void sortMenu(Store store) {
        System.out.println("  Sort by: [1] Price ↑  [2] Price ↓  [3] Brand A→Z");
        System.out.print("  Choice: ");
        int c = readInt(1, 3);
        switch (c) {
            case 1 -> { store.sortByPriceAsc();  System.out.println("  Sorted by price ascending."); }
            case 2 -> { store.sortByPriceDesc(); System.out.println("  Sorted by price descending."); }
            case 3 -> { store.sortByBrand();     System.out.println("  Sorted alphabetically by brand."); }
        }
        store.displayInventory();
    }

    private static void showPriceExtremes(Store store) {
        Optional<Phone> cheapest    = store.getCheapest();
        Optional<Phone> mostExpensive = store.getMostExpensive();

        System.out.println();
        cheapest.ifPresentOrElse(
                p -> System.out.println("  💰 Cheapest      : " + p),
                ()  -> System.out.println("  (No phones in store)"));
        mostExpensive.ifPresentOrElse(
                p -> System.out.println("  💎 Most expensive: " + p),
                ()  -> System.out.println("  (No phones in store)"));
    }

    private static void addPhoneInteractive(Store store) {
        System.out.println("\n  ── Add a new phone ──");
        try {
            System.out.print("  Brand   : "); String brand = scanner.nextLine().trim();
            System.out.print("  Model   : "); String model = scanner.nextLine().trim();
            System.out.print("  Price   : "); double price = readDouble();
            System.out.print("  RAM (GB): "); int ram = readInt(1, 512);
            System.out.print("  Storage (GB): "); int storage = readInt(1, 4096);

            System.out.println("  Battery type: [1] Li-ion  [2] Li-Po  [3] Graphene  [4] Solid-State");
            System.out.print("  Choice: ");
            Battery.BatteryType bType = Battery.BatteryType.values()[readInt(1, 4) - 1];
            System.out.print("  Battery capacity (mAh): "); int cap = readInt(500, 20000);

            Phone phone = new Phone(brand, model, price, ram, storage, new Battery(cap, bType));
            store.addPhone(phone);
            System.out.println("  ✅ Phone added: " + phone);

        } catch (IllegalArgumentException e) {
            System.out.println("  ❌ Error: " + e.getMessage());
        }
    }

    // ── Safe input helpers ────────────────────────────────────────────────────

    private static int readInt(int min, int max) {
        while (true) {
            try {
                int val = Integer.parseInt(scanner.nextLine().trim());
                if (val >= min && val <= max) return val;
                System.out.printf("  Enter a number between %d and %d: ", min, max);
            } catch (NumberFormatException e) {
                System.out.print("  Invalid — enter a whole number: ");
            }
        }
    }

    private static double readDouble() {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("  Invalid — enter a number: ");
            }
        }
    }
}