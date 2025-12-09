package samt.ch.sportournament;

import java.util.Objects;

public class Team implements Comparable<Team> {
    private String name;
    private String school;
    private String sport;
    private int score;

    public Team(String name, String school, String sport, int score) {
        this.name = name;
        this.school = school;
        this.sport = sport;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }

    public String getSport() {
        return sport;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int diff) {
        this.score += diff;
    }

    @Override
    public int compareTo(Team other) {
        int scoreCompare = Integer.compare(other.score, this.score);
        if (scoreCompare != 0) return scoreCompare;
        return this.name.compareTo(other.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Team)) return false;
        Team team = (Team) o;
        return name.equals(team.name) && school.equals(team.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, school);
    }

    @Override
    public String toString() {
        return String.format("%s (%s) - Sport: %s - Punti: %d", name, school, sport, score);
    }
}
