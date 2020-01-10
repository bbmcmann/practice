public class Item{

    private String name;
    private int SKU;
    private int cents;

    public Item(String name, int SKU, int cents){
        this.name = name;
        this.SKU = SKU;
        this.cents = cents;
    }

    public String getName(){
        return this.name;
    }

    public int getSKU(){
        return this.SKU;
    }

    public int getCents(){
        return this.cents;
    }
}