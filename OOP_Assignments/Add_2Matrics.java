import java.util.Scanner;

public class Add_2Matrics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Matrics m1 = new Matrics();
        Matrics m2 = new Matrics();

        double matricsElement1[][] = new double[3][3];
        double matricsElement2[][] = new double[3][3];

        System.out.println("Want to enter matrics 1 or matrics 2 ?(0 to exit)");
        int n = sc.nextInt();
        while (n != 0) {// did't exit untill user enter 0
            switch (n) {
                case 1:

                    System.out.println("Enter matrics 1 (3 by 3)");

                    m1.input(sc, matricsElement1);
                    break;
                case 2:

                    System.out.println("Enter matrics 2 (3 by 3)");
                    m2.input(sc, matricsElement2);

                    break;

                default:
                    System.out.println("Choose correct option");
                    break;

            }
            System.out.println("Want to enter matrics 1 or matrics 2 ?(0 to exit)");
            n = sc.nextInt();

        }
        // output
        m1.output(matricsElement1);
        System.out.println("+");
        m2.output(matricsElement2);
        System.out.println("=");
        Matrics.addMatrics(matricsElement1, matricsElement2);
        sc.close();
    }
}

class Matrics {
    public void input(Scanner sc, double matricsElement[][]) {
        for (int i = 0; i < matricsElement.length; i++) {
            for (int j = 0; j < matricsElement[i].length; j++) {
                matricsElement[i][j] = sc.nextDouble();
            }
        }
    }

    public void output(double matricsElement[][]) {

        System.out.println();
        for (int i = 0; i < matricsElement.length; i++) {
            for (int j = 0; j < matricsElement[i].length; j++) {
                System.out.print(matricsElement[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void addMatrics(double matrics1[][], double matrics2[][]) {

        System.out.println();
        for (int i = 0; i < matrics1.length; i++) {
            for (int j = 0; j < matrics1[i].length; j++) {
                System.out.print(matrics1[i][j] + matrics2[i][j] + " ");
            }
            System.out.println();
        }
    }
}