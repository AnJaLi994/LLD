import java.util.Map;

public class main {
    public static void main(String[] args) {
        SnakeAndLadderGame game = new SnakeAndLadderGame(2);
        Map<Integer, Integer> snakes = Map.of(
                23, 1,
                42, 5,
                99, 1
        );
        Map<Integer, Integer> ladder = Map.of(
                10, 99,
                7, 70

        );
        game.initialize(snakes, ladder);
        game.startGame();
    }
}
