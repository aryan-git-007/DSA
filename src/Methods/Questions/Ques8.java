package Methods.Questions;

public class Ques8 {
    static void updateVal(int x) {
        x = x + 10;
        System.out.println("Value inside method: " + x);
    }

    public static void main(String[] args) {
        int num = 5;

        System.out.println("Before method call: " + num);

        updateVal(num);

        System.out.println("After method call: " + num);
    }
}
