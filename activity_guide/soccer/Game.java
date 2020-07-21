package soccer;
import utility.GameUtils;
import java.lang.StringBuilder;

public class Game {   
    private Team homeTeam;
    private Team awayTeam;
    private Goal[] goals;

    public Game(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public void playGame(int maxGoals) {
        int numberOfGoals = (int)(Math.random() * (maxGoals + 1));
        Goal[] theGoals = new Goal[numberOfGoals];
        //System.out.println(theGoals.length);
        this.setGoals(theGoals);
        GameUtils.addGameGoals(this);
    }

    /* Practice 8-3 Overloading Methods */
    public void playGame() {
        playGame(6);
    }

    public String getDescription() {
        // Keeping score for the winning team
        int homeTeamGoals = 0;
        int awayTeamGoals = 0;

        StringBuilder returnString = new StringBuilder();

        // Print the fixtures
        returnString.append(homeTeam.getTeamName() + " vs. " + awayTeam.getTeamName() + "\n");

        for (Goal currGoal: this.getGoals()) {
            if(currGoal.getTheTeam() == homeTeam) {
                homeTeamGoals++;
                homeTeam.incGoalsTotal(1);
            } else {
                awayTeamGoals++;
                awayTeam.incGoalsTotal(1);
            }

            returnString.append("Goal scored after "
            + currGoal.getTheTime() + " mins by "
            + currGoal.getThePlayer().getPlayerName() + " of "
            + currGoal.getTheTeam().getTeamName() +
              "\n");
        }

        // Determining the winning team
        if(homeTeamGoals == awayTeamGoals) {
            returnString.append("\t---- It's a draw!!!");
            homeTeam.incPointsTotal(1);
            awayTeam.incPointsTotal(1);
        } else if(homeTeamGoals > awayTeamGoals){
            returnString.append("\t---- " + homeTeam.getTeamName() + " win!!!");
            homeTeam.incPointsTotal(2);
        } else {
            returnString.append("\t---- " + awayTeam.getTeamName() + " win!!!");
            awayTeam.incPointsTotal(2);
        }

        returnString.append(" (" + homeTeamGoals + " - " + awayTeamGoals + ") ----\n");

        return returnString.toString();
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Goal[] getGoals() {
        return goals;
    }

    public void setGoals(Goal[] goals) {
        this.goals = goals;
    }
}

