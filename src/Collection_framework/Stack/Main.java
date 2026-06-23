package Collection_framework.Stack;

import java.util.Iterator;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Create a Stack to hold String elements
        Stack<String> cards = new Stack<>();

        System.out.println("--- 1. METHOD: empty() ---");
        // Method 1: empty() - Checks if the stack is completely empty. Returns a boolean.
        System.out.println("Is the stack empty initially? " + cards.empty()); // true
        System.out.println();


        System.out.println("--- 2. METHOD: push(E item) ---");
        // Method 2: push(E item) - Adds an element to the top of the stack.
        cards.push("Ace of Spades"); // Bottom of the stack
        cards.push("King of Hearts");
        cards.push("Queen of Diamonds"); // Top of the stack

        System.out.println("Stack after pushing 3 items: " + cards);
        System.out.println();


        System.out.println("--- 3. METHOD: peek() ---");
        // Method 3: peek() - Looks at the element at the top of the stack without removing it.
        String topCard = cards.peek();
        System.out.println("The item currently at the top is: " + topCard); // Queen of Diamonds
        System.out.println("Stack check (unchanged): " + cards);
        System.out.println();


        System.out.println("--- 4. METHOD: search(Object o) ---");
        // Method 4: search(Object o) - Returns the 1-based position of the item from the top.
        // It counts from the top down (Top item is 1, next is 2, etc.). Returns -1 if not found.
        int position = cards.search("King of Hearts");
        System.out.println("1-based position of 'King of Hearts' from the top: " + position); // 2

        int missingPosition = cards.search("Joker");
        System.out.println("Position of a missing item ('Joker'): " + missingPosition); // -1
        System.out.println();


        System.out.println("--- 5. METHOD: pop() ---");
        // Method 5: pop() - Removes and returns the element at the top of the stack.
        String poppedCard = cards.pop(); // Removes and returns "Queen of Diamonds"

        System.out.println("Popped item: " + poppedCard);
        System.out.println("Stack after pop execution: " + cards); // [Ace of Spades, King of Hearts]


        Stack<Integer> st=new Stack<>();
        Iterator<Integer> i= st.iterator();
        System.out.println(st.isEmpty());


        st.push(51);
        st.push(52);
        st.push(53);
        st.push(54);
        st.push(55);
        st.push(56);
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());

        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.isEmpty();
        System.out.println(st);
    }

}