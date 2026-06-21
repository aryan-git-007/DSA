package OOPs.Questions.Ques2;

import java.security.PrivateKey;

public class Animal {
//    Problem:
//    Create a base class Animal with:
//    A field name
//    A method eat() that prints "<name> is eating"
//    A method sound() that prints "Animal makes a sound"
//    Create two subclasses:
//    Dog → overrides sound() to print "Dog barks"
//    Cat → overrides sound() to print "Cat meows"
//    In Main:
//    Create a Dog with name "Bruno" and a Cat with name "Kitty"
//    Call both eat() and sound() on each

    public String name;
////    getter
    public String GetName(){
       return this.name;
    }

    //default ctor
    public Animal(){

    }
// para ctor
    public Animal(String name){
this.name=name;
    }
    public void eat(){
        System.out.println(name+" Eating");
    }
    public void sound(){
        System.out.println("Animal Making Sound");
    }
}
