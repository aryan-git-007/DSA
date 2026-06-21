package OOPs.Questions.Ques2;

public class Dog extends Animal {
    @Override
    public void sound(){
        System.out.println(name +" makes sound of bark");
    }
    Dog(String name){
        super(name);
    }
}
