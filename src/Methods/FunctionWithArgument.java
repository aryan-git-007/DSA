package Methods;
import java.util.Scanner;
public class FunctionWithArgument {
    static void even_odd(int num){
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to check:");
        int num=sc.nextInt();
even_odd(num);
    }
}
