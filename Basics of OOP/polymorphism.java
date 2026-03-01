import java.util.Scanner;

public class polymorphism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        overLoading p1 = new overLoading();
        System.err.println(p1.add(50.354, 45.78));

        Animal a1 = new Dog();
        Animal a2 = new Parrot();
        a1.voice();
        a2.voice();

        sc.close();// it close the scanner
    }
}

class overLoading {// this is example of function overloading compiler decides according to number
                   // of parameters and type of parameters at compile time
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

}

class Animal {// method
    public void voice() {
        System.out.println("Animal Voice");
    }

}

class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Dog Voice");
    }
}

class Parrot extends Animal {
    @Override
    public void voice() {
        System.out.println("Parrot Voice");
    }
}
