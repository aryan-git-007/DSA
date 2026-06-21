package OOPs.Abstraction;

import Loops.While;

//interface
abstract class Bird{

    abstract void fly();
    abstract void eat();
}

//implementation
class Sparrow extends Bird{
    @Override
    void eat() {
        System.out.println("Sparrow Flying");
    }

    @Override
    void fly() {
        System.out.println("Sparrow Eating");
    }
}
class Crow extends Bird{
    @Override
    void eat(){
        System.out.println("Crow Eating");
    }
    @Override
    void fly(){
        System.out.println("Crow Flying");
    }
}
public class Main {
    public static void main(String[] args) {
        Bird b= new Sparrow();
        b.eat();
        b.fly();

        Bird b2=new Crow();
        b2.fly();
        b2.eat();

        doBirdStuff(new Sparrow());
        doBirdStuff(new Crow());
    }

    public static void doBirdStuff(Bird b){
        b.eat();
        b.fly();
    }

}
