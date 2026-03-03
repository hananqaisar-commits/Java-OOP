import java.util.Scanner;

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

        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Insufficient balance");
        }

    }

    public void withDraw(double withdraw) {

        System.out.println("Enter amount Withdraw: ");
        if (withdraw > 0) {
            balance -= withdraw;

        } else {
            System.out.println("Insufficient balance");
        }

    }

    public boolean display() {

        System.out.println("Account number: " + accountNo);
        System.out.println("Balance: " + balance);
        return true;
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
                System.out.println("Retry: ");
                checkpin = input.nextInt();

            }

        }
        input.close();
        return false;
    }

}

public class Hanan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount b1 = new BankAccount();

        System.out.println("===========Welcomr to ATM===========");
        if (b1.checkpin()) {

            System.out.println("Enter choice: ");
            int choose = sc.nextInt();

            while (choose != 0) {
                switch (choose) {

                    case 1: {
                        System.out.println("Enter  amount to deposit: ");
                        double deposit = sc.nextDouble();
                        b1.deposit(deposit);

                        break;
                    }
                    case 2: {
                        System.out.println("Enter amount to withdraw: ");
                        double withdraw = sc.nextDouble();
                        b1.withDraw(withdraw);

                        break;

                    }
                    case 3: {
                        System.out.println(b1.display());

                        break;
                    }
                    case 0: {
                        break;
                    }

                }
                System.out.println("next choice: ");
                choose = sc.nextInt();
            }
            System.out.println("Thanks for using");
            sc.close();

        }
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