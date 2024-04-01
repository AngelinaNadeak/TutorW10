package model;

public class Beverage implements Food {
    private String name;
    private double volume;
    private double pricePerLiter;

    public Beverage(String name, double volume, double pricePerLiter) {
        this.name = name;
        this.volume = volume;
        this.pricePerLiter = pricePerLiter;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculatePrice() {
        // Contoh perhitungan harga minuman berdasarkan volume dan harga per liter
        return volume * pricePerLiter;
    }
}
