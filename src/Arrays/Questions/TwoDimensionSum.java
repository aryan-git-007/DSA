package Arrays.Questions;

public class TwoDimensionSum {  public static void main(String[] args) {
    int [][]arr={{20,552,63},{772,56,66}};
    int sum=0;
    for(int []val:arr){
        for(int val_2:val){
            sum+=val_2;
        }
    }
    System.out.println(sum);
}
}
