public class Main {
    public static void main(String[] args) {
        System.out.println("=========Menu=========");
        Resturant HN = new Resturant("Islamabad", 9.7, "HN FOODS");
        HN.setMenu(new Menuitem("Heer Ghost", "Special Masala", 43500.90));
        HN.setMenu(new Menuitem("Ranjha Ghost", "Special", 41500.90));

        Order o1 = new Order("Hanan Qaisar", items.getName());
        System.out.println(HN);
    }
}
