package model;

public final class OnlineCourse extends DigitalContent {
    private String instructor;
    private Difficulty difficulty;
    private double estimatedHours;

    public OnlineCourse(String id, String title, String author, double basePrice,
                        String instructor, Difficulty difficulty, double estimatedHours) {
        super(id, title, author, basePrice);
        this.instructor = instructor;
        this.difficulty = difficulty;
        this.estimatedHours = estimatedHours;
    }

    @Override
    public String getContentType() {
        return "OnlineCourse";
    }

    @Override
    public String getDescription() {
        return String.format("OnlineCourse '%s' by %s, Difficulty: %s, Estimated Hours: %.1f",
                title, instructor, difficulty, estimatedHours);
    }

    public boolean getCertificationEligible() {
        return estimatedHours > 10;
    }
}
