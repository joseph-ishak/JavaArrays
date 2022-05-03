package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TournyWinner {

    public static final int HOME_TEAM = 0;
    public static final int AWAY_TEAM = 1;
    public static String tournamentWinner(final ArrayList<ArrayList<String>> competitions, final ArrayList<Integer> results){
        // O(n) time for each competition and O(k) space for each team
        String bestTeam = "";
        Map<String, Integer> scores = new HashMap<>();
        scores.put(bestTeam,0);

        for (int index = 0; index < competitions.size(); index++){
            ArrayList<String> currentGame = competitions.get(index);

            int result = results.get(index);

            String homeTeam = currentGame.get(HOME_TEAM);
            String awayTeam = currentGame.get(AWAY_TEAM);

            String winningTeam = (result == 1) ? homeTeam : awayTeam;

            // if winning team doesnt exists in scores then add it, and initialize to 0
            // update its score,to +  3
            if ( !scores.containsKey(winningTeam)){
                scores.put(winningTeam,0);

            }

            scores.put(winningTeam,scores.get(winningTeam) + 3);

            if ( scores.get(winningTeam) > scores.get(bestTeam)){
                bestTeam = winningTeam;
            }

            // if the score of the winning team > score of the current best team
            // set the best team to the winningTeam
        }

        return bestTeam;
    }

}
