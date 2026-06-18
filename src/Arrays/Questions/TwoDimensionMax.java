package Arrays.Questions;

public class TwoDimensionMax {
    public static void main(String[] args) {
        int [][]arr={{20,552,63},{772,56,66}};
        int max=0;
        for(int []val:arr){
            for(int val_2:val){
                if(val_2>max){
                    max=val_2;
                }
            }
        }
        System.out.println(max);
    }
}
