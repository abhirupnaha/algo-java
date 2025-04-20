// Find the number of unique values in an array

package algo.hash;

import java.util.Arrays;
import java.util.HashSet;

class CountDistinctElem {

    // using HashSet
    // time complexity - O(n)
    // space complexity - O(n)
    private int getSize1(Object[] arr) {
        HashSet<Object> hs = new HashSet<>(arr.length);

        for (Object o : arr)
            hs.add(o);

        return hs.size();
    }

    // better implementation of getSize1()
    private int getSize11(Object[] arr) {
        HashSet<Object> hs = new HashSet<>(Arrays.asList(arr));
        return hs.size();
    }

    // average time complexity - Theta(n^2)
    // space complexity - O(1)
    private int getSize2(Object[] arr) {
        if (arr.length <= 1) return arr.length;

        int count = 1;
        Object key;
        boolean flag;

        for (int i = 1; i < arr.length; i ++) {
            key = arr[i];
            flag = false;
            for (int j = (i - 1); j >= 0; j --) {
                if (arr[j].equals(key))
                    flag = true;
            }
            if (!flag) count ++;
        }

        return count;
    }

    public static void main(String[] args) {
        Integer[] arr = {10, 20, 10, 20, 30, 40, 40, 30, 10, 45};

        CountDistinctElem cObj = new CountDistinctElem();

        int count = cObj.getSize2(arr);
        System.out.println(count);

        count = cObj.getSize1(arr);
        System.out.println(count);

        count = cObj.getSize11(arr);
        System.out.println(count);
    }
}
