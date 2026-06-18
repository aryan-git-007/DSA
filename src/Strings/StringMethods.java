package Strings;
public class StringMethods {
    public static void main(String[] args) {

        String s1 = "Hello World";
        String s2 = "  Java Programming  ";
        String s3 = "hello world";

        // =========================================
        // 1. LENGTH
        // =========================================
        System.out.println("=== LENGTH ===");
        System.out.println(s1.length());                    // 11

        // =========================================
        // 2. CASE CONVERSION
        // =========================================
        System.out.println("\n=== CASE CONVERSION ===");
        System.out.println(s1.toUpperCase());               // HELLO WORLD
        System.out.println(s1.toLowerCase());               // hello world

        // =========================================
        // 3. TRIM & STRIP
        // =========================================
        System.out.println("\n=== TRIM & STRIP ===");
        System.out.println(s2.trim());                      // Java Programming
        System.out.println(s2.strip());                     // Java Programming
        System.out.println(s2.stripLeading());              // Java Programming
        System.out.println(s2.stripTrailing());             //   Java Programming

        // =========================================
        // 4. CHARAT & INDEX
        // =========================================
        System.out.println("\n=== CHARAT & INDEX ===");
        System.out.println(s1.charAt(0));                   // H
        System.out.println(s1.indexOf('o'));                // 4
        System.out.println(s1.lastIndexOf('o'));            // 7
        System.out.println(s1.indexOf("World"));           // 6

        // =========================================
        // 5. SUBSTRING
        // =========================================
        System.out.println("\n=== SUBSTRING ===");
        System.out.println(s1.substring(6));                // World
        System.out.println(s1.substring(0, 5));             // Hello

        // =========================================
        // 6. REPLACE
        // =========================================
        System.out.println("\n=== REPLACE ===");
        System.out.println(s1.replace('l', 'r'));           // Herro Worrd
        System.out.println(s1.replace("World", "Java"));   // Hello Java
        System.out.println(s1.replaceAll("[aeiou]", "*")); // H*ll* W*rld
        System.out.println(s1.replaceFirst("[l]", "r"));   // Herlo World

        // =========================================
        // 7. CONTAINS, STARTSWITH, ENDSWITH
        // =========================================
        System.out.println("\n=== CONTAINS / STARTS / ENDS ===");
        System.out.println(s1.contains("World"));          // true
        System.out.println(s1.startsWith("Hello"));        // true
        System.out.println(s1.endsWith("World"));          // true

        // =========================================
        // 8. EQUALS & COMPARE
        // =========================================
        System.out.println("\n=== EQUALS & COMPARE ===");
        System.out.println(s1.equals("Hello World"));          // true
        System.out.println(s1.equalsIgnoreCase(s3));           // true
        System.out.println(s1.compareTo("Hello World"));       // 0
        System.out.println(s1.compareToIgnoreCase(s3));        // 0

        // =========================================
        // 9. SPLIT
        // =========================================
        System.out.println("\n=== SPLIT ===");
        String words[] = s1.split(" ");
        for(String word : words){
            System.out.println(word);                       // Hello  World
        }

        // =========================================
        // 10. JOIN & CONCAT
        // =========================================
        System.out.println("\n=== JOIN & CONCAT ===");
        System.out.println(String.join("-", "Hello", "World"));  // Hello-World
        System.out.println(s1.concat(" !!"));                    // Hello World !!

        // =========================================
        // 11. ISEMPTY & ISBLANK
        // =========================================
        System.out.println("\n=== ISEMPTY & ISBLANK ===");
        String empty = "";
        String blank = "   ";
        System.out.println(empty.isEmpty());               // true
        System.out.println(blank.isEmpty());               // false
        System.out.println(blank.isBlank());               // true

        // =========================================
        // 12. VALUEOF & TOCHARARRAY
        // =========================================
        System.out.println("\n=== VALUEOF & TOCHARARRAY ===");
        System.out.println(String.valueOf(100));            // "100"
        System.out.println(String.valueOf(3.14));           // "3.14"
        System.out.println(String.valueOf(true));           // "true"

        char ch[] = s1.toCharArray();
        for(char c : ch){
            System.out.print(c + " ");                     // H e l l o   W o r l d
        }

        // =========================================
        // 13. REPEAT & INTERN
        // =========================================
        System.out.println("\n\n=== REPEAT ===");
        System.out.println("Ha".repeat(3));                // HaHaHa

        // =========================================
        // 14. MATCHES
        // =========================================
        System.out.println("\n=== MATCHES ===");
        System.out.println(s1.matches("Hello World"));     // true
        System.out.println(s1.matches("[A-Za-z ]+"));      // true

        // =========================================
        // 15. FORMAT
        // =========================================
        System.out.println("\n=== FORMAT ===");
        String formatted = String.format("Name: %s, Age: %d", "Alice", 25);
        System.out.println(formatted);                     // Name: Alice, Age: 25
    }
}