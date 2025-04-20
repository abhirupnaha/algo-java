// print frequencies of each element in array

package algo.hash;

import java.util.HashMap;

class Frequecy {
    
    // average time complexity - theta(n)
    // space complexity - O(n)
    private HashMap<Object, Integer> getElemFreq(Object[] arr) {
        HashMap<Object, Integer> hm = new HashMap<>(arr.length);

        for (Object o : arr) {
            if (hm.containsKey(o)) {
                hm.put(o, (hm.get(o) + 1));
            } else {
                hm.put(o, 1);
            }
        }

        return hm;
    }

    // better getElmeFreq implementation
    private HashMap<Object, Integer> getElemFreq11(Object[] arr) {
        HashMap<Object, Integer> hm = new HashMap<>(arr.length);

        for (Object elem : arr) {
            hm.put(elem, hm.getOrDefault(elem, 0) + 1);
        }

        return hm;
    }

    // time complexity - O(n^2)
    // space complexity - 0(1)
    void getElemFreq2(Object[] arr) {
        Object key;
        int count;

        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] == null) continue;
            
            key = arr[i];
            count = 0;
            for (int j = 0; j < arr.length; j ++) {
                if (arr[j] == null) continue;

                if (arr[j].equals(key)) {
                    arr[j] = null;
                    count ++;
                }
            }
            System.out.println(key + " -> " + count);
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {10, 20, 10, 20, 30, 40, 40, 30, 10, 45};
        
        Frequecy fOb = new Frequecy();

        HashMap<Object, Integer> hm = fOb.getElemFreq(arr);
        System.out.println(hm);

        hm = fOb.getElemFreq11(arr);
        System.out.println(hm);

        fOb.getElemFreq2(arr);
    }
}
