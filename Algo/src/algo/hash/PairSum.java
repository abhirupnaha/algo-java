// Pairs (two element) in array whoes sum is been specified

package algo.hash;

import java.util.HashSet;

class PairSum {
    
    // time complexity - O(n)
    // space complexity - O(n)
    private boolean pairSumExists(Integer[] arr, int sum) {
        HashSet<Integer> hs = new HashSet<>();

        for (Integer elem : arr) {
            if (hs.contains(sum - elem)) return true;
            else hs.add(elem);
        }

        return false;
    }

    // time complexity - O(n^2)
    // space complexity - O(1)
    private boolean naive(Integer[] arr, int sum) {
        for (int i = 0; i < arr.length; i ++) {
            for (int j = i + 1; j < arr.length; j ++) {
                if (arr[i] + arr[j] == sum) return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Integer[] arr1 = {3, 2, 8, 15, -8};
        Integer[] arr2 = {2, 1, 6, 3};
        Integer[] arr3 = {2, 1, 6, 3};

        PairSum pOb = new PairSum();
        
        System.out.println("hashset approach");
        boolean present = pOb.pairSumExists(arr1, 17);
        System.out.println(present);

        present = pOb.pairSumExists(arr2, 6);
        System.out.println(present);

        present = pOb.pairSumExists(arr3, 3);
        System.out.println(present);


        System.out.println("naive approach");
        present = pOb.naive(arr1, 17);
        System.out.println(present);

        present = pOb.naive(arr2, 6);
        System.out.println(present);

        present = pOb.naive(arr3, 3);
        System.out.println(present);
    }
}
