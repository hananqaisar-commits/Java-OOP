
class Employee {
    public void claculateSalary() {
        System.out.println("Teacher salary is calculating ");
        for (int i = 0; i < 3; i++) {
                Thread.sleep(3000);
         catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    System.out.println(".");
}

    System.out.print(("\b\b\b"));System.out.print((""));System.out.print(("\b\b\b"));
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

        e1.claculateSalary();
        e1.claculateSalary();

        Employee t1 = new Employee();
        t1.claculateSalary();

    }
}