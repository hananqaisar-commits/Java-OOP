import java.util.Scanner;

public class library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book b1 = new Book();

                 System.out.print("Enter choice:\n1.Borrow\n2.Return");
int choice = sc.nextInt();

        switch (choice) {
            case 1:
                b1.borrow();
                        b1.return;
                break;
            case 2:
                b1.borrow();
                b1.returnBook();
                break;
    }
s
        sc.close();
    }
}

class Book {
    public String title;
    public String author;
    private String ISBN;

    public Book() {
        
    }

    public void borrow() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter borrower name: ");
        String borrower = sc.nextLine();
        System.out.println("Enter book name: ");
        String book = sc.nextLine();

    }

    public void returnBook() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter borrower name: ");
        String borrower = sc.nextLine();
        System.out.println("Enter book name: ");
        String book = sc.nextLine();
    }

}