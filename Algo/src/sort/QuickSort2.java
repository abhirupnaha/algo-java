package sort;

class QuickSort2 {
    private void sort(int[] arr, int l, int u) {
        if (l >= u) return;

        int pivot = l, i = l + 1, j = u;

        swap(arr, pivot, (l + (int)(Math.random() * (u - l))));

        while (i <= j) {
            if (arr[i] < arr[pivot]) i ++;
            else if (arr[j] >= arr[pivot]) j --;
            else swap(arr, i, j);
        }
        swap(arr, pivot, j);
        pivot = j;

        sort(arr, l, pivot - 1);
        sort(arr, pivot + 1, u);
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 5, 2, 7, 9, 6, 8};

        (new QuickSort2()).sort(arr, 0, (arr.length - 1));

        for (int e : arr)
            System.out.print(e + " ");
        System.out.println();
    }
}
