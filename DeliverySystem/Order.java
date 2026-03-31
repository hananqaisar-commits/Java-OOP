import java.util.ArrayList;

class Order {
    private String CustomerName;
    private static int orderid;
    private double totalprice;
    ArrayList<Menuitem> items = new ArrayList<>();

    public Order(String CustomerName, String items) {
        {
            this.CustomerName = CustomerName;
            
            ++orderid;
        }
    }

    public void setCustomerName(String customerName) {
        if (customerName == null || customerName.trim().isEmpty()) {
            System.out.println("Invalid");
        } else {
            CustomerName = customerName;
        }
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setItems(ArrayList<Menuitem> items) {
        if (items == null) {
            System.out.println("No item is selected");

        } else {
            this.items = items;
        }
    }

    public ArrayList<Menuitem> getItems() {
        return items;
    }

    public void setTotalprice(double totalprice) {
        if (totalprice == 0.0) {
            System.out.println("No order yet");

        } else {
            this.totalprice = totalprice;
        }
    }

    public double getTotalprice() {
        return totalprice;
    }
}