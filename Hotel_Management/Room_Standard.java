class Room_Standard extends Booking {
    private double ratepernight;

    public Room_Standard(String guestName, int nights, double ratepernight) {
        super(guestName, nights);
        this.ratepernight = ratepernight;

    }

    public void setRatepernight(double ratepernight) {
        this.ratepernight = ratepernight;
    }

    public double getRatepernight() {
        return ratepernight;
    }

    @Override
    public void displayBooking() {
        super.displayBooking();
        System.out.println("Total cost: " + this.calculateTotalCost());
    }

    @Override
    public double calculateTotalCost() {
        return super.calculateTotalCost() * ratepernight;
    }
}