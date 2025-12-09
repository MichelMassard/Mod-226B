package model;

public abstract class DigitalContent implements Purchasable {
    protected String id;
    protected String title;
    protected String author;
    protected double basePrice;
    protected double currentDiscount;

    public DigitalContent(String id, String title, String author, double basePrice) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.basePrice = basePrice;
        this.currentDiscount = 0;
    }

    public abstract String getContentType();
    public abstract String getDescription();

    @Override
    public double calculatePrice() {
        return basePrice * (1 - currentDiscount / 100.0);
    }

    @Override
    public void applyDiscount(double percentage) {
        if (percentage < 0) percentage = 0;
        if (percentage > 100) percentage = 100;
        this.currentDiscount = percentage;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof DigitalContent)) return false;
        DigitalContent other = (DigitalContent) obj;
        return this.id.equals(other.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
