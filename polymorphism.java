import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class polymorphism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        overLoading p1 = new overLoading();
        p1.add(50, 45);

        overRidding a1 = new overRidding();

        sc.close();
    }
}

class overLoading {// this is example of function overloading
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

}

class overRidding{

    System.out.println("This is parent class.");
    
}