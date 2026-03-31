import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======Copmuter======");
        Computer HP = new Computer(32, 9048, 5639056, 2.2);
        System.out.println(HP);
        System.out.println("======Laptop======");
        Leptop Lenovo = new Leptop(32, 6048, 9875612, 5.0, 18, 16, 18, 2.2);
        System.out.println(Lenovo);
        sc.close();
    }
}

class Computer {
    protected int wordsize;
    protected int memorysize;
    protected int storagesize;
    protected double speed;

    public Computer() {

    }

    public Computer(int wordsize, int memorysize, int storagesize, double speed) {
        this.wordsize = wordsize;
        this.memorysize = memorysize;
        this.storagesize = storagesize;
        this.speed = speed;

    }

    @Override
    public String toString() {
        return String.format("Wordsize: %2d Bits\nmemorysize: %4d MB\nStorageSize: %d MB\nSpeed: %.2f Ghz\n", wordsize,
                memorysize,
                storagesize,
                speed);
    }
}

class Leptop extends Computer {
    protected int length;
    protected int width;
    protected int height;
    protected double weight;

    public Leptop() {

    }

    public Leptop(int wordsize, int memorysize, int storagesize, double speed, int length, int width, int height,
            double weight) {
        super(wordsize, memorysize, storagesize, speed);
        this.length = length;
        this.height = height;
        this.width = width;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format("Lenght: %2d\nWidth: %2d\nHeight: %2d\nWeight: %.2f", length, width, height,
                        weight);
    }

}
// Write a base class Computer that contains data members of wordsize(in bits),
// memorysize (in megabytes),
// storagesize (in megabytes) and speed (in megahertz). Derive a Laptop class
// that is a kind of computer but
// also specifies the object’s length, width, height, and weight. Member
// functions for both classes should
// include a default constructor, a constructor to inialize all components and a
// function to display data
// members.