package BasicMaths;

public class Problem3 {
    public static void main(String[] args) {
        System.out.println(sumofdigit(56455591));
    }
    static int sumofdigit(int num){
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum+=digit;
            num=num/10;
        }
        return sum;
    }
}
