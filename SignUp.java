import java.util.Scanner;

public class SignUp{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String password, username;

        String[] usernames = {"admin", "person", "jimbob234", "skater_gurl17", "gary"};

        System.out.println("WELCOME! Enter your username.");
        username = input.nextLine();

        for (int i = 0; i < usernames.length-1; i++){
            System.out.println(usernames[i]);
            if (username.equals(usernames[i])){
                System.out.println("Username rejected.");
                System.exit(0);
            }
        }

        System.out.println("Username accepted. Pease enter a password.");
        
    }

}