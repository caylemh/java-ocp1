
public class League {

    public static void main(String[] args) {

        Team[] theTeams = createTeams();
        Game[] theGames = createGames(theTeams);
        
        /* Practice 6-2. Remove the two for loops below */
        // System.out.println(team1.teamName);
        // for (Player thePlayer: team1.playerArray) {
        //     System.out.println(thePlayer.playerName);
        // }  

        // System.out.println('\n' + team2.teamName);
        // for (Player thePlayer: team2.playerArray) {
        //     System.out.println(thePlayer.playerName);
        // } 
        
        /* Practice 6-2. Create a Game here */
        Game currGame = theGames[0];

        /* Practice 6-2. Create a Goal object here */
        Goal goal1 = new Goal();
        goal1.thePlayer = currGame.awayTeam.playerArray[2];
        goal1.theTeam = currGame.awayTeam;
        goal1.theTime = 55;

        /* Practice 6-2. Put  Goal object in a Goal array and assign Goal array to goals attribute of Game object */
        Goal[] theGoals = {goal1};
        currGame.goals = theGoals;

        /* Practice 6-2. Print out the score of the Game */
        System.out.println("Goal scored after " +
                    currGame.goals[0].theTime + " mins by " + 
                    currGame.goals[0].thePlayer.playerName + " of " +
                    currGame.goals[0].theTeam.teamName);

        /* Practice 7-1. Manipulating Text */

        // for (Player thePlayer: team2.playerArray) {
        //     if(thePlayer.playerName.matches(".*Sab.*")) {
        //         System.out.println("\nFound " + thePlayer.playerName);
        //         System.out.println("The Last name is " + thePlayer.playerName.split(" ")[1]);
        //     }
        // } 

        // StringBuilder familyNameFirst = new StringBuilder();
        // for (Player thePlayer: team1.playerArray) {
        //     String name[] = thePlayer.playerName.split(" ");
        //     familyNameFirst.append(name[1] + ", " + name[0]);
        //     // familyNameFirst.append(", ");
        //     // familyNameFirst.append(name[0]);
        //     System.out.println(familyNameFirst);
        //     familyNameFirst.delete(0, familyNameFirst.length());
        // }     
    }  
    
    /* Practice 8-1 Using Methods */
    public static Team[] createTeams() {
        // Create team1      
        Player player1 = new Player();
        player1.playerName = "George Eliot";
        Player player2 = new Player();
        player2.playerName = "Graham Greene";
        Player player3 = new Player();
        player3.playerName = "Geoffrey Chaucer";
        Player[] thePlayers = { player1, player2, player3 };
        
        Team team1 = new Team();
        team1.teamName = "The Greens";
        team1.playerArray = thePlayers;
        
        
        // Create team2
        Team team2 = new Team();
        team2.teamName = "The Reds";
        team2.playerArray = new Player[3];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Service";
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Rafael Sabatini";

        Team[] theTeams = {team1, team2};
        return theTeams;
    }

    public static Game[] createGames(Team[] theTeams) {
        Game theGame = new Game();
        theGame.awayTeam = theTeams[0];
        theGame.awayTeam = theTeams[1];
        Game[] theGames = {theGame};
        return theGames;
    }
}
