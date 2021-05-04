package practice.coding.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TournamentWinner {

    public static String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        Map<String,Integer> winner = new HashMap<>();
        int maxPoints = 0;
        String winningTeam = null;
        for(int i = 0; i < competitions.size(); i++) {
           if(results.get(i) == 1) {
               if(winner.containsKey(competitions.get(i).get(0))) {
                   winner.put(competitions.get(i).get(0),winner.get(competitions.get(i).get(0)) + 3);
               } else {
                   winner.put(competitions.get(i).get(0),3);
               }
           } else {
               if(winner.containsKey(competitions.get(i).get(1))) {
                   winner.put(competitions.get(i).get(1),winner.get(competitions.get(i).get(1)) + 3);
               } else {
                   winner.put(competitions.get(i).get(1),3);
               }
           }
        }

        for(Map.Entry<String,Integer> entry: winner.entrySet()) {
            if(entry.getValue() > maxPoints){
                maxPoints = entry.getValue();
                winningTeam = entry.getKey();
            }
        }

        return winningTeam;
    }


    public static void main(String [] s) {

//            "competitions": [
//    ["HTML", "C#"],
//    ["C#", "Python"],
//    ["Python", "HTML"]
//  ],
//            "results": [0, 0, 1]
//        }
    }
}
