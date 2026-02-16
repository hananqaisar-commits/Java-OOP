
abstract class Employee {
    public void claculateSalary() {
        System.out.println("Teacher salary is calculating");
    }
}

class MathTeacher extends Employee {
    public void teacher() {
        System.out.println("Math teacher salary is calculating");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        Employee emp;

        MathTeacher e1 = new MathTeacher();
        // e1 = emp;
        e1.claculateSalary();

    }
}