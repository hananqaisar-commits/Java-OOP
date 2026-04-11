package MobileStore;

class Phone {
    private String brand, model;
    private double price;
    Battery battery;

    public Phone() {
        battery = new Battery();
    }

    public Phone(String brand, String model, double price) {

        battery = new Battery();
        this.brand = brand;
        this.model = model;
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid");
        }
    }

    public Phone(Phone other) {// this is copy constructor

        this.battery = new Battery();// deep copy constructor
        this.brand = other.brand;
        this.model = other.model;
        if (other.price > 0) {
            this.price = other.price;
        } else {
            System.out.println("Invalid");
        }
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.trim().isEmpty()) {
            System.out.println("Invalid");

        } else {
            this.brand = brand;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            System.out.println("Invalid");

        } else {
            this.model = model;
        }
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return brand + " " + model + " " + " price: " + price + " Battery type: " + battery.getType()
                + " Capacity(mAH): " + battery.getCapacity() + "\n";
    }
}