package Library_Management_System;

import java.util.ArrayList;

class Library1 {
    protected String LibName;
    ArrayList<LibraryItem> items;

    public Library1(String LibName) {
        this.LibName = LibName;
        this.items = new ArrayList<>();
    }

    public void setLibItems(LibraryItem l1) {
        this.items.add(l1);
    }

    public ArrayList<LibraryItem> getLibItems() {
        return items;
    }

    public void display() {
        for (LibraryItem item : items) {
            System.out.println(item.toString());
        }
    }

    public String toString() {
        return "<-===-" + LibName + "-===->\n";
    }
}