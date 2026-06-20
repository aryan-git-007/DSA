package OOPs.Inheritance;

public class Main {
    public static void main(String[] args) {
        Car c1=new Car("Toyota", "Fortuner", 4, 4, "Moving");
        Bike b1=new Bike("TVS", "Sports", 2, "Two", "Best");

        System.out.println(c1.name);
        System.out.println(b1.name);
        c1.start_ac();
        b1.getStartengine();
        c1.StopEngine();
    }
}
