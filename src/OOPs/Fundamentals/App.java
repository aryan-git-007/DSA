package OOPs.Fundamentals;

public class App {
    public static void main(String[] args) {
        Student S1=new Student();
        S1.name="Aryan sahu";
        S1.id=101;
        S1.age=19;
        S1.nos=5;
        System.out.println("Student 1 info:");
        System.out.println(S1.name);
        System.out.println(S1.age);
        System.out.println(S1.id);
        System.out.println(S1.nos);
        S1.bunk();


        Student S2=new Student(102,"Ayush",24,3);
        System.out.println("Student 2 info:");
        System.out.println(S2.name);
        System.out.println(S2.age);
        System.out.println(S2.id);
        System.out.println(S2.nos);
        S2.sleep();

        Student S3=new Student(103,"Rajan",22,4);
        System.out.println("Student 3 info:");
        System.out.println(S3.name);
        System.out.println(S3.age);
        System.out.println(S3.id);
        System.out.println(S3.nos);
        S3.study();

        Student S4=new Student(S1);
        System.out.println("Student 4 info:");
        System.out.println(S4.name);
        System.out.println(S4.age);
        System.out.println(S4.id);
        System.out.println(S4.nos);
        S4.study();

    }
}
