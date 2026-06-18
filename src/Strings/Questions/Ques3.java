package Strings.Questions;
import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        int vowel = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String to check no of vowels:");
        String new_str = new String(sc.nextLine());
        for(int i=0;i<=new_str.length()-1;i++){
            char ch=new_str.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u'||ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'||ch=='U'){
                vowel++;
            }
        }
        System.out.println("Total Vowels:"+vowel);
    }
}
