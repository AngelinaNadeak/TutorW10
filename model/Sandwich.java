package model;

public class Sandwich implements Food {
    private String filling;
    private String breadType;

    public Sandwich(String filling, String breadType) {
        this.filling = filling;
        this.breadType = breadType;
    }

    @Override
    public String getName() {
        return "Sandwich (" + filling + ")";
    }

    @Override
    public double calculatePrice() {
        // Contoh perhitungan harga sandwich berdasarkan jenis isian dan jenis roti
        double basePrice = 3.0; // Harga dasar
        double fillingPrice = 0.5; // Harga tambahan untuk isian premium
        double breadPrice = 0.75; // Harga tambahan untuk roti premium

        double totalPrice = basePrice;
        // Harga tambahan jika isian atau roti adalah premium
        if (filling.equals("Premium")) {
            totalPrice += fillingPrice;
        }
        if (breadType.equals("Premium")) {
            totalPrice += breadPrice;
        }
        return totalPrice;
    }
}
