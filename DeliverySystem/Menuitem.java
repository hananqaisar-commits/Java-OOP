package Java_OOP.DeliverySystem;

import java.util.Scanner;

class Menuitem {
    private String name;
    private String category;
    private float price;

    public Menuitem() {
        name = "Unknown";
        category = "Unknown";
        price = 0.0;
    }

    public void setCategory(String category) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Invalid");
        } else {
            this.category = category;
        }
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Invalid");
        } else {
            this.name = name;
        }
    }

    public void setPrice(float price) {
        if (price == 0.0) {
            System.out.println("Invalid");
        } else {
            this.price = price;
        }
    }

    public float getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }
}