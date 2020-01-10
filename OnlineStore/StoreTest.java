import java.util.Scanner;

public class StoreTest{
    public static void main(String[] args) {

        String customerName;
        String customerEmail;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name");
        customerName = input.nextLine();
        System.out.println("Enter email");
        customerEmail = input.nextLine();

        

        Customer personOne = new Customer(customerName, customerEmail);


    }

}