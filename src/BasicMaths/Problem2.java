package BasicMaths;

public class Problem2 {
    public static void main(String[] args) {
        //Count digits of number
        System.out.println(count_digit(52639355));
    }
    static int count_digit(long num) {
        int count = 0;
        while(num!=0){
            long digit=num%10;
            count++;
            num=num/10;
    }
        return count;
    }
}
