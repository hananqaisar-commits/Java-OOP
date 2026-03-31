import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book Java = new Book();
        System.out.println("Enter Book Details:");
        System.out.print("Title: ");
        Java.setTitle(sc.nextLine());

        System.out.print("Price: ");
        Java.setPrice(sc.nextDouble());

        System.out.print("Pages: ");
        Java.setPages(sc.nextInt());

        Tape t = new Tape();
        sc.nextLine();

        System.out.println("\nEnter Tape Details:");
        System.out.print("Title: ");
        t.setTitle(sc.nextLine());

        System.out.print("Price: ");
        t.setPrice(sc.nextDouble());

        System.out.print("Playing Time (minutes): ");
        t.setTime(sc.nextDouble());

        System.out.println("\n===== Book Details =====");
        Java.display();

        System.out.println("\n===== Tape Details =====");
        t.display();

        sc.close();
    }
}

class Publication {
    protected String title;
    protected double price;

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            System.out.println("Invalid");
        } else {
            this.title = title;
        }
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Invalid");
        } else {
            this.price = price;
        }
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}

class Book extends Publication {
    private int pages;

    public void setPages(int pages) {
        if (pages < 0) {
            System.out.println("Invalid");
        } else {
            this.pages = pages;
        }
    }

    public int getPages() {
        return pages;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Pages: " + pages);
    }
}

class Tape extends Publication {
    private double time;

    public void setTime(double time) {
        if (time < 0) {
            System.out.println("Invlaid");

        } else {
            this.time = time;
        }
    }

    public double getTime() {
        return time;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Playing Time: " + time + " minutes");
    }
}
