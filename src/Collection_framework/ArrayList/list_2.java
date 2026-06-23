package Collection_framework.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class list_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(41);
        list.add(43);
        list.add(45);
        list.add(47);
        list.add(49);
        list.add(51);
        System.out.println(list);

        list.set(1,42);
        System.out.println(list);
        System.out.println(list.get(3));

        List<Integer> list2 = new ArrayList<>();
        list2.add(41);
        list2.add(43);
        list2.add(45);
        list2.add(47);
        list2.add(49);
        list2.add(51);
//        System.out.println(list2);
   Object[] arr=list2.toArray();
   for(Object num:arr){
       System.out.println(num);
   }

        System.out.println(list2.contains(51));
    }
}
