package Loops;
public class NestedFor {
    public static void main(String[] args) {
        for(int i=1;i<=4;i+=1){
            for(int j=1;j<=5;j++){
                System.out.print ("* ");
            }
            System.out.println();
        }

        for(int k=1;k<5;++k){
            for(int l=1;l<5;l++){
                System.out.println("k="+ k +",l="+l);
            }
        }
    }
}
