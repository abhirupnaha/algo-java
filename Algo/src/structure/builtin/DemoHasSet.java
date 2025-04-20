package structure.builtin;

import java.util.HashSet;
import java.util.Iterator;

class DemoHasSet {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(5);

        boolean bol = hs.add(34);
        System.out.println(bol); // true

        bol = hs.add(77);
        System.out.println(bol); // true

        bol = hs.add(77);
        System.out.println(bol); // false

        hs.add(23);

        System.out.println(hs); // [77, 34, 23], order is not preserved

        bol = hs.contains(77);
        System.out.println(bol); // true

        Iterator<Integer> it = hs.iterator();
        while (it.hasNext()) {
            int i = it.next();

            System.out.println(i);
        }

        for (Integer i : hs)
            System.out.print(i + " ");
        System.out.println();

        bol = hs.remove(77);
        System.out.println(bol); // true

        bol = hs.remove(1222);
        System.out.println(bol); // false

        bol = hs.contains(77);
        System.out.println(bol); // false

        for (int i : hs)
            System.out.println(i);

        hs.clear();

        bol = hs.isEmpty();
        System.out.println(bol); // true
    }
}
