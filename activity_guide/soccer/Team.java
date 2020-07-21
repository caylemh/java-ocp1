package soccer;

public class Team {
    private String teamName;
    private Player[] playerArray;
    private int pointsTotal;
    private int goalsTotal;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public Team(Player[] playerArray) {
        this.playerArray = playerArray;
    }

    public void incGoalsTotal(int goals) {
        this.goalsTotal = this.goalsTotal + goals;
    }

    public void incPointsTotal(int pointsTotal) {
        this.pointsTotal += pointsTotal;
    }

    public int getGoalsTotal() {
        return goalsTotal;
    }

    public void setGoalsTotal(int goalsTotal) {
        this.goalsTotal = goalsTotal;
    }


    public int getPointsTotal() {
        return pointsTotal;
    }

    public void setPointsTotal(int pointsTotal) {
        this.pointsTotal = pointsTotal;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Player[] getPlayerArray() {
        return playerArray;
    }

    public void setPlayerArray(Player[] playerArray) {
        this.playerArray = playerArray;
    }
}
