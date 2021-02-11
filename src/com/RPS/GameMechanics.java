package com.RPS;

import java.util.Random;

public class GameMechanics {

    public Choose getComputerResult() {
        return computerResult;
    }

    public void setComputerResult(Choose computerResult) {
        this.computerResult = computerResult;
    }

    public Choose getUserResult() {
        return userResult;
    }

    public void setUserResult(Choose userResult) {
        this.userResult = userResult;
    }

    Choose computerResult;
    Choose userResult;

    public enum Choose{
        rock ,
        scissors,
        paper;
    }

    public void randomComputerChoose(){
        Choose[] pick = Choose.values();
        int lenght = pick.length;
        int rand = new Random().nextInt(lenght);
        setComputerResult(pick[rand]);
        System.out.println(pick[rand]);
    }

    public void userChoose(int userPick){

        switch (userPick) {
            case 1:
                 setUserResult(Choose.rock);
                 break;
            case 2:
                 setUserResult(Choose.scissors);
                 break;
            case 3:
                 setUserResult(Choose.paper);
                 break;
            default:
        }

    }

    public void win(){
        if(getComputerResult() == Choose.rock && getUserResult() == Choose.rock){
            System.out.println("remis");
        }
        if(getComputerResult() == Choose.scissors && getUserResult() == Choose.scissors){
            System.out.println("remis");
        }
        if(getComputerResult() == Choose.paper && getUserResult() == Choose.paper){
            System.out.println("remis");
        }
        if(getComputerResult() == Choose.rock && getUserResult() == Choose.scissors){
            System.out.println("komp win");
        }
        if(getComputerResult() == Choose.rock && getUserResult() == Choose.paper){
            System.out.println("user win");
        }
        if(getComputerResult() == Choose.scissors && getUserResult() == Choose.rock){
            System.out.println("user win");
        }
        if(getComputerResult() == Choose.scissors && getUserResult() == Choose.paper){
            System.out.println("komp win");
        }
        if(getComputerResult() == Choose.paper && getUserResult() == Choose.rock){
            System.out.println("komp win");
        }
        if(getComputerResult() == Choose.paper && getUserResult() == Choose.scissors){
            System.out.println("user win");
        }
    }





}
