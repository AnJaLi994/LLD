import java.util.HashMap;
import java.util.List;

public class Cell {
    int number;

    public HashMap<Integer, Player> getPlayersList() {
        return playersList;
    }

    public void setPlayersList(HashMap<Integer, Player> playersList) {
        this.playersList = playersList;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    HashMap<Integer, Player> playersList;


}
