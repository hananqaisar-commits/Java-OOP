package MobileStore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Represents a physical mobile store.
 * Supports adding/removing phones, searching, sorting, and statistics.
 * Uses a static counter to track total phones across all Store instances.
 */
class Store {

    // ── Fields ────────────────────────────────────────────────────────────────
    private final String       name;
    private final String       location;
    private final List<Phone>  inventory;

    /** Total phones added across ALL store instances (class-level counter) */
    private static int totalPhonesAcrossAllStores = 0;

    // ── Constructor ───────────────────────────────────────────────────────────

    public Store(String name, String location) {
        if (name     == null || name.isBlank())     throw new IllegalArgumentException("Store name cannot be blank.");
        if (location == null || location.isBlank()) throw new IllegalArgumentException("Location cannot be blank.");
        this.name      = name.trim();
        this.location  = location.trim();
        this.inventory = new ArrayList<>();
    }

    // ── Getters ───────────────────────────────────────────────────────────────

    public String       getName()      { return name; }
    public String       getLocation()  { return location; }
    public List<Phone>  getInventory() { return Collections.unmodifiableList(inventory); }
    public int          getCount()     { return inventory.size(); }
    public static int   getTotalPhonesAcrossAllStores() { return totalPhonesAcrossAllStores; }

    // ── Inventory Management ──────────────────────────────────────────────────

    /**
     * Adds a phone to inventory.
     * Allows duplicates (same model can be in stock multiple times).
     */
    public void addPhone(Phone phone) {
        if (phone == null) throw new IllegalArgumentException("Cannot add a null phone.");
        inventory.add(phone);
        totalPhonesAcrossAllStores++;
    }

    /**
     * Removes the first occurrence of a matching phone (by brand + model).
     * @return true if a phone was removed, false if not found.
     */
    public boolean removePhone(Phone phone) {
        boolean removed = inventory.remove(phone);
        if (removed) totalPhonesAcrossAllStores--;
        return removed;
    }

    // ── Search ────────────────────────────────────────────────────────────────

    /** Find all phones matching a brand (case-insensitive). */
    public List<Phone> findByBrand(String brand) {
        return inventory.stream()
                .filter(p -> p.getBrand().equalsIgnoreCase(brand))
                .collect(Collectors.toList());
    }

    /** Find all phones within a price budget (inclusive). */
    public List<Phone> findByMaxPrice(double maxPrice) {
        return inventory.stream()
                .filter(p -> p.getPrice() <= maxPrice)
                .sorted()
                .collect(Collectors.toList());
    }

    /** Find cheapest phone in this store. */
    public Optional<Phone> getCheapest() {
        return inventory.stream().min(Phone::compareTo);
    }

    /** Find most expensive phone in this store. */
    public Optional<Phone> getMostExpensive() {
        return inventory.stream().max(Phone::compareTo);
    }

    // ── Sorting ───────────────────────────────────────────────────────────────

    /** Sorts inventory in-place by price (ascending). */
    public void sortByPriceAsc()  { Collections.sort(inventory); }

    /** Sorts inventory in-place by price (descending). */
    public void sortByPriceDesc() { inventory.sort(Collections.reverseOrder()); }

    /** Sorts inventory in-place by brand name alphabetically. */
    public void sortByBrand()     { inventory.sort((a, b) -> a.getBrand().compareToIgnoreCase(b.getBrand())); }

    // ── Statistics ────────────────────────────────────────────────────────────

    public double getAveragePrice() {
        return inventory.stream().mapToDouble(Phone::getPrice).average().orElse(0);
    }

    public double getTotalInventoryValue() {
        return inventory.stream().mapToDouble(Phone::getPrice).sum();
    }

    // ── Display ───────────────────────────────────────────────────────────────

    public void display() {
        System.out.println();
        System.out.println("╔══════════════════════════════════════════════════════════════════════╗");
        System.out.printf( "║  🏪  %-64s  ║%n", name + "  —  " + location);
        System.out.println("╚══════════════════════════════════════════════════════════════════════╝");
    }

    public void displayInventory() {
        display();
        if (inventory.isEmpty()) {
            System.out.println("  (No phones in inventory)");
            return;
        }

        System.out.printf("  %-4s  %-10s  %-18s  %-14s  %-8s  %-10s  %s%n",
                "#", "Brand", "Model", "Price (PKR)", "RAM", "Storage", "Battery");
        System.out.println("  " + "─".repeat(84));

        for (int i = 0; i < inventory.size(); i++) {
            Phone p = inventory.get(i);
            System.out.printf("  %-4d  %s%n", (i + 1), p.toSummary());
        }

        System.out.println("  " + "─".repeat(84));
        System.out.printf("  Phones in store   : %d%n",  getCount());
        System.out.printf("  Average price     : PKR %,.2f%n", getAveragePrice());
        System.out.printf("  Total stock value : PKR %,.2f%n", getTotalInventoryValue());
    }

    /** Prints the global count across all Store instances */
    public static void displayGlobalStats() {
        System.out.println();
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("  📊  Global Stats");
        System.out.println("  Total phones across all stores: " + totalPhonesAcrossAllStores);
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }
}