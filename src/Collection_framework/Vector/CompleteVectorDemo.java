package Collection_framework.Vector;

import java.util.Vector;

public class CompleteVectorDemo {
    public static void main(String[] args) {

        // ==========================================
        // 1. INITIALIZATION & CAPACITY
        // ==========================================
        // Creating a Vector with an initial capacity of 5
        Vector<String> playlist = new Vector<>(5);

        System.out.println("--- 1. Initial State ---");
        System.out.println("Is playlist empty? " + playlist.isEmpty()); // true
        System.out.println("Initial Capacity: " + playlist.capacity());  // 5
        System.out.println("Initial Size: " + playlist.size());          // 0
        System.out.println();

        // ==========================================
        // 2. ADDING ELEMENTS
        // ==========================================
        // Appending elements to the end
        playlist.add("Song A");
        playlist.add("Song B");

        // Using the legacy addElement method
        playlist.addElement("Song C");

        // Inserting an element at a specific index
        playlist.add(1, "Bonus Track"); // Inserts at index 1, shifts others right

        System.out.println("--- 2. After Adding Elements ---");
        System.out.println("Current Playlist: " + playlist);
        // Output: [Song A, Bonus Track, B, Song C]
        System.out.println("Current Size: " + playlist.size()); // 4
        System.out.println();

        // ==========================================
        // 3. ACCESSING & SEARCHING
        // ==========================================
        System.out.println("--- 3. Accessing Elements ---");
        // Accessing by index
        System.out.println("Element at index 2: " + playlist.get(2)); // "Song B"

        // Fetching boundaries (First and Last elements)
        System.out.println("First Track: " + playlist.firstElement()); // "Song A"
        System.out.println("Last Track: " + playlist.lastElement());   // "Song C"

        // Searching for an element
        boolean containsSongB = playlist.contains("Song B");
        int indexOfBonus = playlist.indexOf("Bonus Track");

        System.out.println("Contains 'Song B'?: " + containsSongB);    // true
        System.out.println("Index of 'Bonus Track': " + indexOfBonus); // 1
        System.out.println();

        // ==========================================
        // 4. MODIFYING ELEMENTS
        // ==========================================
        System.out.println("--- 4. Modifying Elements ---");
        // set() replaces the element and returns the old one
        String replacedSong = playlist.set(1, "Remix Track");

        // Legacy setElementAt() replaces the element but returns void
        playlist.setElementAt("Cover Track", 3);

        System.out.println("Replaced element was: " + replacedSong);  // "Bonus Track"
        System.out.println("Updated Playlist: " + playlist);
        // Output: [Song A, Remix Track, Song B, Cover Track]
        System.out.println();

        // ==========================================
        // 5. REMOVING ELEMENTS
        // ==========================================
        System.out.println("--- 5. Removing Elements ---");
        // Remove by index (returns the removed object)
        String removedByIndex = playlist.remove(2); // Removes "Song B"

        // Remove by Object value (returns true if successfully found and removed)
        boolean isRemovedByValue = playlist.remove("Remix Track"); // true

        // Legacy removeElementAt() deletes by index and returns void
        playlist.removeElementAt(0); // Removes "Song A"

        System.out.println("Removed by index: " + removedByIndex);     // "Song B"
        System.out.println("Removed by value successful?: " + isRemovedByValue);
        System.out.println("Playlist after structural removals: " + playlist); // [Cover Track]
        System.out.println();

        // ==========================================
        // 6. CLEARING THE VECTOR
        // ==========================================
        System.out.println("--- 6. Clearing Vector ---");
        // Wipe all remaining data
        playlist.clear();

        System.out.println("Playlist after clear(): " + playlist); // []
        System.out.println("Final Size: " + playlist.size());       // 0
        System.out.println("Final Capacity: " + playlist.capacity()); // 5 (Capacity remains)
    }
}