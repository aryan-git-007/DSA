package Arrays.Questions;

public class MaxElement {
    public static void main(String[] args) {
        int []arr={20,552,63,772,56,66};
        int size= arr.length;
        System.out.println("Size:"+size);
        int max=0;
        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max Element:"+max);
    }
}
