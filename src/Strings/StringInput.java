package Strings;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class StringInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Name:");
        String name=new String(sc.next());
        System.out.println(name);

        System.out.print("Enter Your Name again:");
        String full_name=new String(sc.nextLine());
        System.out.println(full_name);
    }

}
