import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Booking room[] = new Booking[3];
        room[0] = new Room_Standard("Hanan", 6, 1000);
        room[1] = new Room_Deluxe("Hanan Qaisar ", 7, 1200, 5500);
        room[2] = new Room_Deluxe("Ali", 5, 1200, 5400);

        System.out.println("======Booking Details======\n");
        for (Booking booking : room) {
            booking.displayBooking();
            booking.calculateTotalCost();

            System.out.println();
        }
        sc.close();
    }
}
