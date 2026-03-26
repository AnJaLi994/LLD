import java.util.HashMap;
import java.util.Map;

public class Board {
    public Map<Integer, Integer> snakes;
    public Map<Integer, Integer> ladders;
    Cell[] boardlist;
    public Board(int size){
        boardlist = new Cell[(size*size) + 1];
        snakes = new HashMap<>();
        ladders = new HashMap<>();
    }


    public void initializeSnakes(Map<Integer, Integer> snakemap){
        snakes=snakemap;
    }

    public void initializeLadders(Map<Integer, Integer> laddermap){
        ladders= laddermap;
    }


    public Integer calculateMove(Player p, int cell){
        if(snakes.containsKey(cell)){
            System.out.println("SNAKE BIT PLAYER" + p.id);
            return snakes.get(cell);
        }
        else if (ladders.containsKey(cell)){
            System.out.println("PLAYER  GOT THE LADDER" + p.id);
            return ladders.get(cell);
        }
        else{
            return cell;
        }

    }

   public void removePlayerFromCell(Player p, int currentcell){
       Cell ori = boardlist[currentcell];
       ori.playersList.remove(p.id);
   }

    public void addPlayerToCell(Player p, int currentcell){
        Cell ori = boardlist[currentcell];
        ori.playersList.put(p.id, p);
    }

    public void move(Player p, int original, int current){
        Cell ori = boardlist[original];
        removePlayerFromCell(p, original);
        addPlayerToCell(p, current);

    }




}
