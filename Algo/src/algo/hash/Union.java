// Print union of two unsorted array

package algo.hash;

import java.util.Arrays;
import java.util.HashSet;

class Union {
    
    // time complexity - theta(m + n)
    // space complexity - O(m + n)
    private void printUnion(Object[] arr1, Object[] arr2) {
        HashSet<Object> hs = new HashSet<>(Arrays.asList(arr1));
        
        for (Object elem : arr2) 
            if (!hs.contains(elem)) hs.add(elem);

        for (Object elem : hs)
            System.out.print(elem + " ");
        System.out.println();
    }

    private void naive(Object[] arr1, Object[] arr2) {
        Object[] temp = new Object[arr1.length + arr2.length];
        int tempSize = 0;
        boolean flag;

        for (Object elem : arr1) {
            flag = false;
            for (int i = 0; i < tempSize; i ++) {
                if (temp[i].equals(elem)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                temp[tempSize] = elem;
                tempSize ++;
            }
        }

        for (Object elem : arr2) {
            flag = false;
            for (int i = 0; i < tempSize; i ++) {
                if (temp[i].equals(elem)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                temp[tempSize] = elem;
                tempSize ++;
            }
        }

        for (int i = 0; i < tempSize; i ++)
            System.out.print(temp[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] arr1 = {2, 3, 5, 9, 2};
        Integer[] arr2 = {5, 2, 8};

        Union uOb = new Union();

        uOb.printUnion(arr1, arr2);

        uOb.naive(arr1, arr2);
    }
}
