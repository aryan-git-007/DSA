import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(num);

        boolean is_login=sc.hasNextBoolean();
        System.out.println(is_login);

        sc.close();

    }
}
