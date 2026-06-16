package Patterns;
public class Rhombus {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){
            //spaces
            for(int col=1;col<=n-row;col++){
                System.out.print("  ");
            }
            //star
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//        * * * * *
//      * * * * *
//    * * * * *
//  * * * * *
//* * * * *