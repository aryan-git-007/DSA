package Arrays;

public class FindingRowColumn {
    public static void main(String[] args) {
        int arr[][] = {
                {12, 52, 63},
                {36, 85, 68, 48, 66},
                {12, 63},
                {63, 76, 92, 39}
        };
        System.out.println(arr[2][0]);

        int row_length = arr.length;
        System.out.println("Total Rows: " + row_length);

        // Each row has different columns (jagged array)
        for(int i = 0; i < row_length; i++){
            int col_length = arr[i].length;
            System.out.println("Row " + i + " has " + col_length + " columns");
        }
    }
}