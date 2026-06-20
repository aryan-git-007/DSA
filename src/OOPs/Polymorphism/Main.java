package OOPs.Polymorphism;


public class Main {
    public static void main(String[] args) {

        Claculator c = new Claculator();
        System.out.println(c.add(56,12));
        System.out.println(c.add(56,12,18));
        System.out.println(c.getDoubleadd());

//function overriding
    Shape s =new Shape();
    s.draw();
    Trianlge t = new Trianlge();
    t.draw();

    //dynamic method dispatch (Upcasting)
    DoDrawingStuff(t);
    }
    static void DoDrawingStuff(Shape s){
         s.draw();
         Trianlge t =(Trianlge)s;      //DownCasting
         t.personal();
    }



}
