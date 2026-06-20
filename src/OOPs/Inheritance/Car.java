package OOPs.Inheritance;

public class Car extends Vehicle{
    public int no_of_doors;
    public String transmission_type;

    Car(String name,String model,int no_of_tyres,int no_of_doors,String transmission_type){
        super(name,model,no_of_tyres);
        this.no_of_doors=no_of_doors;
        this.transmission_type=transmission_type;
//        super.getStartengine();
    }
    public void start_ac(){
        System.out.println("AC Start "+ name);
    }
}
