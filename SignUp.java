import java.util.Scanner;

public class SignUp{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String password, username;

        boolean startsWithVowel = false;
        boolean hasSpecial = false;
        boolean correctNumPlace = true;

        String[] usernames = {"admin", "person", "jimbob234", "skater_gurl17", "gary"};
        String[] vowels = {"A", "E", "I", "O", "U"};
        String[] specialChars = {"!", "#", "$", "&", "*"};
        String[] numbers = {"0","1","2","3","4","5","6","7","8","9"};
        

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
        System.out.println("Must start with a vowel,");
        System.out.println("Contain ! # & $ or *");
        System.out.println("Must not contain the username,");
        System.out.println("Numbers can only be in the last 2 spots.");
        System.out.println("Enter the password: ");
        password = input.nextLine();

        for (int i = 0; i < 5; i++){
            if(password.toUpperCase().startsWith(vowels[i])){
                startsWithVowel = true;
            }
        }
        if(!startsWithVowel){
            System.out.println("Password rejected due to missing vowel.");
            System.exit(0);
        }

        for (int i = 0; i < 5; i++){
            if(password.indexOf(specialChars[i]) != -1){
                hasSpecial = true;
            }
        }
        if(!hasSpecial){
            System.out.println("Password rejected due to missing special char.");
            System.exit(0);
        }

        if(password.indexOf(username) != -1){
            System.out.println("Password rejected due to inclusion of username.");
            System.exit(0);
        }

        for (int i = 0; i < 9; i++){
            // System.out.println(password.substring(0, password.length()-2));
            // System.out.println("Testing: " + numbers[i]);
            // System.out.println("Index: " + password.substring(0, password.length()-2).indexOf(numbers[i]));
            
            if(password.substring(0, password.length()-2).indexOf(numbers[i]) != -1){
                correctNumPlace = false;
            }
        }
        if(!correctNumPlace){
            System.out.println("Password rejected due to incorrect number placement.");
            System.exit(0);
        }

        System.out.println("Password accepted");
        
        // if (password.toUpperCase().startsWith("A") || password.toUpperCase().startsWith("E") || password.toUpperCase().startsWith("I") || password.toUpperCase().startsWith("O") || password.toUpperCase().startsWith("U")){
        //     System.out.println("Good, it begins with a vowel.");

        //     if (password.indexOf("!") != -1 || password.indexOf("#") != -1 || password.indexOf("&") != -1 || password.indexOf("$") != -1 || password.indexOf("*") != -1){
        //         System.out.println("Good, it has a special character.");

        //         if (password.indexOf(username) == -1){
        //             System.out.println("Good, it does not have the username.");

        //             if (password.substring(0, password.length()-2).indexOf("0") == -1 && password.substring(0, password.length()-2).indexOf("1") == -1 && password.substring(0, password.length()-2).indexOf("2") == -1 && password.substring(0, password.length()-2).indexOf("3") == -1 && password.substring(0, password.length()-2).indexOf("4") == -1 && password.substring(0, password.length()-2).indexOf("5") == -1 && password.substring(0, password.length()-2).indexOf("6") == -1 && password.substring(0, password.length()-2).indexOf("7") == -1 && password.substring(0, password.length()-2).indexOf("8") == -1 && password.substring(0, password.length()-2).indexOf("9") == -1){
        //                 System.out.println("Good, the numbers are correct. PASSWORD ACCEPTED");
        //             }
        //             else{
        //                 System.out.println("Numbers incorrect.");
        //             }
        //         }
        //         else{
        //             System.out.println("It has the username.");
        //         }
        //     }
        //     else{
        //         System.out.println("Does not have a special character.");
        //     }

        // }
        // else{
        //     System.out.println("Does not begin with a vowel.");

        // }
    }

}