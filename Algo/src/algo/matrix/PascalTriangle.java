/*
Pascle triangle:-
          1
        1   1
      1   2    1
     1   3   3   1
   1   4   6   4   1
1   5   10  10  5   1

It can be represented in matrix as:-
1
1   1
1   2   1
1   3   3   1
1   4   6   4   1
1   5   10  10  5   1
 */

package algo.matrix;

class PascleTriangle {

    private int[][] getPascleTriangle(int n) {
        int[][] arr = new int[n][];

        for (int i = 0; i < n; i ++) {
            arr[i] = new int[i + 1];
            arr[i][0] = 1;
            arr[i][arr[i].length - 1] = 1;
        }

        for (int i = 1; i < n; i ++) {
            for (int j = 1; j < arr[i - 1].length; j ++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }

        return arr;
    }

    private void display(int[][] arr) {
        for (int i = 0; i < arr.length; i ++) {
            for (int j = arr.length - 1; j > i; j --)
                System.out.print(" ");
            for (int j = 0; j < arr[i].length; j ++) 
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PascleTriangle ob = new PascleTriangle();

        ob.display(ob.getPascleTriangle(5));

        ob.display(ob.getPascleTriangle(6));
    }
}