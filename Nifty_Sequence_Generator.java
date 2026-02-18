
import java.util.Scanner;

class Solve {
    private int n;
    static public int count;

    Solve(int n) {

        this.n = n;
    }

    public void check() {
        while (this.n != 1)// loops must be used inside constructor ot=r methods

        {

            if (n % 2 == 0) {
                n = n / 2;
                ++count;
                System.out.println("Next value is: " + n);
            } else if (n > 0) {
                n = n * 3 + 1;
                ++count;
                System.out.println("Next value is: " + n);

            } else {
                System.out.println("Enter poitive number.");
            }

        }
        System.out.println("Total steps: " + count);
    }
}

public class Nifty_Sequence_Generator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter positive number: ");
        int number = input.nextInt();

        if (number > 0) {
            Solve s1 = new Solve(number);
            s1.check();
        } else {
            System.out.println("Enter positive number.");
        }

    }

}