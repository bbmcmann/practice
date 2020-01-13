import java.util.*;

public class StoreTest{
    public static void main(String[] args) {

        Customer ben = new Customer("Ben", "ben@hotmail.gov");
        Customer tom = new Customer("Tom", "tom@hotmail.gov");
        Item items[] = {new Item("Lime", 4042, 12343), new Item("Banana", 4011, 1273), new Item("Cabbage", 4069, 123)};
        Order one = new Order(items, ben);

        System.out.println(one.displayItems());
        System.out.println("\nTotal Price:");
        System.out.println(one.findDollars());
        
    }

}