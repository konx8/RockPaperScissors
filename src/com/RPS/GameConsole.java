package com.RPS;

import java.util.Scanner;

public class GameConsole {

    GameMechanics game = new GameMechanics();
    Scanner scanner = new Scanner(System.in);

    public int setUserNumber(){
        String pickedNumber = scanner.nextLine();
        int n = Integer.parseInt(pickedNumber);
        return n;
    }

    public void start(){

        System.out.println("Wybierz: \n 1 = rock\n 2 = scissors\n 3 = paper\n");

        game.userChoose(setUserNumber());
        game.randomComputerChoose();
        game.win();

    }



}
