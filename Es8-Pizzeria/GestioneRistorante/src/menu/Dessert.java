package menu;

public class Dessert implements MenuItem {
    private String name;
    private double basePrice;
    private boolean hasExtraTopping;

    public Dessert(String name, double basePrice, boolean hasExtraTopping) {
        this.name = name;
        this.basePrice = basePrice;
        this.hasExtraTopping = hasExtraTopping;
    }

    @Override
    public double calculatePrice() {
        return hasExtraTopping ? basePrice + 1.5 : basePrice;
    }

    @Override
    public String getDescription() {
        return "Dessert " + name + (hasExtraTopping ? " con topping extra" : "");
    }

    @Override
    public int getPreparationTime() {
        return 5;
    }

    public String getName() {
        return name;
    }
}
