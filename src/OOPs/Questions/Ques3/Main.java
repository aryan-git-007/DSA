package OOPs.Questions.Ques3;

import OOPs.Inheritance.Vehicle;

public class Main {
//    Circle → takes radius, overrides area() to print "Circle area: <value>"
//    Rectangle → takes length and width, overrides area() to print "Rectangle area: <value>"
//    Triangle → takes base and height, overrides area() to print "Triangle area: <value>"

    public static void main(String[] args) {
        Shape s1=new Circle(26);
        Shape s2=new Triangle(15,25);
        Shape s3=new Rectangle(22, 44);
        s1.area();
        s2.area();
        s3.area();
    }
}
