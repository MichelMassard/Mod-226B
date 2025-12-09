package model;

public interface Purchasable {
    double calculatePrice();
    void applyDiscount(double percentage);

    static double getDefaultTaxRate() {
        return 0.22;
    }

    default double getPriceWithTax() {
        return calculatePrice() * (1 + getDefaultTaxRate());
    }
}
