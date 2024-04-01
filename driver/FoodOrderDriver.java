package driver;

import java.util.ArrayList;
import java.util.Scanner;
import model.*;

public class FoodOrderDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Food> foods = new ArrayList<>();
        foods.add(new Pizza("Pepperoni", 12));
        foods.add(new Sandwich("Chicken", "Whole Wheat"));

        System.out.println("Daftar Makanan:");
        for (int i = 0; i < foods.size(); i++) {
            System.out.println(i + ": " + foods.get(i).getName());
        }

        System.out.println("Pilih makanan yang ingin dipesan: ");
        int choice = scanner.nextInt();
        if (choice >= 0 && choice < foods.size()) {
            Food selectedFood = foods.get(choice);
            System.out.println("Harga " + selectedFood.getName() + ": $" + selectedFood.calculatePrice());
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }
}
