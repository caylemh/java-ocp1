package soccer;

import utility.PlayerDatabase;

import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class League {

    public static void main(String[] args) {
        /* Practice 8-3 */
        League theLeague = new League();

        Team[] theTeams = theLeague.createTeams("The Robins,The Crows,The Swallows", 5);
        Game[] theGames = theLeague.createGames(theTeams);

        System.out.println(theLeague.getLeagueAnnouncement(theGames));

        for(Game currGame: theGames) {
            currGame.playGame();
            System.out.println(currGame.getDescription());
        }

        theLeague.showBestTeam(theTeams);
    }  
    
    /* Practice 8-1 Using Methods */
    public Team[] createTeams(String teamNames, int teamSize) {
        PlayerDatabase playerDB = new PlayerDatabase();
        StringTokenizer teamNameTokens = new StringTokenizer(teamNames, ",");
        Team[] theTeams = new Team[teamNameTokens.countTokens()];

        for(int i=0; i<theTeams.length; i++) {
            theTeams[i] = new Team(teamNameTokens.nextToken(), playerDB.getTeam(teamSize));
        }

        return theTeams;
    }

    public Game[] createGames(Team[] theTeams) {
        ArrayList<Game> theGames = new ArrayList<>();
        int daysBetweenGames = 0;

        for(Team homeTeam: theTeams) {
            for(Team awayTeam: theTeams) {
                daysBetweenGames += 7;
                if(homeTeam != awayTeam) {
                    theGames.add(new Game(homeTeam,awayTeam, LocalDateTime.now().plusDays(daysBetweenGames)));
                }
            }
        }

        return (Game[]) theGames.toArray(new Game[1]);
    }

    public void showBestTeam(Team[] theTeams) {
        Team currBestTeam = theTeams[0];
        System.out.println("\n**** Team Points ****");

        for(Team currTeam: theTeams) {
            System.out.println("\t" + currTeam.getTeamName() + ":" +
                    currTeam.getPointsTotal() + ":" + currTeam.getGoalsTotal());
            if(currTeam.getPointsTotal() > currBestTeam.getPointsTotal()) {
                currBestTeam = currTeam;
            } else if(currTeam.getPointsTotal() == currBestTeam.getPointsTotal()) {
                if(currTeam.getGoalsTotal() > currBestTeam.getGoalsTotal()) {
                    currBestTeam = currTeam;
                }
            }
        }

        System.out.println("$$$ Winner of the league is " + currBestTeam.getTeamName() + " $$$");
    }

    public String getLeagueAnnouncement(Game[] theGames) {
        Period thePeriod =
                Period.between(theGames[0].getTheDateTime().toLocalDate(),
                theGames[theGames.length-1].getTheDateTime().toLocalDate());

        return "The League is scheduled to run for " +
                thePeriod.getMonths() + " month(s), and " +
                thePeriod.getDays() + " day(s)\n";
    }
}
