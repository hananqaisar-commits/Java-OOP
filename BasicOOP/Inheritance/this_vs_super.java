import java.util.Scanner;

//this --->call current class 
// Used to refer to the current class
// this keyword Must be first if used in constructor
//super---> call parent class (Use in inheritance)
// Used to refer to the parent class variables and methods
// super keyword Must be first if used in constructor

// e.g:

// class Person {
//     Person() {
//         System.out.println("Person constructor");
//     }
// }

// class Bilal extends Person {
//     Bilal() {
//         System.out.println("Bilal constructor");
//     }
// }

// class Don extends Bilal {
//     Don() {
//         System.out.println("Don constructor");
//     }
// }

// Don donObj = new Don();
//constructor flow:(if object don is created)
//1. person constructor
// 2. Bilal constructor
// 3. Don constructor

// Parent → Child → Sub-child → Final class
// A → B → C → D → Object creation class

public class this_vs_super {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account Meezan = new Account("Hanan Qaisar");
        Meezan.showInfo();

        Account UBL = new Account("Ahtisham Qaisar", 56000);
        UBL.showInfo();
        UBL.printAccount(UBL);

        SavingAccount MCB = new SavingAccount("Hanan Qaisar", 340000, 3.5);
        MCB.showInfo();

        sc.close();
    }
}

class Account {
    protected String holderName;
    protected double balance;

    public Account() {

    }

    public Account(String holderName) {
        this(holderName, 0.0);// it call constructor 2 of this class
    }

    public Account(String holderName, double balance) {
        this.holderName = holderName;
        this.balance = balance;
    }

    public void showInfo() {
        System.out.println("\n---- Account Info   ----");
        System.out.println("Holder: " + holderName);
        System.out.println("Balance: " + balance);

    }

    public void printAccount(Account a) {
        System.out.println("Account holder: " + a.holderName);
    }
}

class SavingAccount extends Account {

    private double intrestRate;

    public SavingAccount(String holderName, double balance, double intrestRate) {
        super(holderName, balance);// it call the constructor of parent class
        this.balance = balance;
        this.intrestRate = intrestRate;
    }

    @Override
    public void showInfo() {
        super.showInfo();// it call the method of parent c lass
        super.printAccount(this);
        System.out.println("Intrest rate: " + intrestRate + "%");
    }
}