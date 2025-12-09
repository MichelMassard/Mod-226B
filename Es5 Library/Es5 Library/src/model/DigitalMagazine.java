package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DigitalMagazine extends DigitalContent {
    private int issueNumber;
    private LocalDate publicationDate;
    private String category;

    public DigitalMagazine(String id, String title, String author, double basePrice,
                           int issueNumber, LocalDate publicationDate, String category) {
        super(id, title, author, basePrice);
        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;
        this.category = category;
    }

    @Override
    public String getContentType() {
        return "DigitalMagazine";
    }

    @Override
    public String getDescription() {
        return String.format("DigitalMagazine '%s', Issue %d, Published on %s, Category: %s",
                title, issueNumber, publicationDate, category);
    }

    public boolean isRecentIssue() {
        long daysSincePublication = ChronoUnit.DAYS.between(publicationDate, LocalDate.now());
        return daysSincePublication <= 30;
    }

    @Override
    public double calculatePrice() {
        double base = super.calculatePrice();
        if (isRecentIssue()) {
            return base * 1.10;
        }
        return base;
    }
}

