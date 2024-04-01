package model;

public class Pizza implements Food {
    private String flavor;
    private int diameter;

    public Pizza(String flavor, int diameter) {
        this.flavor = flavor;
        this.diameter = diameter;
    }

    @Override
    public String getName() {
        return "Pizza (" + flavor + ")";
    }

    @Override
    public double calculatePrice() {
        // Contoh perhitungan harga pizza berdasarkan diameter dan jenis topping
        double basePrice = 5.0; // Harga dasar
        double toppingPrice = 1.0; // Harga tambahan untuk setiap topping

        double totalPrice = basePrice + (toppingPrice * diameter);
        return totalPrice;
    }
}
