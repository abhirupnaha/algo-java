package structure.builtin;

import java.util.ArrayList;
import java.util.Collections;

class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> testList = new ArrayList<>(13);
        System.out.println(testList); // is empty even though initial capacity is 13
        System.out.println(testList.size());

        ArrayList<Integer> list = new ArrayList<>();
        
        // add elements (adds element in last)
        list.add(11);
        list.add(23);
        list.add(33);
        list.add(44);

        System.out.println(list);

        // get elements (does not remove element)
        int elem = list.get(2);

        System.out.println(elem);

        // add element in between
        list.add(2, 1234);

        System.out.println(list);

        // change value in perticular index
        list.set(2, 999);

        System.out.println(list);


        // delete element
        list.remove(2);
        
        System.out.println(list);

        // delete last and first element
        list.removeLast();
        list.removeFirst();

        System.out.println(list);

        // size of arrayList
        System.out.println(list.size());

        // sort
        list.add(5);
        list.add(3);
        Collections.sort(list);
        System.out.println(list);
    }
}
