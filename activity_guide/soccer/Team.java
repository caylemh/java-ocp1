package soccer;

public class Team {
    private String teamName;
    private Player[] playerArray;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public Team(Player[] playerArray) {
        this.playerArray = playerArray;
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
