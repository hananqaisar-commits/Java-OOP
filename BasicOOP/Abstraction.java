
import java.util.Scanner;

abstract class Employee {

    private String subject;

    abstract public void calculateSalary();

    void setSub(String subject) {
        this.subject = subject;
    }

    String getSub() {
        return subject;
    }
}

class Teacher extends Employee {

    @Override
    public void calculateSalary() {
        System.out.println("\nTeacher salary is calculating...\n");

    }
}

class Engineer extends Employee {

    public Engineer(String subject) {

        setSub(subject);
    }

    @Override
    public void calculateSalary() {
        System.out.println("Engineer salary is calculating...\n");
    }

    public void subject() {
        System.out.println("Subject: " + getSub());
    }

}

class Doctor {

    String subject;

    public Doctor(String subject) {
        this.subject = subject;
    }

    public void calculateSalary() {
        System.out.println("Doctor Salary is calculating...");
    }

}

public class Abstraction {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // For teacher
        System.out.print("Enter subject: ");
        Teacher t1 = new Teacher();
        String hold = input.nextLine();
        t1.setSub(hold);
        System.out.print("Subject:" + t1.getSub());
        t1.calculateSalary();

        // For Engineer
        Engineer e1 = new Engineer("Math");
        e1.subject();
        e1.calculateSalary();

        // for doctor
        System.out.print("Enter strenght of doctor? ");
        int n = input.nextInt();
        input.nextLine();// it clear previous \n in the buffer

        Doctor[] doctor = new Doctor[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter subject " + (i + 1) + " :");

            String su = input.nextLine();
            doctor[i] = new Doctor(su);

        }
        System.out.println("");// newline
        for (int i = 0; i < n; i++) {

            System.out.println("Doctor " + (i + 1) + " Subject: " + doctor[i].subject);

        }

        input.close();
    }
}