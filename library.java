import java.util.Scanner;

public class library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book books[] = new Book[5];// Here i created array only array.It will give error if i did't create objects
                                   // of this array.
        for (int i = 0; i < books.length; i++) {
            books[i] = new Book();// here i am creating object of array and it is most important step
        }

        for (int i = 0; i < books.length; i++) {
            // input book title
            System.out.println("Enter book " + (i + 1) + " title: ");
            books[i].title = sc.nextLine();

            // input book author
            System.out.println("Enter book " + (i + 1) + " author: ");
            books[i].author = sc.nextLine();

            // input book price
            System.out.println("Enter book " + (i + 1) + " price: ");
            double prices = sc.nextDouble();
            books[i].setPrice(prices);
        }

        for (int i = 0; i < books.length; i++) {
            books[i].displayInfo();
        }
        // check the expensive book
        System.out.println("\nMost expensive book: " + Book.expensive(books));

        // close the input scanner
        sc.close();
    }
}

class Book {
    public String author;
    public String title;
    private double price;

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void displayInfo() {
        System.out.println("\nBook title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book price: " + price);
    }

    public static double expensive(Book books[]) {
        double expensive = books[0].getPrice();// it assingn 1st book price to expensive and then compare with other
        for (int i = 0; i < 5; i++) {
            if (books[i].price > expensive) {
                expensive = books[i].price;
            }
        }
        return expensive;
    }
}

// Always remember the rule non-static feilds cannont acces in static methods
// mean Static methods cannot directly access instance variables without an
// object.