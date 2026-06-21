package OOPs.Questions.Ques3;

public class Circle extends Shape{
    public double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public void area(){
        System.out.println(3.14*radius*radius);
    }
}
