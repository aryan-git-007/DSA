package Strings.Questions;

public class Ques4 {
    public static void main(String[] args) {
        String name="Aryan Sahu";
        String reverse="";
        for(int i=name.length()-1;i>=0;i--){
            char ch=name.charAt(i);
            reverse+=ch;
        }
        System.out.println(reverse);
    }
}
