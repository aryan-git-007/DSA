package Arrays;
import java.util.Scanner;
public class TwoDimensionArrayDeclaration {
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        int row_length=arr.length;
        int col_length=arr[0].length;
        System.out.println("Row length:"+ row_length);
        System.out.println("Column length:"+ col_length);
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        for(int[] row:arr){
            for(int element :row){
                System.out.print(element+ " ");
            }
            System.out.println();
        }
    }
}
