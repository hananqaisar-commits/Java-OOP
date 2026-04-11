package Library_Management_System;

public class Main {
    public static void main(String[] args) {

        Library1 l1 = new Library1("Quaid-e-Azam");
        Book b1 = new Book("C++", "Hanan", 768);
        Book b2 = new Book("C", "Waqar", 988);
        Magazine m1 = new Magazine("N", "Ahmad", 21);

        l1.setLibItems(b1);
        l1.setLibItems(b2);
        l1.setLibItems(m1);

        System.out.println(l1);
        l1.display();

    }

}