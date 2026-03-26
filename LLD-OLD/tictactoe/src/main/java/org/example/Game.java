package org.example;

import javax.xml.validation.Validator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {
    ArrayList<Player> playersList;
    int currentIndex;
    Board board;


    public Game(List<Player> players){

        this.board = new Board(3);
        playersList=new ArrayList<>();
        for(Player p: players){
            System.out.println(p.name);
            this.playersList.add(p);
        }
    }



    public void playGame(Player p, int row, int col){
        if(p != this.playersList.get(currentIndex % this.playersList.size())){
            System.out.println("Wrong turn of "+ p.getName());
            return;
        }

        board.setToken(p.getToken(), row, col);
        printBoard();
        Validator();
        currentIndex++;

    }


    public void printBoard(){
        for(int  i = 0; i < 3; i++){
            System.out.println(Arrays.toString(board.playboard[i]));
        }
    }


    public void Validator(){
       return;
    }
}
