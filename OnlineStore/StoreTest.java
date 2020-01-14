public class StoreTest{
    public static void main(String[] args) {

        Customer ben = new Customer("Ben", "ben@hotmail.gov");
        Customer tom = new Customer("Tom", "tom@hotmail.gov");
        Item items[] = {new Item("Lime", 12343, true), new Item("Banana", 1273, false), new Item("Cabbage", 123, false), new Item("Kiwi", 31231, true)};
        Order one = new Order(items, ben);

        System.out.println(one.displayItems());
        System.out.println("\nTotal Price:");
        System.out.println(one.findDollars());
        if (one.findDollars() >= 100) {
            System.out.println("Bruh why tf you spending so much damn");
        }
        if (one.findDollars() <= 10) {
            System.out.println("Dude you better put more in your cart and buy stuff");
        }
    }

}