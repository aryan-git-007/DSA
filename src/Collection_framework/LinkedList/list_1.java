package Collection_framework.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class list_1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(98);
        ll.add(19);
        ll.add(72);
        ll.add(29);
        ll.add(29);
        ll.add(29);
        ll.add(55);


        System.out.println("index of an last element is: " + ll.lastIndexOf(29));
        Iterator<Integer> i = ll.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println(ll);
        ll.addFirst(52);
        ll.addLast(54);
        ll.removeLast();
        ll.removeLast();
        System.out.println(ll);

        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());


    }
}
