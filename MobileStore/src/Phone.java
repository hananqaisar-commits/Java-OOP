package MobileStore;

import java.util.Objects;

/**
 * Represents a mobile phone with full encapsulation,
 * a Comparable implementation for price-based sorting,
 * and a proper deep-copy constructor.
 */
class Phone implements Comparable<Phone> {

    // ── Fields ────────────────────────────────────────────────────────────────
    private String  brand;
    private String  model;
    private double  price;      // in PKR
    private int     ram;        // in GB
    private int     storage;    // in GB
    private Battery battery;

    // ── Constructors ──────────────────────────────────────────────────────────

    /** Minimal constructor – uses defaults for battery, RAM, storage */
    public Phone(String brand, String model, double price) {
        this(brand, model, price, 4, 64, new Battery());
    }

    /** Full constructor */
    public Phone(String brand, String model, double price,
                 int ram, int storage, Battery battery) {
        setBrand(brand);
        setModel(model);
        setPrice(price);
        setRam(ram);
        setStorage(storage);
        this.battery = (battery != null) ? new Battery(battery) : new Battery();
    }

    /** Default constructor */
    public Phone() {
        this("Unknown", "Unknown", 1.0);
    }

    /** Deep-copy constructor */
    public Phone(Phone other) {
        Objects.requireNonNull(other, "Source phone cannot be null.");
        this.brand   = other.brand;
        this.model   = other.model;
        this.price   = other.price;
        this.ram     = other.ram;
        this.storage = other.storage;
        this.battery = new Battery(other.battery);   // deep copy
    }

    // ── Setters / Getters ─────────────────────────────────────────────────────

    public void setPrice(double price) {
        if (price <= 0) throw new IllegalArgumentException("Price must be positive.");
        this.price = price;
    }
    public double getPrice() { return price; }

    public void setBrand(String brand) {
        if (brand == null || brand.isBlank())
            throw new IllegalArgumentException("Brand cannot be blank.");
        this.brand = brand.trim();
    }
    public String getBrand() { return brand; }

    public void setModel(String model) {
        if (model == null || model.isBlank())
            throw new IllegalArgumentException("Model cannot be blank.");
        this.model = model.trim();
    }
    public String getModel() { return model; }

    public void setRam(int ram) {
        if (ram <= 0) throw new IllegalArgumentException("RAM must be positive.");
        this.ram = ram;
    }
    public int getRam() { return ram; }

    public void setStorage(int storage) {
        if (storage <= 0) throw new IllegalArgumentException("Storage must be positive.");
        this.storage = storage;
    }
    public int getStorage() { return storage; }

    public Battery getBattery() { return battery; }

    // ── Comparable: sort by price ascending ───────────────────────────────────
    @Override
    public int compareTo(Phone other) {
        return Double.compare(this.price, other.price);
    }

    // ── Equality: brand + model uniquely identify a phone ─────────────────────
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Phone other)) return false;
        return brand.equalsIgnoreCase(other.brand) && model.equalsIgnoreCase(other.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand.toLowerCase(), model.toLowerCase());
    }

    // ── Display ───────────────────────────────────────────────────────────────

    /** Compact one-line summary */
    public String toSummary() {
        return String.format("%-10s %-18s PKR %,-12.2f  %dGB RAM  %dGB Storage  [%s]",
                brand, model, price, ram, storage, battery);
    }

    @Override
    public String toString() {
        return toSummary();
    }
}