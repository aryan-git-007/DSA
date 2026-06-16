package Patterns;

public class RightAngleTriangle {
    public static void main(String[] args) {
   int n=5;
   int j=6;
   for(int row=1;row<=n;row++){
       for(int col=1;col<=row;col++) {
           System.out.print("* ");
       }
       System.out.println();
   }
    }
}

//        *
//        * *
//        * * *
//        * * * *
//        * * * * *