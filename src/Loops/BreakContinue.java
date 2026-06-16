package Loops;

public class BreakContinue {
    public static void main(String[] args) {
        for(int i=1;i<11;i++){
            if(i==1||i==3||i==5||i==7||i==9){
                continue;
            }
            System.out.println(i);
        }
        for(int j=1;j<101;j++){
            if(j==90){
                break;
            }
            System.out.println(j);
        }
    }
}
