package OOPs.Questions.Ques3;

public class Rectangle extends Shape{
    public int length;
    public int breadth;

    public  Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    public void area(){
        System.out.println(length*breadth);
    }
}
