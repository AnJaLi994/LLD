import Strategy.IAttackStrategy;
import Strategy.RandomAttackStrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BattleGroundGame {

    public Board board;
    BattleGroundGame(int n){
        board = new Board(n);

    }


    public void play(){
        int count = 0;
        System.out.println(board.getPlayersList().get(0).name);
        while(true){

            Player attacker = board.getPlayersList().get(count);
            Player defender = board.getPlayersList().get(count^1);
            System.out.println("ATTACKER" + attacker.name);
            System.out.println("DEFENDER" + defender.name);

            int[] cords = attacker.fire();
            if (defender.getShipscoordinates().stream()
                    .anyMatch(arr -> Arrays.equals(arr, cords))) {

                System.out.println("REMOVING DEFENDER COORDS " + Arrays.toString(cords));

                defender.getShipscoordinates()
                        .removeIf(arr -> Arrays.equals(arr, cords));
            }

            if(defender.getShipscoordinates().size() == 0){
                System.out.println("PLAYER WON" + attacker.name);
                break;
            }
            count = count^1;

        }


    }


}
