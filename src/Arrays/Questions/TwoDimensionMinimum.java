package Arrays.Questions;

public class TwoDimensionMinimum {
    public static void main(String[] args) {
        int [][]arr={{20,552,63},{772,56,66}};
        int min=arr[0][0];
        for(int []val:arr){
            for(int val_2:val){
                if(val_2<min){
                    min=val_2;
                }
            }
        }
        System.out.println(min);
    }
}
