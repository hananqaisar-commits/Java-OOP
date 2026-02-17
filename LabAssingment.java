import java.util.Scanner;

class Student {
    private String name;
    private int balance;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
}

public class LabAssingment {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter Balance: ");
        int balance = input.nextInt();

        Student s1 = new Student();
        s1.setName(name);
        s1.setBalance(balance);

        System.out.println("Name is: " + s1.getName());
        System.out.println("Account balance is: " + s1.getBalance());

        input.close();

    }
}
