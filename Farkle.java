import java.util.*;

public class Farkle{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        int playerOneRoll, playerTwoRoll;
        int playerOneScore = 0;
        int playerTwoScore = 0;
        int workingScore = 0;
        int[] p1Roll = {-1,-1,-1,-1,-1,-1};
        int[] p2Roll = {-1,-1,-1,-1,-1,-1};

        boolean p1Turn;

        System.out.println("Gather around this flat screen!");

        System.out.println("Player 1 rolls first.");
        playerOneRoll = random.nextInt(6)+1;

        System.out.println("Player 2 rolls not first.");
        playerTwoRoll = random.nextInt(6)+1;

        System.out.println("P1: " + playerOneRoll);
        System.out.println("P2: " + playerTwoRoll);



        if(playerOneRoll > playerTwoRoll){
            p1Turn = true;
        }
        else{
            p1Turn = false;
        }



        while(playerOneScore < 10000 && playerTwoScore < 10000){

            if(p1Turn){

                p1Roll = roll(6);

                p1Turn = false;
            }
            else{

                p2Roll = roll(6);


                p1Turn = true;
            }

        }

    }
//Idea: set die aside by setting array items == to -1 and have code only account for rolls > 0
    public static int[] roll(int times){
        Random random = new Random();

        int[] num = {};
        for(int i = times; i > 0; i --){
            num[i] = random.nextInt(6) + 1;
        }
        for(int i = 6-times; i > 0; i --){
            num[i] = -1;
        }
        
        return num;
    }
}