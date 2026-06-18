package Arrays.Questions;

public class MinElement {
        public static void main(String[] args) {
            int []arr={20,552,63,772,7,66};
            int size= arr.length;
            System.out.println("Size:"+size);
            int min=arr[0];
            for (int j : arr) {
                if (j < min) {
                    min = j;
                }
            }
            System.out.println("Min Element:"+min);
        }
    }

