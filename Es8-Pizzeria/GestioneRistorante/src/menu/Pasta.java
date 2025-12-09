package menu;

public class Pasta implements MenuItem {
    private String name;
    private double price;
    private boolean isGlutenFree;

    public Pasta(String name, double price, boolean isGlutenFree) {
        this.name = name;
        this.price = price;
        this.isGlutenFree = isGlutenFree;
    }

    @Override
    public double calculatePrice() {
        return isGlutenFree ? price * 1.06 : price;
    }

    @Override
    public String getDescription() {
        return "Pasta " + name + (isGlutenFree ? " (senza glutine)" : "");
    }

    @Override
    public int getPreparationTime() {
        return 12;
    }

    public String getName() {
        return name;
    }
}
