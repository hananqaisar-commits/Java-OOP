import java.util.Scanner;

public class Hanan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount b1 = new BankAccount();

        System.out.println("Enter  amount to deposit: ");
        double deposit = sc.nextDouble();
        b1.deposit(deposit);

        System.out.println("Enter amount to withdraw: ");
        double withdraw = sc.nextDouble();
        b1.withDraw(withdraw);

        sc.close();

    }
}

class BankAccount {

    public String name;
    private String accountNo;
    private double balance;

    public BankAccount() {
        accountNo = "Han123456";
        // accountNo++;
        balance = 0.0;
    }

    public void deposit(double amount) {
        if (checkpin()) {
            balance += amount;
        }
    }

    public void withDraw(double withdraw) {
        if (checkpin()) {
            System.out.println("Enter amount Withdraw: ");
            balance -= withdraw;
        }
    }

    public void display() {
        if (checkpin()) {
            System.out.println("Account number: " + accountNo);
            System.out.println("Balance: " + balance);
        }
    }

    public boolean checkpin() {

        int chance = 3;
        int pin = 1234;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter pin: ");
        int checkpin = input.nextInt();
        for (int i = 0; i < 3; i++) {

            if (checkpin == pin) {
                System.out.println("Sucessfully login");
                return true;
            } else {
                --chance;
                System.out.println(chance + " more chances left");
                checkpin = input.nextInt();

            }

        }
        input.close();
        return false;
    }
}

// 2. Bank Account System (OOP Practice)

// Create class BankAccount

// Data:

// name
// accountNumber
// balance

// Methods:
// deposit()
// withdraw()
// display()
// pin()