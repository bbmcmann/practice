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
        int numRolling = 6;
        int dieOut;
        String takeOut = "";
        boolean p1Turn, rolling;

        System.out.println("Gather around this flat screen!");
        System.out.println("DISCLAIMER: This game is absed off of the rules found on wikihow");
        System.out.println("Go look if you don't know how to play.");
        System.out.println("Cheating is not allowed because cheating is against te rules. So dont do it.");


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

                p1Roll = roll(numRolling);

                for(int i = 0; i < p1Roll.length; i ++){
                    if(p1Roll[i] > -2){
                        System.out.println("Die " + (i + 1) + ":" + p1Roll[i]);
                    }
                }

                if(threeKind(p1Roll, numRolling)){
                    System.out.println("Do you want to take out any 3 of a kind?(y/n)");
                    takeOut = input.nextLine();

                    while(takeOut.equals("y")){
                        System.out.println("Which die? (enter the number ON the die)");
                        dieOut = input.nextInt();

                        if(dieOut == 1){
                            playerOneScore += 1000;
                        }
                        else{
                            playerOneScore += dieOut * 100;
                        }

                        numRolling --;
                        System.out.println("Do you want to take out any 3 of a kind?(y/n)");
                        takeOut = input.nextLine();
                        takeOut = input.nextLine();
                    }

                    System.out.println("Do you want to take out any 1's or 5's?(y/n)");
                    takeOut = input.nextLine();

                    //only runs if taking out dice
                    while(takeOut.equals("y")){
                        System.out.println("Which dice? (enter 1 or 5)");
                        dieOut = input.nextInt();

                        if(dieOut == 1){
                            playerOneScore += 100;
                        }
                        else{
                            playerOneScore += 50;
                        }

                        numRolling --;
                        System.out.println("Do you want to take out any 1's or 5's?(y/n)");
                        takeOut = input.nextLine();
                        takeOut = input.nextLine();
                    }
                

                    
                }
                else{
                    System.out.println("You got a farkle.");
                }

                playerOneScore += 1000;
                p1Turn = false;
                System.out.println("__________________");
    
            }
            //PLAYER 2_____________________________________
            else{
                System.out.println("__________________");
                System.out.println("PLAYER 2 TURN");
                p2Roll = roll(numRolling);


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

    public static boolean threeKind(int[] roll, int ammountRolling){
        int numEqual = 0;

        for(int i = 1; i <= ammountRolling; i++){

            for(int n = 0; n < roll.length; n ++){

                if(roll[i-1] == i){
                    numEqual ++;
                }
                if(numEqual == 3){
                    return true;
                }

            }

            numEqual = 0;
        }
        return false;
    }
    //need to write a function that checks if any of a given number is present to check for 1 and 5
}