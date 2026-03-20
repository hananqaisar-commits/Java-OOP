
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Resturant shinwari = new Resturant();
        shinwari.addMenu(new MenuItem("Biryani", 270, "Special"));
        shinwari.addMenu(new MenuItem("Mutton", 4560.50, "Signature"));

        shinwari.menuitem();
        sc.close();
    }
}

class MenuItem {
    private String name;
    private double price;
    private String category;

    public MenuItem(String name, double price, String category) {

        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void setCategory(String category) {
        if (category == null || category.trim().isEmpty()) {
            System.out.println("Invalid");
        } else {
            this.category = category;
        }
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Invalid");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        if (price == 0) {
            System.out.println("Invalid");
        } else {
            this.price = price;
        }
    }

    public double getPrice() {
        return price;
    }

    public void display() {

    }

    @Override
    public String toString() {
        return "Item: " + name + " ----------> " + price + " category: " + category;
    }
}

class Resturant {

    ArrayList<MenuItem> menuitem;

    public Resturant() {
        menuitem = new ArrayList<>();
    }

    public void addMenu(MenuItem menuItem) {
        menuitem.add(menuItem);
    }

}

class Order {
    public static int orderid;
    private String customer_name;
    private double total_price;
    ArrayList<MenuItem> items;

    public Order(String customer_name, double total_price) {
        this.customer_name = customer_name;
        this.total_price = total_price;

    }

    public void setCustomer_name(String customer_name) {
        if (customer_name == null || customer_name.trim().isEmpty()) {
            this.customer_name = customer_name;
        } else {
            System.out.println("invalid");
        }
    }

    public String tostString() {
        return "Customer name: " + customer_name + "\n" + "Total price: " + total_price;
    }
}