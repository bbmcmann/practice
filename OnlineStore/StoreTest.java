import java.util.*;

public class StoreTest{
    public static void main(String[] args) {

        String customerName;
        String customerEmail;
        int numberOfItems;
        Item[] items;
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter name");
        customerName = input.nextLine();
        System.out.println("Enter email");
        customerEmail = input.nextLine();

        System.out.println("How many items?");
        numberOfItems = input.nextInt();

        items = new Item[numberOfItems];
        for(int i = numberOfItems-1; i >=0; i--){
            String tempName;
            System.out.println("What item would yu like to buy?");
            tempName = input.nextLine();

            items[i] = new Item(tempName, rand.nextInt(4000), (int) rand.nextInt(30));
        }

        Customer personOne = new Customer(customerName, customerEmail);

        System.out.println(items[0].getCents());
    }

}