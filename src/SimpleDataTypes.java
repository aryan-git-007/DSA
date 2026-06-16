public class SimpleDataTypes {
    public static void main(String[] args) {

        // 1. Whole Numbers
        byte smallNumber = 120;
        short mediumNumber = 30000;
        int age = 25;
        long hugeNumber = 9000000000000L;

        // 2. Decimal Numbers
        float piValue = 3.14f;
        double price = 19.99;

        // 3. Text and Characters
        char grade = 'A';
        String name = "Alex";

        // 4. True/False Decisions
        boolean isJavaFun = true;

        // 5. Collections
        int[] luckyNumbers = {7, 11, 21};

        // --- Print statements with Ranges ---
        System.out.println("--- Whole Numbers ---");
        System.out.println("Byte value: " + smallNumber + " (Range: -128 to 127)");
        System.out.println("Short value: " + mediumNumber + " (Range: -32,768 to 32,767)");
        System.out.println("Int value: " + age + " (Range: -2,147,483,648 to 2,147,483,647)");
        System.out.println("Long value: " + hugeNumber + " (Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)");

        System.out.println("\n--- Decimal Numbers ---");
        System.out.println("Float value: " + piValue + " (Range: up to 7 decimal digits of precision)");
        System.out.println("Double value: $" + price + " (Range: up to 15 decimal digits of precision)");

        System.out.println("\n--- Other Types ---");
        System.out.println("Char value: " + grade + " (Range: Any single character or Unicode 0 to 65,535)");
        System.out.println("String value: " + name + " (Range: Virtually unlimited text length)");
        System.out.println("Boolean value: " + isJavaFun + " (Range: Only 'true' or 'false')");
        System.out.println("Array value: " + luckyNumbers[0] + " (Range: Depends on the type of array elements)");

        char a='h';
        System.out.println(a+3);
    }
}
