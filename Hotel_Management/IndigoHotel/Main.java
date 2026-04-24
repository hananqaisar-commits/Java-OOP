import java.util.ArrayList;

public class Composition_Aggregation {
    public static void main(String[] args) {

        // Create Hotel
        Hotel indigo = new Hotel("Indigo");

        // Create Rooms
        Room deluxe = new Room("D101");
        Room standard = new Room("S201");

        // Add Amenities to Rooms (Composition)
        deluxe.addAmenity("AC");
        deluxe.addAmenity("TV");

        standard.addAmenity("Bed");
        standard.addAmenity("Refrigerator");

        // Add Rooms to Hotel (Aggregation)
        indigo.addRoom(deluxe);
        indigo.addRoom(standard);

        // Display Hotel info
        indigo.display();
    }
}

// Hotel class (Aggregation with Rooms)
class Hotel {
    private String name;
    private ArrayList<Room> rooms;

    public Hotel(String name) {
        this.name = name;
        rooms = new ArrayList<>();
    }

    public void addRoom(Room r) {
        rooms.add(r);
    }

    public void display() {
        System.out.println("Hotel: " + name);
        for (Room r : rooms) {
            System.out.println("  Room: " + r.getRoomNumber());// r.getnumber bcz it is acessing from arraylist
            r.displayAmenities();
        }
    }
}

// Room class (Composition with Amenities)
class Room {
    private String roomNumber;
    private ArrayList<Amenities> amenities;

    public Room(String roomNumber) {
        this.roomNumber = roomNumber;
        amenities = new ArrayList<>();
    }

    public void addAmenity(String name) {
        amenities.add(new Amenities(name));
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void displayAmenities() {
        for (Amenities a : amenities) {
            System.out.println("    Amenity: " + a.getName());
        }
    }
}

// Amenities class
class Amenities {
    private String name;

    public Amenities(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// simple main function mei pehlay hotel banaya indigo name ka hotel
// phr rooms bana lia hotel ke lia
// then indigo mei add kia room type e.g: Delux,Standard
// then add aminites in every type of room in hotel
// last pr rooms ko hotel mei add kr dia..