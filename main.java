import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Invoice i1 = new Invoice();
        // Invoice i1 = new Invoice("Han7631", " Angle", 5, 545.000);//this can also
        // used in my code

        System.out.println("Enter quantity to buy: ");
        int quantity = sc.nextInt();

        i1.setquantity(quantity);
        i1.setppr(440.90);
        i1.setNumber("101101");
        i1.setDescription(
                "Instruction (Read carefully)\nIt is used for repairing computer.Use it in computers only otherwise it will damage.");

        System.out.println("Tool number: " + i1.getNumber());
        System.out.println("Quantity to buy: " + i1.getquantity());
        System.out.println("Price per unit: " + i1.getppr());
        System.out.println(i1.getDescription());

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

    Invoice() {// default constructor

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
        if (quantity > 0) {
            this.quantity = quantity;
        } else
            quantity = 0;
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
