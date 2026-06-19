package OOPs.Encapsulation;

public class Car {
    public String made;
    private int year;
    public String color;
    private int vin;

    //making it accessible

    //getter
    public int getVin(){
        return this.vin;
    }
    public int getYear(){
        return this.year;
    }
    // setter
    public int setyear(int change_year){
        if (year>2026)
         this.year=change_year;
        return 0;
    }


    public Car(String made,int year,String color,int vin){
        this.made=made;
        this.year=year;
        this.color=color;
        this.vin=vin;
    }

    public void Clutch(){
        System.out.println("Clutch");
    }
    public void Accelerate(){
        System.out.println("Accelerate");
    }
    private void Break(){
        System.out.println("Break");
    }
    //accessing private methods
    public void applybreak(){
        Break();
    }
}
