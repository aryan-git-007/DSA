public class ConditionalsDemo {
    public static void main(String[] args) {
        int score = 85;
        boolean hasId = true;
        boolean isSuspended = false;

        // ==========================================
        // 1. IF STATEMENT (Single condition)
        // ==========================================
        System.out.println("--- 1. Simple If ---");
        if (score >= 50) {
            System.out.println("You passed the test!");
        }

        // ==========================================
        // 2. IF-ELSE STATEMENT (Two choices)
        // ==========================================
        System.out.println("\n--- 2. If-Else ---");
        int age = 16;
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("Too young to vote.");
        }

        // ==========================================
        // 3. IF-ELSE-IF LADDER (Multiple independent choices)
        // ==========================================
        System.out.println("\n--- 3. If-Else-If Ladder ---");
        // Evaluates from top to bottom; stops at the first true condition
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B"); // This will run for score = 85
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // ==========================================
        // 4. NESTED IF-ELSE (An if inside another if)
        // ==========================================
        System.out.println("\n--- 4. Nested If-Else ---");
        // Used when a second condition depends entirely on the first one passing
        if (hasId) {
            if (!isSuspended) {
                System.out.println("Welcome to the campus!");
            } else {
                System.out.println("Access denied: You are suspended.");
            }
        } else {
            System.out.println("Access denied: No ID found.");
        }

        // ==========================================
        // 5. TERNARY OPERATOR (Short-hand for if-else)
        // ==========================================
        System.out.println("\n--- 5. Ternary Operator ---");
        // Syntax: variable = (condition) ? value_if_true : value_if_false;
        String result = (score >= 50) ? "Pass" : "Fail";
        System.out.println("Exam Status: " + result);

        // ==========================================
        // 6. SWITCH STATEMENT (Testing one variable against fixed values)
        // ==========================================
        System.out.println("\n--- 6. Switch Statement ---");
        int dayNum = 5;

        switch (dayNum) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday"); // This will execute
                break; // 'break' stops the switch so it doesn't fall through to case 4
            case 4:
                System.out.println("Thursday");
                break;
            default: // Runs if none of the cases match
                System.out.println("Weekend or Invalid Day");
                break;
        }
    }
}
