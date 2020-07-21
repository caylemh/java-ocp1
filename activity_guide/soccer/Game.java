package soccer;
import utility.GameUtils;
import java.lang.StringBuilder;

public class Game {   
    public Team homeTeam;
    public Team awayTeam;
    public Goal[] goals;  
    
    public void playGame(int maxGoals) {
        int numberOfGoals = (int)(Math.random() * (maxGoals + 1));
        Goal[] theGoals = new Goal[numberOfGoals];
        //System.out.println(theGoals.length);
        this.goals = theGoals;
        GameUtils.addGameGoals(this);
    }

    public void playGame() {
        playGame(6);
    }

    public String getDescription() {
        StringBuilder returnString = new StringBuilder();
        for (Goal currGoal: this.goals) {
            returnString.append("Goal scored after "
            + currGoal.theTime + " mins by "
            + currGoal.thePlayer.playerName + " of "
            + currGoal.theTeam.teamName +
              "\n");
        }
        return returnString.toString();
    }

}

