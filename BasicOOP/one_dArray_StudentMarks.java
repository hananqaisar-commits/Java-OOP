import java.util.Scanner;

public class one_dArray_StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[10];// Rectangular Array
        // int[] mark={1,2,3,4,5,6,7,8,1,2};

        Input_Output student = new Input_Output();
        student.input(marks, sc);
        student.output(marks);
        System.err.println("Highest marks: " + student.highest(marks));
        System.err.println("lowest marks: " + student.lowest(marks));
        System.err.println("Average marks: " + student.average(marks));

        sc.close();
    }
}

class Input_Output {

    public void input(int[] marks, Scanner input) {

        for (int row = 0; row < marks.length; row++) {

            System.out.print("Enter " + (row + 1) + " row: ");
            marks[row] = input.nextInt();

        }

    }

    public void output(int[] marks) {

        int i = 0;
        System.out.println();
        for (int mark : marks) {
            System.out.println("Student " + (++i) + ": " + mark);
        }
    }

    public double average(int[] mark) {
        double total = 0;
        for (int i = 0; i < mark.length; i++) {
            total += mark[i];
        }
        return total / mark.length;
    }

    public int highest(int[] mark) {
        int highest = 0;
        for (int i = 0; i < mark.length; i++) {
            if (mark[i] > highest) {
                highest = mark[i];
            }

        }
        return highest;
    }

    public int lowest(int[] mark) {
        int lowest = 1111111111;
        for (int i = 0; i < mark.length; i++) {
            if (mark[i] < lowest) {
                lowest = mark[i];
            }

        }
        return lowest;
    }
}