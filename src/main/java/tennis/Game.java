package tennis;

import java.util.HashMap;
import java.util.Map;

public class Game {
    private final Player player1;
    private final Player player2;

    private static Map<Integer, String> scores = initializeScores();

    private static Map<Integer, String> initializeScores() {
        scores = new HashMap<>();
        scores.put(0, "love");
        scores.put(1, "fifteen");
        scores.put(2, "thirty");
        scores.put(3, "forty");
        return scores;
    }

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String getScore() {

        if (player1.getWins() == player2.getWins()) {
            int bothWins = player1.getWins();
            if (bothWins >= 3) {
                return "deuce";
            }

            return mapScore(player1) + "-" + mapScore(player2);
        }

        if (player1.getWins() <=2 || player2.getWins() <=2) {
            return mapScore(player1) + "-" + mapScore(player2);
        }

        if (player1.getWins() > player2.getWins()) {
            return "advantage " + player1.getName() ;
        } else {
            return "advantage " + player2.getName();
        }

    }



    private String mapScore(Player player) {
        return scores.get(player.getWins());
    }
}
