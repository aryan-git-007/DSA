    package OOPs.Questions.Ques2;

    public class Cat extends Animal{
        @Override
        public void sound(){
            System.out.println(name+" makes sound of meow");
        }

       Cat(String name){
            super(name);
        }
    }
