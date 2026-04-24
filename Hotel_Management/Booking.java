class Booking {
    private int bookingId;
    private String guestName;
    private int nights;
    private static int totalBookings;
    final double TAX_RATE = 0.10;
    double ratepernight;

    Booking(String guestName, int nights) {
        this.bookingId = ++totalBookings;
        this.guestName = guestName;
        this.nights = nights;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public int getNights() {
        return nights;
    }

    public void displayBooking() {
        System.out.println("Guest name: " + getGuestName());
        System.out.println("Nights: " + getNights());
        System.out.println("Booking ID: " + getBookingId());

    }

    public double calculateTotalCost() {
        double baseCost = nights;
        double tax = ratepernight * (baseCost);
        return baseCost + tax;
    }
}
