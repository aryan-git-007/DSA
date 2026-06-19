package OOPs.Encapsulation;

public class Cart {
    private String owner;
    private float total_price;
    private float discount;
    private boolean is_checked_out;

    //getters
    public String getowner(){
        return this.owner;
    }
    public float getTotal_price(){
        return this.total_price;
    }
    public float getdiscount(){
        return this.discount;
    }
    public boolean getcheckedout(){
        return this.is_checked_out;
    }

    //setters
    public String SetOwner(String name){
        return this.owner=name;
    }
    public float SetDiscount(float dis){
        return this.discount=dis;
    }

    //Consturctor
    public Cart(String owner,float total_price,float discount,boolean is_checked_out ){
        this.owner=owner;
        this.total_price=total_price;
        this.discount=discount;
        this.is_checked_out=is_checked_out;
    }

    //methods
    private void discount(){
        System.out.println("Discount Applied");
    }

    public void apply_discount(){
        discount();
    }
}
