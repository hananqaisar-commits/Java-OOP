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

    public Phone(Phone phone) {// this is copy constructor

        this.battery = new Battery(phone);// deep copy constructor
        this.brand = phone.brand;
        this.model = phone.model;
        if (phone.price > 0) {
            this.price = phone.price;
        } else {
            System.out.println("Invalid");
        }
    }

    public Phone(Phone p, Battery b) {
        this.brand = p.brand;
        this.model = p.model;
        this.price = p.price;
        this.battery = new Battery(b.getCapacity(), b.getType());
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