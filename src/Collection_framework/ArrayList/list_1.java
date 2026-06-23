package Collection_framework.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class list_1 {
    public static void main(String[] args) {
        //creating an object
        Collection<Integer> list=new ArrayList<>();

        // add element
        list.add(52);
        list.add(63);
        list.add(73);
        list.add(49);
        System.out.println(list);

        //remove an element
        list.remove(73);
        System.out.println(list);

        Collection<Integer> list2= new ArrayList<>();
        list2.add(520);
        list2.add(21);
        list2.add(63);

        //add all
        list.addAll(list2);
        System.out.println(list);

        //remove all
        list.removeAll(list2);
        System.out.println(list);

        //check the size
        System.out.println(list2.size());

        //clear all the elements
        System.out.println("List 2: "+ list2);
        list2.clear();
        System.out.println("cleared list 2: ");

       Collection<String> list3=new ArrayList<>();
        list3.add("Apple");
        list3.add("Banana");
        list3.add("Cherry");
        list3.add("Date");
        list3.add("Elderberry");
        list3.add("Fig");
        list3.add("Grape");
        list3.add("Honeydew");
        list3.add("Kiwi");
        list3.add("Lemon");
        System.out.println(list3);
        list.add(69);
        list.add(29);
        //traverse the list using iterator
        Iterator<Integer> i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
//        for(int num :list){
//            System.out.println(num);
//        }
    }
}
