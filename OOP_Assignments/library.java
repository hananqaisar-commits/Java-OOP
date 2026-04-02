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
            books[i].setTitle(sc.nextLine());

            // input book author & nationallity
            System.out.print("Enter book " + (i + 1) + " author: ");
            books[i].auth.setauthor(sc.nextLine());
            System.out.print("Enter book author nationallity: ");
            books[i].auth.setNationallity(sc.nextLine());

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

    private String title;
    private double price;

    public Author auth;// declaring author class as my feild

    public Book() {
        auth = new Author();// creating object of feild class
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {// it is checking that author is null if it
                                                      // is false then it goes to second condition and in
                                                      // this condition author.trim().isEmpty()--->
                                                      // .trim() clears the spaces before and after of
                                                      // string and isEmpty will return true or false
                                                      // depends upon string behaviour
            System.out.println("Enter valid input");
        } else {
            this.title = title;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price! Must be greater than 0.");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setNationallity(String n) {
        this.auth.setNationallity(n);
    }

    public String getNationallity() {
        return this.auth.getNationallity();
    }

    public void displayInfo() {
        // Title: Clean Code | Price: $45.0 | Author: Robert Martin (American)
        System.out.println("Title: " + title + " | Price: " + price + " | Author: " + auth.getauthor() + " ("
                + this.auth.getNationallity() + ")");
    }

    public static String expensive(Book books[]) {
        if (books == null || books.length == 0 || books[0] == null) {// null check to prevent crash
            return "No books available.";
        }
        double expensive = books[0].getPrice();// it assigns 1st book price to expensive and then compare with other
        int index = 0;
        for (int i = 0; i < 5; i++) {
            if (books[i].getPrice() > expensive) {// using getter instead of direct field access
                expensive = books[i].getPrice();
                index = i;
            }
        }
        return books[index].getTitle() + " cost $" + expensive;
    }
}

// Always remember the rule non-static feilds cannont acces in static methods
// mean Static methods cannot directly access instance variables without an
// object.
class Author {
    private String author;
    private String nationallity;

    public void setauthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            System.out.println("Enter valid input");
        } else {
            this.author = author;
        }
    }

    public String getauthor() {
        return author;
    }

    public void setNationallity(String nationallity) {
        if (nationallity == null || nationallity.trim().isEmpty()) {
            System.out.println("Enter valid input");
        } else {
            this.nationallity = nationallity;
        }
    }

    public String getNationallity() {
        return nationallity;
    }
}