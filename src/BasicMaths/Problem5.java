package BasicMaths;

public class Problem5 {
    public static void main(String[] args) {
        System.out.println(is_palindrome(58856));
    }
    static boolean is_palindrome(int num){
        int num_1=num;
        int num_2=reverse(num);
        if(num_1==num_2){
            return true;
        }
        return false;
    }
    static int reverse(int num){
        int rev_num=0;
        while(num!=0){
            int digit= num%10;
            rev_num=rev_num*10+digit;
            num=num/10;
        }
        return rev_num;
    }
}
