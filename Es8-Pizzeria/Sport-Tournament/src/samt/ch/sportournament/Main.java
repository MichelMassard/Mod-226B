package samt.ch.sportournament;

public class Main {

    public static void main(String[] args) {
        TournamentManager t = new TournamentManager();
        t.addTeam(new Team("Real Madrid", "Madrid Highschool", "Calcio", 1000));
        t.addTeam(new Team("Real Sociedad", "San-Sebastian MiddleSchool", "Calcio", 800));


        t.printTeamsSortedByNatural();
        t.printTeamsSortedBySchool();
        t.printTeamsSortedBySport();

        t.updateScore("Real Madrid", 3);
        t.updateScore("Real Madrid", 6);

        t.printScores();
    }
}
