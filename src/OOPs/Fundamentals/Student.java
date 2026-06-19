package OOPs.Fundamentals;

public class Student {
    //Attributes
    public int id;
    public int age;
    public String name;
    public int nos;

    //default Constructor
    public Student(){
        System.out.println("Default constructor ctor of Student class");
    }

    //Parameterized Constructor
    public Student(int id,String name,int age,int nos){
        System.out.println("Parameterized ctor");
        this.id=id;
        this.name=name;
        this.age=age;
        this.nos=nos;
    }

    //Copy Constructor
    public Student(Student srcobj){
        System.out.println("Copy ctor");
        this.id= srcobj.id;
        this.name= srcobj.name;
        this.age= srcobj.age;
        this.nos=srcobj.nos;
    }
    //Methods & Behaviour
    void study(){
        System.out.println(name +" Studying");
    }
    void sleep(){
        System.out.println(name +" Sleeping");
    }
     void bunk(){
        System.out.println(name + " Bunking");
    }

}
