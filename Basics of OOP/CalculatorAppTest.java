import java.util.Scanner;

class SimpleCalculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int Multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int modulus(int a, int b) {
        return a % b;
    }

}

public class CalculatorAppTest {

    public static void main(String[] args) {

        SimpleCalculator calc1 = new SimpleCalculator();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = input.nextInt();
        System.out.print("Enter b: ");
        int b = input.nextInt();

        System.out.println("Add: " + calc1.add(a, b));
        System.out.println("Subtract: " + calc1.subtract(a, b));
        System.out.println("Multiply: " + calc1.Multiply(a, b));
        System.out.println("Divide: " + calc1.divide(a, b));
        System.out.println("Reminder is: " + calc1.modulus(a, b));

        input.close();
    }
}

// Exercise: Simple Calculator
// Goal
// Practice method parameters, return values, object creation, and calling
// methods.
// Requirements
// Create a class SimpleCalculator
// Implement these public methods:
// public int add(int a, int b) → returns sum
// public int subtract(int a, int b) → returns difference
// public int multiply(int a, int b) → returns product
// B) Create a class CalculatorAppTest containing main
// In main:
// Use Scanner to input two integers from the user.
// Create a SimpleCalculator object.
// Call each method and print results clearly, for example:
// Sum = ...
// Difference = ...
// Product = ...
