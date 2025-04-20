// Find subarray (continuous element) in whose sum is zero

package algo.hash;

import java.util.HashMap;

public class SubArraySumZero {
    
    // it finds the first subarray whose sum is zero
    private void printSubArray(Integer[] arr) {
        int prefixSum = 0;
        Integer start = 0, end = null;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i ++) {
            prefixSum += arr[i];

            if (prefixSum == 0) {
                end = i;
            }

            if (hm.containsKey(prefixSum)) {
                end = i;
                start = hm.get(prefixSum) + 1;
                break;
            }

            hm.put(prefixSum, i);
        }

        if (end == null) {
            System.out.println("No such subArray exists");
            return;
        }

        for (int i = start; i <= end; i ++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // finds first subarray whose sum is zero
    private void naive(Integer[] arr) {
        int sum = 0;
        Integer start = null, end = null;

        outerloop: 
        for (int i = 0; i < arr.length; i ++) {
            sum = 0;
            for (int j = i; j < arr.length; j ++) {
                sum += arr[j];
                if (sum == 0) {
                    start = i;
                    end = j;
                    break outerloop;
                }
            }
        }

        if (end == null) {
            System.out.println("no such sub-array exists");
            return;
        }

        for (int i = start; i <= end; i ++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] arr1 = {1, 4, 13, -3, -10, 5};
        Integer[] arr2 = {-1, 4, -3, 5, 1};
        Integer[] arr3 = {3, 1, -2, 5, 6};
        Integer[] arr4 = {5, 6, 0, 8};

        SubArraySumZero sOb = new SubArraySumZero();
        
        System.out.println("\nhash impl");
        sOb.printSubArray(arr1);
        sOb.printSubArray(arr2);
        sOb.printSubArray(arr3);
        sOb.printSubArray(arr4);

        System.out.println("\nnaive impl");
        sOb.naive(arr1);
        sOb.naive(arr2);
        sOb.naive(arr3);
        sOb.naive(arr4);
    }
}
