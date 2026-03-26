import Strategy.IAttackStrategy;

import java.util.ArrayList;
import java.util.List;

public class Player {
    public IAttackStrategy strategy;

    Player(String name, IAttackStrategy strategy){
        this.name=name;
        shipscoordinates=new ArrayList<>();
        setStrategy(strategy);

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<int[]> getShipscoordinates() {
        return shipscoordinates;
    }

    public void addShipscoordinates(int[] sc) {
        this.shipscoordinates.add(sc);
    }

    String name;
    List<int[]> shipscoordinates;

    public void setStrategy(IAttackStrategy strategy) {
        this.strategy = strategy;

    }

    public int[] fire(){
        int[] cords =  strategy.attack();
        return cords;

    }

    public void addShip(int size, int r, int c, int n){
        int lr = r - size/2;
        int rr = r + size/2;
        int lc = c - size/2;
        int rc = c + size/2;

        if(lr < 0 || rr < 0 || lr >= n || rr >= n || lc < 0 || rc < 0 || lc >= n|| rr >= n){
            System.out.println("WRONG ENTRY FOR SHIP");

        }


        for(int i = lr; i <= rr; i++){
            for(int j = lc; j <= rc; j++){
                addShipscoordinates(new int[]{i, j});
            }
        }
    }


}
