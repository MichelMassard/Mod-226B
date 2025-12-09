package menu;

import java.util.ArrayList;

public class Pizza implements MenuItem {
    private String name;
    private double basePrice;
    private ArrayList<String> toppings;

    public Pizza(String name, double basePrice, ArrayList<String> toppings) {
        this.name = name;
        this.basePrice = basePrice;
        this.toppings = toppings;
    }

    @Override
    public double calculatePrice() {
        return basePrice + toppings.size() * 0.5;
    }

    @Override
    public String getDescription() {
        return "Pizza " + name + " con: " + String.join(", ", toppings);
    }

    @Override
    public int getPreparationTime() {
        return 15 + toppings.size() * 2;
    }

    public String getName() {
        return name;
    }
}
