import java.util.Scanner;

public class Constructor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Parent p1 = new Parent("Qaisar Abbas");
        Parent p2 = new Parent(p1);// this is copy constructor
        p1.name = "Qaisar";
        Child c1 = new Child("Hanan Qaisar");

        System.out.println("constructor: " + p1.name());
        System.out.println(("Copy constructor: " + p2.name()));
        System.out.println(c1.info());

        sc.close();
    }
}

class Parent {
    String name;

    public Parent(String name) {
        this.name = name;
    }

    public Parent(Parent p1) {
        this.name = p1.name;
    }

    public String name() {
        return name;
    }

    public void name(String name) {
        this.name = name;
    }
}

class Child extends Parent {
    String childName;

    public Child(String childName) {
        super("Qaisar Abbas");

        this.childName = childName;
    }

    public String info() {

        System.out.println("Father name: " + name());
        return childName;
    }

}