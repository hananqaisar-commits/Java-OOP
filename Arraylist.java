import java.util.Scanner;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> a1 = new ArrayList<>();// this is called arraylist
        // 1.Arraylist stored in non continuous memory
        // 2.This array can easily modify or add
        // 3.Integer,Float,String,Character,Boolean

        a1.add("Qaisar");// add mean append
        a1.add("Abbas");
        a1.add("Hanan");

        System.out.println("Arraylist is: " + a1);// print in form of arraylist like [Qaisar, Abbas, Hanan]
        System.out.println("Replace index is: " + (a1.set(2, "Abbas")));// set mean set at specific index
        System.out.println("Arraylist is: " + a1);
        System.out.println("Set number: " + (a1.add("Tidi")));// append
        System.out.println("Arraylist is: " + a1);
        System.out.println("size is: " + a1.size());// give size of array
        System.out.println("remove number: " + a1.remove("Abbas"));// remove only one Abbas from arraylist
        System.out.println("Arraylist is: " + a1);
        a1.clear();// it will erase all index of arraylist
        System.out.println("Arraylist is: " + a1);// now it will become empty -> []

        ArrayList<Double> f1 = new ArrayList<>();
        System.out.println("Double type arraylist is created");

        f1.add(25.67);
        f1.add(54.90);
        System.out.println("Arraylist: " + f1);
        System.out.println("Setting value 45.4 at 1st index: " + f1.set(1, 45.5));
        System.out.println("Size: " + f1.size());
        System.out.println(f1.add(41.902));// append
        System.out.println("Size after appending: " + f1.size());
        System.out.println("1st index value: " + f1.get(1));// get value of 1st index
        System.out.println(f1.remove(22.2));
        System.out.println(f1);

        for (double i : f1) {// enhanced for loop to print all index of arraylist
            System.out.println("Number:" + i);
        }

    }
}
