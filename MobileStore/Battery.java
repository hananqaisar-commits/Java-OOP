package MobileStore;

class Battery {
    private int capacity;// in mAH
    private String type;// e.g: "Li-ion"

    public Battery() {
        capacity = 4000;
        type = "Li-ion";

    }

    public Battery(int capacity, String type) {
        this.type = type;
        this.capacity = capacity;
    }

    public Battery(Phone deepCopy) {
        if (deepCopy.battery != null) {
            this.capacity = deepCopy.battery.capacity;
            this.type = deepCopy.battery.type;
        } else {
            this.capacity = 4000;
            this.type = "Li-ion";
        }
    }

    public void setCapacity(int capacity) {
        if (capacity < 0) {
            System.out.println("Invalid ");
        } else {
            this.capacity = capacity;
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setType(String type) {
        if (type == null || type.trim().isEmpty()) {
            System.out.println("Invalid");
        } else {
            this.type = type;
        }
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type + " " + capacity;
    }
}
