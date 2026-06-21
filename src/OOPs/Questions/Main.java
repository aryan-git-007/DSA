package OOPs.Questions;

public class Main {
    public static void main(String[] args) {
Ques1 user_1=new Ques1(5000);
        System.out.println("User Current Balance: "+(user_1.GetBalance()));
        user_1.deposit(500);
        System.out.println("Amount Deposited: "+(user_1.GetBalance()));
        user_1.withdraw(300);
        System.out.println("Amount deducted: "+(user_1.GetBalance()));

    }
}
