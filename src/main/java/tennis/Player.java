package tennis;

public class Player {
    private final String name;
    private int wins;

    public Player(String name) {
        this.name = name;
    }

    public void winBall() {
        wins++;
    }

    public int getWins() {
        return wins;
    }

    public String getName() {
        return name;
    }
}
