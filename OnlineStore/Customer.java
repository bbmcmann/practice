public class Customer{

    private String name;
    private String email;
    private Order order;

    public Customer(String name, String email){
        this.name = name;
        this.email = email;
    }

    public Customer(String name, String email, Order order){
        this.name = name;
        this.email = email;
        this.order = order;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public Order getOrder(){
        return this.order;
    }

}