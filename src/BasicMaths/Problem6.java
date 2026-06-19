package BasicMaths;

public class Problem6 {
    public static void main(String[] args) {
        System.out.println(is_prime(8));
    }
    static boolean is_prime(int num){
     for(int i=2;i<=num-1;i++){
    if(num%i==0){
        return false;
    }
       }
     return true;
    }
}
