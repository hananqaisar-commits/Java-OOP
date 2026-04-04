package University_Staff_Management;

public class Main {
    public static void main(String[] args) {
        System.out.println("========Staff Details========");

        Employee e1 = new Employee("Arslan", 18, "FA26", 45670.0);
        AdminStaff Hanan = new AdminStaff("Hanan Qaisar", 18, "BSE-187", 89000.95, "CEO", 2);
        System.out.println(e1);
        System.out.println(Hanan);
    }
}
