package org.example;

import java.util.List;

public class Board {

    Token[][] playboard;
    public Board(int size){
       playboard = new Token[size][size];

   }



    public void setToken(Token t, int row, int col){
        if(this.playboard[row][col] !=null){
            System.out.println("Choose another cell");
            return;
        }
        this.playboard[row][col] = t;
    }

    public Token getCell(int row, int col){
        return playboard[row][col];
    }
}
