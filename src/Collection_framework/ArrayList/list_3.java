package Collection_framework.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class list_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(41);
        list.add(49);
        list.add(76);
        list.add(56);
        list.add(12);
        list.add(6);
        Collections.sort(list);
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>(list);
        System.out.println(list2);;
        list2.ensureCapacity(6);
list2.add(74);
        list2.add(52);
        list2.add(74);
        System.out.println(list2);

        System.out.println(list2.isEmpty());
        System.out.println(list.indexOf(6+6));
    }
}
