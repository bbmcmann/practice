public class Order{

    private Item[] items;
    private Customer person;

    public Order(Item[] items, Customer person){
        this.items = items;
        this.person = person;
    }

    private double findCents(){              //returns price in cents not dollars.
        int total = 0;
        for(int i = items.length-1; i >= 0; i--){
            total += items[i].getCents();
        }
        return (total * 1.08);
    }

    public double findDollars(){
        return findCents()/100;
    }

    public String displayItems(){
        String s = "ITEM" + "\t"  + "\t" + "PRICE" + "\n" + "\n";

        for(int i = items.length-1; i >= 0; i--){
            s += (items[i].getName()) +"\t" + "\t" + items[i].getCents() + "\n";
        }

        return s;
    }

}