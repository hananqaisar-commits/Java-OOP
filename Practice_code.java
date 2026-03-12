import java.util.ArrayList;
import java.util.Scanner;

public class Practice_code {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("  PART 1: ArrayList of Primitive Types");
        System.out.println("========================================\n");

        // Create an ArrayList<Integer> called 'scores' and add these exam scores:
        ArrayList<Integer> scores = new ArrayList<>();

        // 85, 92, 78, 95, 88, 73, 90, 82
        scores.add(85);
        scores.add(92);
        scores.add(78);
        scores.add(95);
        scores.add(88);
        scores.add(73);
        scores.add(90);
        scores.add(82);

        // Print the list using a for-each loop.
        for (Integer integer : scores) {
            System.out.print("marks: " + integer);
        }

        System.out.println("\n--- Task 1: Scores ---");
        // Print each score on a separate line using a for-each loop
        for (Integer integer : scores) {
            System.out.println(integer);
        }

        // -----------------------------------------------
        // TASK 2: Access and modify elements
        // -----------------------------------------------

        // a) Print the score at index 3
        System.out.println("Score at index 3: " + scores.get(3)); // get(index) returns element at position 3

        // b) Change the score at index 1 to 97
        scores.set(1, 97); // set(index, value) replaces element at index 1 with 97

        // c) Insert score 100 at index 0 (beginning of list)
        scores.add(0, 100); // add(index, value) inserts 100 at index 0, shifts others right

        // d) Print the updated list size
        System.out.println("Updated list size: " + scores.size()); // size() returns total number of elements

        // e) Print all scores using a regular for loop
        for (int i = 0; i < scores.size(); i++) { // loop from index 0 to end of list
            System.out.print(scores.get(i) + " "); // get(i) fetches element at each index
        }

        System.out.println("\n--- Task 2: Access & Modify ---");

        sc.close(); // close Scanner to free resources
    }
}