package OOPs.Abstraction.Interface;


interface Bird{
    void fly();
    void eat();
        }

        interface Walk{
    void walking();
        }

        class Peacock implements Bird,Walk{
        @Override
        public void fly(){
            System.out.println("Peacock Flying");
        }
        @Override
        public  void eat(){
                System.out.println("Peacock Flying");
            }

            @Override
            public void walking() {
                System.out.println("Peacock Walking");
            }
        }

class Eagle implements Bird,Walk{
    @Override
    public void fly(){
        System.out.println("Eagle eating");
    }
    @Override
    public  void eat(){
        System.out.println("Eagle eating");
    }

    @Override
    public void walking() {
        System.out.println("Eagle Walking");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird b = new Peacock();
      b.eat();
      b=new Eagle();
      b.fly();
DoBirdStuff(new Eagle());
DoBirdStuff(new Peacock());
DoWalkingStuff(new Eagle());
    }
    public static void DoBirdStuff(Bird b){
        b.eat();
        b.fly();
    }
    public static void DoWalkingStuff(Walk b){
        b.walking();
    }
}
