public class OperatorsDemo {
    public static void main(String[] args) {

        // 1. Arithmetic Operators (Math)
        int a = 10;
        int b = 3;

        System.out.println("--- Arithmetic Operators ---");
        System.out.println("Addition (10 + 3): " + (a + b));
        System.out.println("Subtraction (10 - 3): " + (a - b));
        System.out.println("Multiplication (10 * 3): " + (a * b));
        System.out.println("Division (10 / 3): " + (a / b));      // Drops the remainder because they are ints
        System.out.println("Remainder/Modulus (10 % 3): " + (a % b)); // Gives the remainder of 10 divided by 3


        // 2. Relational / Comparison Operators (Result is always true or false)
        System.out.println("\n--- Relational Operators ---");
        System.out.println("Is 'a' greater than 'b'? (10 > 3): " + (a > b));
        System.out.println("Is 'a' less than 'b'? (10 < 3): " + (a < b));
        System.out.println("Are they equal? (10 == 3): " + (a == b));
        System.out.println("Are they NOT equal? (10 != 3): " + (a != b));


        // 3. Logical Operators (Combining true/false conditions)
        boolean hasId = true;
        boolean hasTicket = false;

        System.out.println("\n--- Logical Operators ---");
        // AND (&&) requires BOTH to be true
        System.out.println("Can enter? (Both true): " + (hasId && hasTicket));
        // OR (||) requires AT LEAST ONE to be true
        System.out.println("Can enter? (At least one true): " + (hasId || hasTicket));
        // NOT (!) reverses the value
        System.out.println("Opposite of hasId: " + (!hasId));


        // 4. Assignment & Shortcut Operators (Changing a variable's value)
        System.out.println("\n--- Assignment & Shortcut Operators ---");
        int score = 50;

        score += 10; // Same as: score = score + 10
        System.out.println("Score after += 10: " + score);

        score++;     // Same as: score = score + 1 (Increments by 1)
        System.out.println("Score after ++: " + score);

        int marks=1256;
        float new_marks= (float)marks;
        System.out.println(new_marks);
    }
}
