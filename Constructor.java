import java.util.Scanner;

public class Constructor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Parent p1 = new Parent("Qaisar Abbas");
        Child c1 = new Child("Hanan Qaisar");

        System.out.println(p1.name());
        System.out.println(c1.info());

        sc.close();
    }
}

class Parent {
    String name;

    public Parent(String name) {
        this.name = name;
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

        System.out.println("Father name: " + name);
        return childName;
    }

}
