import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Invoice i1 = new Invoice("Han7631", " Angle", 5, 545.000);
        System.out.println(i1.getAmount());
        sc.close();
    }
}

class Invoice {
    String partNumber;
    String partDescription;
    int quantity;
    double ppr;
    private double amount;

    Invoice(String partNumber, String partDescription, int quantity, double ppr) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.ppr = ppr;
    }

    void setNumber(String number) {
        partNumber = number;
    }

    String getNumber() {
        return partNumber;
    }

    void setDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    String getDescription() {
        return partDescription;
    }

    void setquantity(int quantity) {
        this.quantity = quantity;
    }

    int getquantity() {
        return quantity;
    }

    void setppr(double ppr) {
        this.ppr = ppr;
    }

    double getppr() {
        return ppr;
    }

    void setAmount(double amount) {
        if (quantity > 0 && ppr > 0) {
            this.amount = quantity * ppr;
        }
    }

    double getAmount() {
        return amount;
    }
}

// (Invoice Class) Create a class called Invoice that a hardware store might use
// to represent
// an invoice for an item sold at the store. An Invoice should include four
// pieces of information as
// instance variables—a part number (type String), a part description (type
// String), a quantity of the
// item being purchased (type int) and a price per item (double). Your class
// should have a constructor
// that initializes the four instance variables. Provide a set and a get method
// for each instance variable.
// In addition, provide a method named getInvoiceAmount that calculates the
// invoice amount (i.e.,
// multiplies the quantity by the price per item), then returns the amount as a
// double value. If the
// quantity is not positive, it should be set to 0. If the price per item is not
// positive, it should be set to
// 0.0. Write a test application named InvoiceTest that demonstrates class
// Invoice’s capabilities.
