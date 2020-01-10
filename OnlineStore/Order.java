public class Order{

    private Item[] items;
    private Customer person;
    private double totalPrice;

    public Order(Item[] items, Customer person, double totalPrice){
        this.items = items;
        this.person = person;
        this.totalPrice = totalPrice;
    }

    public double findPrice(){              //returns price in cents not dollars.
        int total = 0;
        for(int i = items.length-1; i >= 0; i--){
            total += items[i].getCents();
        }
        return (total * 1.08);
    }

    

}