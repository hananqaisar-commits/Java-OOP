
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Resturant shinwari = new Resturant();
        shinwari.addMenu(new MenuItem("Biryani", 270, "Special"));
        shinwari.addMenu(new MenuItem("Mutton", 4560.50, "Signature"));
        System.out.println(shinwari.menuitem);

        Order o1 = new Order();
        o1.setCustomer_name("Hanan Qaisar");
        o1.addItem("Biryani");
        o1.addItem("Mutton");

        System.out.println(o1);

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
        ++Order.orderid;

    }

    @Override
    public String toString() {
        return "Menu" + menuitem;
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
        items = new ArrayList<>();

    }

    public Order() {// default constructor
        items = new ArrayList<>();

    }

    public void setCustomer_name(String customer_name) {
        if (customer_name == null || customer_name.trim().isEmpty()) {
            System.out.println("invalid");

        } else {
            this.customer_name = customer_name;
        }
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public static int getOrderid() {
        return orderid;
    }

    public double getTotal_price() {
        double total = 0;
        for (MenuItem m : items) {
            total += m.getPrice();
        }
        return total;
    }

    public void addItem(String item) {

    }

    @Override
    public String toString() {
        return "Customer name: " + customer_name + "\n" + "Total price: " + getTotal_price();
    }
}