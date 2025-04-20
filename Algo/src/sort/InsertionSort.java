package sort;

class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 5, 2, 7, 9, 6, 8};
        int j, key;

        for (int i = 1; i < arr.length; i ++) {
            j = i - 1;
            key = arr[i];
            
            while (j > 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j --;
            }
            arr[j + 1] = key;
        }

        for (int e : arr)
            System.out.print(e + " ");
        System.out.println();
    }
}