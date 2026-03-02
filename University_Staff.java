import java.util.Scanner;

abstract class Staff {
    private double salary;
    private String name;
    private int id;

    public void setDetails(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String displayDetails_name() {
        return name;
    }

    public int displayDetails_ID() {
        return id;
    }

    public void setSalary(double lpm) {

        salary = lpm * 1000;

    }

    public void setSalary(int fix) {

        salary = fix;

    }

    public double getSalary() {
        return salary;
    }

    abstract public void calculateSalary();
}

class Lecturer extends Staff {
    public int lecturesPerMonth;

    @Override
    public void calculateSalary() {

    }
}

class Administration extends Staff {
    private int fixedSalary;

    @Override
    public void calculateSalary() {
        setSalary(fixedSalary);
    }

}

public class University_Staff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of staff: ");
        int n = sc.nextInt();

        Staff[] staff = new Staff[n];// this is array of object

        for (int i = 0; i < n; i++) {

            System.out.println("Staff number " + (i + 1) + ": ");

            System.out.println("Enter type (1 = Lecturer, 2 = Administrator): ");
            int choice = sc.nextInt();

            if (choice == 1) {
                staff[i] = new Lecturer();

                sc.nextLine();
                System.out.print("Enter your name: ");
                String name = sc.nextLine();

                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Lectures per month: ");
                double lpm = sc.nextInt();// lpm---->lecture per month
                sc.nextLine();

                staff[i].setDetails(name, id);
                staff[i].setSalary(lpm);
                // staff[i].calculateSalary();

            }

            else if (choice == 2) {
                staff[i] = new Administration();

                sc.nextLine();
                System.out.print("Enter your name: ");
                String name = sc.nextLine();

                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                staff[i].setDetails(name, id);
                staff[i].setSalary(120000);

            } else {
                i--;
                continue;
            }

        }

        for (int i = 0; i < n; i++) {

            System.out.println("\nName is: " + staff[i].displayDetails_name());
            System.out.println("Id is: " + staff[i].displayDetails_ID());
            System.out.println("Salary is: " + staff[i].getSalary());

        }
        sc.close();
    }
}