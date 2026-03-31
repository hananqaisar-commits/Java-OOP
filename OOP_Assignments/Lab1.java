import java.util.Scanner;

public class LabTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee Hanan = new Employee("Hanan Qaisar", "Lahore", "gmail@gmail.com", 123456789, "Software house",
                564000.99);
        System.out.println(Hanan);
        sc.close();
    }

}

class Person {
    protected String name, address, email;
    protected int phNo;

    public Person() {

    }

    public Person(String name, String address, String email, int phNo) {
        this.phNo = phNo;
        this.address = address;
        this.email = email;
        this.name = name;
    }

}

class Student extends Person {
    protected String Status;

    public Student(String name, String address, String email, int phNo, String Status) {
        super(name, address, email, phNo);
        this.Status = Status;
    }
}

class Employee extends Person {
    protected String office;
    protected double salary;
    Date hireDate;

    public Employee(String name, String address, String email, int phNo, String office, double salary) {
        super(name, address, email, phNo);
        this.office = office;
        this.salary = salary;
        hireDate = new Date(07, 04, 2008);
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nPhone No: %d\nAddress: %s\nEmail: %s\nOffice: %s\nSalary: %f\n", name,
                phNo, address, email, office, salary) + hireDate.toString();
    }

}

class Date {
    protected int date, month, year;

    public Date(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("Hired Date: %2d/%2d/%4d", date, month, year);
    }
}

class Faculty extends Employee {
    protected int officeHours;
    protected String rank;

    Faculty(String name, String address, String email, int phNo, String office, double salary, int officeHours,
            String rank) {
        super(name, address, email, phNo, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;

    }

    @Override
    public String toString() {
        return String.format(
                "Name: %s\nPhone No: %d\nAddress: %s\nEmail: %s\nOffice: %s\nSalary: %.3f\nOffice Hour: %2d\nRank: %-10s",
                name,
                phNo, address, email, office, salary, officeHours, rank);
    }
}

class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String email, int phNo, String office, double salary, String title) {
        super(name, address, email, phNo, office, salary);
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nPhone No: %d\nAddress: %s\nEmail: %s\nOffice: %s\nSalary: %f\nTitle: %s", name,
                phNo, address, email, office, salary, title);
    }
}
