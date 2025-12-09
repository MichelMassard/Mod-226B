package model;

public class EBook extends DigitalContent {
    private Genre genre;
    private int pageCount;
    private boolean isIllustrated;

    public EBook(String id, String title, String author, double basePrice,
                 Genre genre, int pageCount, boolean isIllustrated) {
        super(id, title, author, basePrice);
        this.genre = genre;
        this.pageCount = pageCount;
        this.isIllustrated = isIllustrated;
    }

    @Override
    public String getContentType() {
        return "EBook";
    }

    @Override
    public String getDescription() {
        return String.format("EBook '%s' by %s, Genre: %s, Pages: %d, Illustrated: %b",
                title, author, genre, pageCount, isIllustrated);
    }

    public double getReadingTime() {
        return pageCount * 1.0;
    }
}

