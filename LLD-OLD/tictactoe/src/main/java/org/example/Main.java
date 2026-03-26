package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("anjali", Token.O);
        Player p2 = new Player("anurag", Token.X);
        ArrayList<Player> players = new ArrayList<>();
        players.add(p1);
        players.add(p2);
        Game g1 = new Game(players);
        g1.playGame(p1, 0, 0);
        g1.playGame(p2, 0,2);
        g1.playGame(p1, 1, 1);
        g1.playGame(p2, 1,2);
        g1.playGame(p1, 2, 2);



    }
}