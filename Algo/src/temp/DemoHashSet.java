package temp;

import java.util.HashSet;

class DemoHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        boolean r;

        hs.add(12);
        hs.add(55);
        hs.add(21);

        r = hs.add(14);
        System.out.println(r); // true

        r = hs.add(14);
        System.out.println(r); // false

        r = hs.remove(15);
        System.out.println(r); // false

        r = hs.remove(14);
        System.out.println(r); // true

        r = hs.add(14);
        System.out.println(r); // true

        int size = hs.size();
        System.out.println(size); // 4

        HashSet<Integer> hs2 = null;
        if (hs instanceof HashSet<Integer>)
            hs2 = (HashSet<Integer>) hs.clone();

        hs.clear();

        System.out.println(hs.size() + " " + hs.isEmpty());

        System.out.println(hs2);
    }
    
}
