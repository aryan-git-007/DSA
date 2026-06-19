package BasicMaths;

public class Problem4 {
    public static void main(String[] args) {
        //Reverse a number
        System.out.println("Reverse number is:"+reverse_number(58526));
    }
    static int reverse_number(int num){
        int revnum=0;
        //ans=ans*10+digit
     while(num!=0){
         int digit=num%10;
         revnum=revnum*10+digit;
         num=num/10;
     }
     return revnum;
    }
}
