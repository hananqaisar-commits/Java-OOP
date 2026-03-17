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
        Battery redmi = new Battery();
        Phone Redmi1 = new Phone("Redmi", "Note 10 Pro", 43000.99);
        Phone Redmi2 = new Phone(Redmi1);
        Phone Redmi3 = new Phone(Redmi1);
        Phone Redmi4 = new Phone(Redmi3);
        Phone Realme = new Phone(Redmi3, redmi);

        MobileOyee.display();

        MobileOyee.addPhone(Samsung);
        MobileOyee.addPhone(Oppo);
        MobileOyee.addPhone(Apple);
        MobileOyee.addPhone(Redmi1);
        MobileOyee.addPhone(Nokia);
        MobileOyee.addPhone(Redmi2);
        MobileOyee.addPhone(Redmi3);
        MobileOyee.addPhone(Redmi4);
        MobileOyee.addPhone(Realme);

        System.out.println(MobileOyee.phones);// it will print the phones of mobileoyee store
        Store.totalmobile();// give total mobile phones in store
    }
}
