package Methods.Questions;

public class Ques5 {
    public static void main(String[] args) {
        System.out.println(calculate_percentage(56,100)+"%");
    }
    static int calculate_percentage(int obtained, int total){
        return (obtained * 100) / total;
    }
}
