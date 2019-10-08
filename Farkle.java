import java.util.*;

public class Farkle{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        int playerOneRoll, playerTwoRoll;
        int playerOneScore = 0;
        int playerTwoScore = 0;
        int workingScore = 0;
        int[] p1Roll = new int[6];
        int[] p2Roll = new int[6];

        boolean p1Turn, rolling;

        System.out.println("Gather around this flat screen!");

        System.out.println("Player 1 rolls first.");
        playerOneRoll = random.nextInt(6)+1;

        System.out.println("Player 2 rolls not first.");
        playerTwoRoll = random.nextInt(6)+1;

        System.out.println("P1: " + playerOneRoll);
        System.out.println("P2: " + playerTwoRoll);



        if(playerOneRoll > playerTwoRoll){
            System.out.println("Player 1 rolls first");
            p1Turn = true;
        }
        else{
            System.out.println("Player 2 rolls first");
            p1Turn = false;
        }



        while(playerOneScore < 10000 && playerTwoScore < 10000){

            if(p1Turn){
                System.out.println("__________________");
                System.out.println("PLAYER 1 TURN");

                p1Roll = roll(6);

                for(int i = 0; i < p1Roll.length; i ++){
                    if(p1Roll[i] > -2){
                        System.out.println("Die " + (i + 1) + ":" + p1Roll[i]);
                    }
                }
                //while(rolling){


                //}

                playerOneScore += 1000;
                p1Turn = false;
                System.out.println("__________________");
            }
            else{
                System.out.println("__________________");
                System.out.println("PLAYER 2 TURN");
                p2Roll = roll(6);


                p1Turn = true;
                System.out.println("__________________");
            }

        }

    }
//Idea: set die aside by setting array items == to -1 and have code only account for rolls > 0
    public static int[] roll(int times){
        Random random = new Random();

        int[] num = new int[6];
        for(int i = times - 1; i > -1; i --){
            num[i] = random.nextInt(6) + 1;
        }
        for(int i = 5-times; i > -1; i --){
            num[i+times] = -1;
        }
        
        return num;
    }
}