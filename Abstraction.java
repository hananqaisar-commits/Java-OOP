
class Employee {
    public void claculateSalary() {
        System.out.print("\nTeacher salary is calculating ");
        for (int i = 0; i < 3; i++) {

            System.out.print(".");
        }
    }
    // System.out.print(("\b\b\b"));
    // System.out.print((" "));
    // System.out.print(("\b\b\b"));
}

class MathTeacher extends Employee {
    @Override
    public void claculateSalary() {
        System.out.println("\nMath teacher salary is calculating");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        MathTeacher e1 = new MathTeacher();

        e1.claculateSalary();// this is called overRiding or run time polymorphisnm

        Employee t1 = new Employee();
        t1.claculateSalary();

    }
}