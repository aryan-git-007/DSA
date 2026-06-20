package OOPs.Polymorphism;

public class Claculator {
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b,int c){
        return a+b+c;
    }
    private double add(int a, int b,int c,double d){
        return a+b+c+d;
    }
    public double getDoubleadd(){
        return add(52,63,85,25.2);
    }
}
