package OOPs.Inheritance;

public class Bike extends Vehicle{
    public String Handlebartype;
    public String Suspensiontype;

    Bike(String name,String model,int no_of_tyres,String Handlebartype,String Suspensiontype){
        super(name,model,no_of_tyres);
        this.Handlebartype=Handlebartype;
        this.Suspensiontype=Suspensiontype;
    }
    private void wheelie(){
        System.out.println("Wheelie "+ name);
    }
    public void getWheelie(){
        wheelie();
    }
}
