package BasicMaths;

public class Problem1 {
    public static void main(String[] args) {
    printdigits(25364);

    }
    static void printdigits(int num){
        while(num!=0){
            int digit=num%10;
            System.out.println(digit);
            num=num/10;
        }
    }
}

