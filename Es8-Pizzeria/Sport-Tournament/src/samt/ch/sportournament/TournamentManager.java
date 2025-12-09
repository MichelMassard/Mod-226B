package samt.ch.sportournament;

import java.util.*;

public class TournamentManager {


    private List<Team> teams = new ArrayList<>();
    private Map<String, Integer> scores = new HashMap<>();


        public boolean addTeam(Team t) {
            for (Team team : teams) {
                if (team.equals(t)) {

                    if (!team.getSport().equals(t.getSport())) {
                        System.out.printf("Team %s DUPLICATO e non aggiunto al torneo di %s%n", t.getName(), t.getSport());
                        return false;
                    } else {
                        System.out.printf("Team %s DUPLICATO e non aggiunto al torneo di %s%n", t.getName(), t.getSport());
                        return false;
                    }
                }
            }
            teams.add(t);
            scores.put(t.getName(), t.getScore());
            System.out.printf("Team %s aggiunto al torneo di %s%n", t.getName(), t.getSport());
            return true;
        }

        public boolean updateScore(String teamName, int diff) {
            for (Team t : teams) {
                if (t.getName().equals(teamName)) {
                    t.addScore(diff);
                    scores.put(teamName, t.getScore());
                    System.out.printf("+ %d punti a %s!%n", diff, teamName);
                    return true;
                }
            }
            System.out.printf("Team %s non trovato!%n", teamName);
            return false;
        }

        public void printTeamsSortedByNatural() {
            System.out.println("\n*** Squadre in ordine naturale (punteggio decrescente) ***");
            List<Team> sorted = new ArrayList<>(teams);
            Collections.sort(sorted);
            sorted.forEach(System.out::println);
        }

        public void printTeamsSortedBySchool() {
            System.out.println("\n*** Squadre ordinate per scuola ***");
            List<Team> sorted = new ArrayList<>(teams);
            sorted.sort(Comparator
                    .comparing(Team::getSchool)
                    .thenComparing(Team::getName));
            sorted.forEach(System.out::println);
        }

        public void printTeamsSortedBySport() {
            System.out.println("\n*** Squadre ordinate per sport ***");
            List<Team> sorted = new ArrayList<>(teams);
            sorted.sort(Comparator
                    .comparing(Team::getSport)
                    .thenComparing(Comparator.comparingInt(Team::getScore).reversed()));
            sorted.forEach(System.out::println);
        }

        public void printScores() {
            System.out.println("\n*** Punteggi attuali ***");
            System.out.println(scores);
        }
    }

