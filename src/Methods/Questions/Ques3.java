package Methods.Questions;

public class Ques3 {
    public static void main(String[] args) {

        System.out.println(is_even(8));
        System.out.println(is_even(7));

    }
    static boolean is_even(int num){
        return num % 2 == 0;
    }
}