import java.util.Scanner;

public class Java_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array1 = new int[5];
        // or
        int array2[] = new int[5];
        // or
        int[] array3 = { 1, 2, 3 };// if i have to direct initilize then array size will not fixed
        int array4[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };

        System.out.println("Array 1 size: " + array1.length);// to access length of array
        System.out.println("Array 2 size: " + array2.length);// to access length of array
        System.out.println("Array 3 size: " + array3.length);// to access length of array
        System.out.println("Array 4 size: " + array4.length);// to access length of array

        System.out.print("\n");

        System.out.println("Array 1: " + array1[3]);
        System.out.println("Array 2: " + array2[4]);
        System.out.println("Array 3: " + array3[2]);
        System.out.println("Array 4: " + array4[4]);

        System.out.print("\n");

        int array5[] = new int[10];

        for (int i = 0; i < array5.length; i++) {
            System.out.print("Enter index " + i + ": ");
            array5[i] = input.nextInt();
        }
        System.out.println("\nOutput through loop:\t");
        for (int i = 0; i < array5.length; i++) {
            System.out.println(i + " index: " + array5[i]);
        }
        input.close();
    }
}