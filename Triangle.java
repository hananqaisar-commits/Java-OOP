import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = input.nextInt();
        System.out.print("Enter b: ");
        int b = input.nextInt();
        System.out.print("Enter c: ");
        int c = input.nextInt();

        isValid t1 = new isValid(a, b, c);
        tri a1 = new tri(a, b, c);

        if (t1.value) {
            System.out.println(a1.parameter());
            System.out.println(a1.area());
        } else {
            System.out.println("IN_Vlaid Dimensions");
        }
        input.close();
    }
}

class isValid {

    public boolean value = false;// now value is accessible directly by object

    isValid(int a, int b, int c) {
        if (a + b > c && b + c > a && a + c > b) {
            value = true;

        } else {
            value = false;
        }
    }
}

class tri {
    int s, a, b, c;

    tri(int a, int b, int c) {
        s = (a + b + c) / 2;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public int parameter() {
        return (a + b + c);
    }
}
