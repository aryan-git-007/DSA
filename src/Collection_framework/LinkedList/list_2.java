package Collection_framework.LinkedList;

import java.util.LinkedList;

public class list_2 {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(98);
        ll.add(19);
        ll.add(72);
        ll.add(29);
        ll.add(29);
        ll.add(29);
        ll.add(55);
        ll.poll();
        ll.poll();
        System.out.println(ll);
        System.out.println(ll.peek());
        ll.offer(59);
        ll.offer(52);
        System.out.println(ll);
    }
}
