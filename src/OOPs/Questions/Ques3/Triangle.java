package OOPs.Questions.Ques3;

public class Triangle extends Shape{
    public int base;
    public int height;

    public Triangle(int base,int height){
        this.base=base;
        this.height=height;
    }

    @Override
    public void area() {
        System.out.println(
                0.5*base*height
        );
    }
}
