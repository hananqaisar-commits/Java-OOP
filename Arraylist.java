import java.util.Scanner;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> a1 = new ArrayList<>();// this is called arraylist
        // 1.Arraylist stored in non continuous memory
        // 2.This array can easily modify or add
        // 3.Integer,Float,String,Character,Boolean

        a1.add("Qaisar");
        a1.add("Abbas");
        a1.add("Hanan");

        System.out.println("Arraylist is: " + a1);
        System.out.println("Replace index is: " + (a1.set(2, "Abbas")));
        System.out.println("Arraylist is: " + a1);
        System.out.println("Set number: " + (a1.add("Tidi")));
        System.out.println("Arraylist is: " + a1);
        System.out.println("size is: " + a1.size());
        System.out.println("remove number: " + a1.remove("Abbas"));
        System.out.println("Arraylist is: " + a1);
        a1.clear();
        System.out.println("Arraylist is: " + a1);

    }
}
