package OOPs.Encapsulation;

import OOPs.Inheritance.Vehicle;

public class Truck extends Vehicle {
    private int no_of_doors;

    public int getNo_of_doors() {
        return no_of_doors;
    }

    int get_doors(){
        return this.no_of_doors;
    }
    public Truck(String name,String model,int no_of_tyres,int no_of_doors){
        super(name,model,no_of_tyres);
        this.no_of_doors=no_of_doors;
    }
    void Ac_start(){
        System.out.println("AC Start of "+name+ " "+ model);
    }
}
