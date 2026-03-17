package MobileStore;

import java.util.ArrayList;

class Store {
    private String name, location;
    private static int countMobile;
    ArrayList<Phone> phones;

    public Store(String name, String location) {
        this.name = name;
        this.location = location;
        phones = new ArrayList<>();// Now each phones arraylist belongs to each Store
    }

    public void addPhone(Phone p) {

        phones.add(p);
        ++countMobile;
    }

    public static void setCountMobile(int countMobile) {
        if (countMobile <= 0) {
            System.out.println("Soory, No mobile available ");
        } else {
            Store.countMobile = countMobile;
        }
    }

    public static int getCountMobile() {
        return countMobile;
    }

    public void display() {
        System.out.print("======Welcome======\n");
        System.out.println("Store: " + name);
        System.out.println("Location: " + location);

    }

    public static void totalmobile() {
        System.out.println("\nTotal Mobiles available in store: " + Store.getCountMobile());
    }

}