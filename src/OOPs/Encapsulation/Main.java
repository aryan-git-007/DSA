package OOPs.Encapsulation;

public class Main {
    public static void main(String[] args) {
        // car class encapsulation
        Car car_1=new Car("Toyota",2018,"white",526398);
        System.out.println(car_1.made);
        System.out.println(car_1.getYear());
        System.out.println(car_1.color);
        System.out.println(car_1.getVin());

        car_1.applybreak();

        car_1.setyear(2022);
        System.out.println(car_1.getYear());

        //cart perfect encapsulation
        Cart C1=new Cart("Aryan Sahu",5550, 620, false);
        System.out.println(C1.getowner());
        System.out.println(C1.getTotal_price());
        System.out.println(C1.getdiscount());
        System.out.println(C1.getcheckedout());

        C1.SetOwner("Michale clarke");
        System.out.println(C1.getowner());

        Truck t1=new Truck("Tata", "Ace", 6, 2);
        System.out.println(t1.getNo_of_doors());
        t1.Ac_start();

    }
}
