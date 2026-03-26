import Strategy.RandomAttackStrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Board {
    public Cell[][] playboard;

    public List<Player> playersList;

    public List<Player> getPlayersList() {
        return this.playersList;
    }

    public void setPlayersList(Player p) {
        playersList.add(p);
    }



    public Board(int n){
        playboard = new Cell[n][n];
        playersList = new ArrayList<>();
        setPlayersList(new Player("A", new RandomAttackStrategy(n, n/2, n)));
        setPlayersList(new Player("B", new RandomAttackStrategy(n, 0, n/2)));
        playersList.get(0).addShip(2, 2, 2, n);
        playersList.get(1).addShip(2, 7, 7, n);
        initialize(n);

    }
    public void initialize(int n){
        playboard = new Cell[n][n];

        for(int r = 0; r < n; r++){
            for(int c = 0; c < n/2; c++){
                playboard[r][c] = new Cell(r, c,  playersList.get(0),  false);
            }
        }

        for(int r = 0; r < n; r++){
            for(int c = n/2; c < n; c++){
                playboard[r][c] = new Cell(r, c,  playersList.get(1),  false);
            }
        }

    }

    public void printBoard(){
        for(Cell[] c: playboard){
            System.out.println(Arrays.toString(c));
        }
    }




}
