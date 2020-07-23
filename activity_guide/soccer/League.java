package soccer;

import utility.PlayerDatabase;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class League {

    public static void main(String[] args) {
        /* Practice 8-3 */
        League theLeague = new League();

        Team[] theTeams = theLeague.createTeams("The Robins,The Crows,The Swallows", 5);
        Game[] theGames = theLeague.createGames(theTeams);

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

        for(Team homeTeam: theTeams) {
            for(Team awayTeam: theTeams) {
                if(homeTeam != awayTeam) {
                    theGames.add(new Game(homeTeam,awayTeam));
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
}
