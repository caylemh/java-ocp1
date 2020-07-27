package soccer;

import java.lang.StringBuilder;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Game {
    private Team homeTeam;
    private Team awayTeam;
    private GameEvent[] goals;
    private LocalDateTime theDateTime;

    public Game(Team homeTeam, Team awayTeam, LocalDateTime theDateTime) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.theDateTime = theDateTime;
    }

    /* Practice 8-3 Overloading Methods */
    public void playGame() {
        ArrayList<GameEvent> eventList = new ArrayList();
        GameEvent currEvent;

        for(int i=0; i<=90; i++) {
            if(Math.random() > 0.8) {
                //System.out.println(i);
                currEvent = Math.random() > 0.8 ? new Goal():new Possession();
                currEvent.setTheTeam(Math.random() > 0.5 ? homeTeam:awayTeam);
                currEvent.setThePlayer(currEvent.getTheTeam().getPlayerArray()[(int) (Math.random() *
                        currEvent.getTheTeam().getPlayerArray().length)]);
                currEvent.setTheTime(i);
                eventList.add(currEvent);
            }
        }
        this.goals = new GameEvent[eventList.size()];
        eventList.toArray(goals);
    }

    public String getDescription() {
        // Keeping score for the winning team
        int homeTeamGoals = 0;
        int awayTeamGoals = 0;

        StringBuilder returnString = new StringBuilder();

        // Print the fixtures
        returnString.append(homeTeam.getTeamName() + " vs. " + awayTeam.getTeamName() + "\n" +
                "Date " + this.theDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE) + "\n");

        for (GameEvent currEvent: this.getEvents()) {

            if(currEvent instanceof Goal) {
                if(currEvent.getTheTeam() == homeTeam) {
                    homeTeamGoals++;
                    homeTeam.incGoalsTotal(1);
                } else {
                    awayTeamGoals++;
                    awayTeam.incGoalsTotal(1);
                }
            }


            returnString.append(currEvent + " after "
            + currEvent.getTheTime() + " mins by "
            + currEvent.getThePlayer().getPlayerName() + " of "
            + currEvent.getTheTeam().getTeamName() +
              "\n");
        }

        // Determining the winning team
        if(homeTeamGoals == awayTeamGoals) {
            returnString.append("\t---- It's a draw!!!");
            this.homeTeam.incPointsTotal(1);
            this.awayTeam.incPointsTotal(1);
        } else if(homeTeamGoals > awayTeamGoals){
            returnString.append("\t---- " + homeTeam.getTeamName() + " win!!!");
            this.homeTeam.incPointsTotal(2);
        } else {
            returnString.append("\t---- " + awayTeam.getTeamName() + " win!!!");
            this.awayTeam.incPointsTotal(2);
        }

        returnString.append(" (" + homeTeamGoals + " - " + awayTeamGoals + ") ----\n");

        return returnString.toString();
    }

    public LocalDateTime getTheDateTime() {
        return theDateTime;
    }

    public void setTheDateTime(LocalDateTime theDateTime) {
        this.theDateTime = theDateTime;
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

    public GameEvent[] getEvents() {
        return goals;
    }

    public void setEvents(GameEvent[] goals) {
        this.goals = goals;
    }
}

