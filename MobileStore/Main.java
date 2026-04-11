package MobileStore;

public class Main {
    public static void main(String[] args) {

        Store MobileOyee = new Store("Mobile Oyeeee", "Pakistan");

        Phone Samsung = new Phone("Samsung", "A15", 435933.90);
        Phone Oppo = new Phone("Oppo", "F12", 34500.50);
        Phone Apple = new Phone();
        Apple.setBrand("Apple");
        Apple.setModel("17 Pro MAX");
        Apple.setPrice(560000);
        Phone Nokia = new Phone("Nokia", "3310", 3500);
        Phone Redmi1 = new Phone("Redmi", "Note 10 Pro", 43000.99);
        Phone Redmi2 = new Phone(Redmi1);
        Phone Redmi3 = new Phone(Redmi1);
        Phone Redmi4 = new Phone(Redmi3);

        MobileOyee.display();
        MobileOyee.addPhone(Samsung);
        MobileOyee.addPhone(Oppo);
        MobileOyee.addPhone(Apple);
        MobileOyee.addPhone(Redmi1);
        MobileOyee.addPhone(Nokia);
        MobileOyee.addPhone(Redmi2);
        MobileOyee.addPhone(Redmi3);
        MobileOyee.addPhone(Redmi4);
        System.out.println(MobileOyee.phones);// it will print all available mobiles of store in list

        MobileOyee.count();// give me mobile in this store

        Store Mobile_World = new Store("Mobile World", "USA");
        Mobile_World.display();
        Mobile_World.addPhone(Apple);
        Mobile_World.addPhone(Apple);
        Mobile_World.addPhone(Redmi1);
        System.out.println(Mobile_World.phones);
        Mobile_World.count();// give me mobile count in thos store

        Store.totalmobile();// Phones in all stores

    }
}