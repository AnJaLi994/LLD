import java.util.HashMap;
import java.util.Map;

public class SnakeAndLadderGame {

    HashMap <Integer, Player> playersInGame;
    Board board;
    public SnakeAndLadderGame(int players){
        board = new Board(10);
        playersInGame = new HashMap<>();
        for(int i = 1; i <= players; i++){
            playersInGame.put(i, new Player(i, 1));
        }
    }

    public void initialize(Map<Integer, Integer> snakes, Map<Integer, Integer> ladders ){
        board.initializeLadders(ladders);
        board.initializeSnakes(snakes);
    }

    public Integer roll(Player p){
        int diceroll = (int)(Math.random() * 6) + 1;

        if(p.score + diceroll <= 100){
            return p.score + diceroll;
        }

        return p.score;

    }


    public Integer Play(Player p){
        int newscore = roll(p);
        newscore = board.calculateMove(p, newscore);
        p.setScore(newscore);
        return p.score;

    }


    public void startGame(){
        int size = playersInGame.size();

        int currentsize = 1;
        while(true){
            System.out.println(currentsize);
            Player p = playersInGame.get(currentsize);
            int score = Play(p);
            if(score == 100){
                System.out.println("eureka winner is" + p.id);
                break;
            }
            currentsize = currentsize % size + 1;

        }
    }


}
