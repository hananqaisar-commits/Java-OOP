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
            System.out.print("\nEnter book " + (i + 1) + " title: ");
            books[i].title = sc.nextLine();

            // input book author & nationallity
            System.out.print("Enter book " + (i + 1) + " author: ");
            books[i].auth.author = sc.nextLine();
            System.out.print("Enter book author nationallity: ");
            books[i].auth.nationallity = sc.nextLine();

            // input book price
            System.out.print("Enter book " + (i + 1) + " price: ");
            double prices = sc.nextDouble();
            sc.nextLine(); // this line flush the \n in buffer it prevent me from bug
            books[i].setPrice(prices);
        }
        // output
        System.out.print("\n=== Library: City Library ===\n");
        for (int i = 0; i < books.length; i++) {
            books[i].displayInfo();
        }
        // check the expensive book
        System.out.print("\nMost expensive book: " + Book.expensive(books));// static belongs to class so, i can call it
                                                                            // directly from Book class name Book

        // close the input scanner
        sc.close();
    }
}

class Book {

    public String title;
    private double price;

    public Author auth;// declaring author class as my feild

    public Book() {
        auth = new Author();// creating object of feild class
    }

    public void setauthor(String author, String nationallity) {
        this.auth.author = author;// this.auth.author mean this call public feild auth(which is itself class) and
                                  // auth.author call their public feild author from auth class
        this.auth.nationallity = nationallity;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
        return;
    }

    public double getPrice() {
        return price;
    }

    public void setNationallity(String n) {
        this.auth.nationallity = n;
    }

    public String getNationallity() {
        return this.auth.nationallity;
    }

    public void displayInfo() {
        // Title: Clean Code | Price: $45.0 | Author: Robert Martin (American)

        System.out
                .println("Title: " + title + " | Price: " + price + " | Author: " + auth.author + " ("
                        + this.auth.nationallity
                        + ")");
    }

    public static String expensive(Book books[]) {
        double expensive = books[0].getPrice();// it assingn 1st book price to expensive and then compare with other
        int index = 0;
        ;
        for (int i = 0; i < 5; i++) {
            if (books[i].price > expensive) {
                expensive = books[i].price;
                index = i;
            }
        }
        return books[index].title + " cost $" + expensive;
    }
}

// Always remember the rule non-static feilds cannont acces in static methods
// mean Static methods cannot directly access instance variables without an
// object.
class Author {
    public String author;
    public String nationallity;
}