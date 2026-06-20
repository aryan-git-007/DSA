package OOPs.Inheritance;

import java.security.PublicKey;

public class Vehicle {
    public String name;
    public String model;
    public int no_of_tyres;

    public Vehicle(){

    }

    public Vehicle(String name,String model ,int no_of_tyres){
        this.name=name;
        this.model=model;
        this.no_of_tyres=no_of_tyres;
    }
    private void StartEngine(){
        System.out.println("Engine Start"+" "+name +" " +model+" ");
    }
    public void getStartengine(){
        StartEngine();
    }
    void StopEngine(){
        System.out.println("Engine Stop"+" "+name +" " +model+" ");
    }
}
