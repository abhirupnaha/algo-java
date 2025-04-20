// Find common elements in two array. Print common element in order in which it
// it present in arr1

package algo.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Intersection {
    
    // considering no duplicate present in any array
    private void printIntersection1(Object[] arr1, Object[] arr2) {
        HashSet<Object> hs = new HashSet<>(Arrays.asList(arr2));

        for (Object elem : arr1)
            if (hs.contains(elem)) System.out.print(elem + " ");
        System.out.println();
    }

    // arrays might have duplicate values
    private void printIntersection11(Object[] arr1, Object[] arr2) {
        HashMap<Object, Boolean> hm = new HashMap<>();

        for (Object elem : arr2) hm.putIfAbsent(elem, true);

        for (Object elem : arr1)
            if (hm.containsKey(elem) && hm.get(elem)) {
                hm.put(elem, false);
                System.out.print(elem + " ");
            }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] arr1 = {2, 3, 5, 9, 2};
        Integer[] arr2 = {5, 2, 8};

        Intersection iOb = new Intersection();
        iOb.printIntersection1(arr1, arr2);
        iOb.printIntersection11(arr1, arr2);
    }
}