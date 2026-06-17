package Methods.Questions;

public class Ques4 {
    public static void main(String[] args) {
        System.out.println("Maximum is:"+getMax(52,96));
    }
    static int getMax(int a, int b){
        int max;
        if(a>b){
            max=a;
        }
        else{
            max=b;
        }
        return max;
    }
}
