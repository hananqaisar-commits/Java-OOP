import java.util.Scanner;

class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public Person(int id) {
        this.id = id;

    }

    public void setage(int age) {
        if (age >= 18 || age <= 100) {
            this.age = age;
        }
    }

    public int getage() {
        return age;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }
}

class Students extends Person {
    private String studentrollno;
    char[] grades = new char[6];
}

public class universitySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello World");

        sc.close();
    }
}