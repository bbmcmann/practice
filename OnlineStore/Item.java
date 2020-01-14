public class Item{

    private String name;
    private int SKU;
    private static int tempSKU = 4000;
    private int cents;
    private boolean onSale;

    public Item(String name, int cents, boolean onSale){
        this.name = name;
        this.cents = cents;
        this.onSale = onSale;
        this.SKU = setSKU();
    }

    public String getName(){
        return this.name;
    }

    public int getSKU(){
        return this.SKU;
    }

    public boolean getSale() {
        return this.onSale;
    }

    public int getCents(){
        if(onSale){
            return (int) (this.cents * 0.8);
        }
        return this.cents;
    }

    public static int setSKU() {
        tempSKU += 1;
        return tempSKU;
    } 
}