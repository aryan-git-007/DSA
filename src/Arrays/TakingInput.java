package Arrays;
//import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of an Array:");
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.println("Enter"  + size + "Elements");
        for (int i=0;i<=size-1;i++){
            System.out.println("Enter" +i+ "Elements");
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<=size-1;i++){
            System.out.println(arr[i]);
        }

    }
}
