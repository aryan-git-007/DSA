package Loops;
import java.util.Scanner;
public class For {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the starting value:");
       int start_value= sc.nextInt();
       System.out.println("Enter the end value:");
       int end_value= sc.nextInt();
       System.out.println("Enter the starting value:");
       int increment_value= sc.nextInt();

       for(;start_value<=end_value;start_value+=increment_value){
           System.out.println(start_value);
           if(start_value>=80){
               break;
           }
       }
    }
}
