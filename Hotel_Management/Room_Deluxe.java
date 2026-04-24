class Room_Deluxe extends Booking {
    private double ratepernight;
    private double servicecharge;

    public Room_Deluxe(String guestName, int nights, double ratepernight, double servicecharge) {
        super(guestName, nights);
        this.ratepernight = ratepernight;
        this.servicecharge = servicecharge;
    }

    public void setRatepernight(double ratepernight) {
        this.ratepernight = ratepernight;
    }

    public double getRatepernight() {
        return ratepernight;
    }

    public void setServicecharge(double servicecharge) {
        this.servicecharge = servicecharge;
    }

    public double getServicecharge() {
        return servicecharge;
    }

    @Override
    public void displayBooking() {
        super.displayBooking();
        System.out.println("Total cost: " + this.calculateTotalCost());
    }

    @Override
    public double calculateTotalCost() {
        return (super.calculateTotalCost() * ratepernight) + servicecharge;
    }
}