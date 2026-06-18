package Arrays.Questions;

public class SumOfElements {
    public static void main(String[] args) {
        int []arr={20,552,63,772,56,66};
        int size= arr.length;
        System.out.println(size);
        int sum=0;
        for(int val:arr){
            sum+=val;
        }
        System.out.println(sum);
    }
}
