import java.util.Scanner;

class BankAccount {

    public String name;
    private double balance;
    public static int transactionCountLimit = 100;
    private double[] transactionAmount;
    private int transactionCount;

    public BankAccount(String name) {
        this.name = name;
        this.balance = 500;
        this.transactionAmount = new double[transactionCountLimit];
        this.transactionCount = 0;
    }

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.transactionAmount = new double[transactionCountLimit];
        this.transactionCount = 0;
    }

    public void deposit(double amount) {
        if (transactionCount >= transactionCountLimit) {
            System.out.println("Transaction limit reached! No more deposits allowed.");
            return;
        }
        if (amount > 0) {
            balance += amount;
            transactionAmount[transactionCount] = +amount;
            transactionCount++;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (transactionCount >= transactionCountLimit) {
            System.out.println("Transaction limit reached! No more withdrawals allowed.");
            return;
        }
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionAmount[transactionCount] = -amount;
            transactionCount++;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient funds.");
        }
    }

    public void printBalance() {
        System.out.println("Balance: " + balance);
    }

    public double computeTransactionBalance() {
        double total = 0;
        for (double t : transactionAmount) {
            total += t;
        }
        return total;
    }

    public void printCreditTransactions() {
        System.out.println("Credit Transactions:");
        for (double t : transactionAmount) {
            if (t > 0) {
                System.out.println("  + " + t);
            }
        }
    }

    public String toString() {
        return "Mr. " + name + " has " + balance + " Rs. (Transactions count: " + transactionCount + ")";
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount("Ali", 5000);
        System.out.println("Account created: " + account);

        System.out.print("\nEnter choice (+1 for credit, -1 for debit, 0 to exit): ");
        int choice = sc.nextInt();

        while (choice != 0) {
            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();

            if (choice == 1) {
                account.deposit(amount);
            } else if (choice == -1) {
                account.withdraw(amount);
            } else {
                System.out.println("Invalid choice. Use +1, -1, or 0.");
            }

            System.out.print("\nEnter choice (+1 for credit, -1 for debit, 0 to exit): ");
            choice = sc.nextInt();
        }

        System.out.println("\n--- Summary ---");
        System.out.println(account);
        System.out.println("Transaction Balance: " + account.computeTransactionBalance());
        account.printCreditTransactions();

        sc.close();
    }
}