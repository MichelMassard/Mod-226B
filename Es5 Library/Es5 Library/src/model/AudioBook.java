package model;

public class AudioBook extends DigitalContent {
    private String narrator;
    private int duration;
    private String language;

    public AudioBook(String id, String title, String author, double basePrice,
                     String narrator, int duration, String language) {
        super(id, title, author, basePrice);
        this.narrator = narrator;
        this.duration = duration;
        this.language = language;
    }

    @Override
    public String getContentType() {
        return "AudioBook";
    }

    @Override
    public String getDescription() {
        return String.format("AudioBook '%s' by %s, Narrator: %s, Duration: %s, Language: %s",
                title, author, narrator, getFormattedDuration(), language);
    }

    public String getFormattedDuration() {
        int hours = duration / 60;
        int minutes = duration % 60;
        return String.format("%02d:%02d", hours, minutes);
    }

    @Override
    public double calculatePrice() {
        double base = super.calculatePrice();
        if (duration > 8 * 60) {
            return base * 1.20;
        }
        return base;
    }
}

