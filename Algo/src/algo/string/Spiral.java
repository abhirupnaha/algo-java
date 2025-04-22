/*
 *      1   2   3   4   5
 *      16  17  18  19  6
 *      15  24  25  20  7
 *      14  23  22  21  8
 *      13  12  11  10  9
 */

package algo.string;

class Spiral {
    private int[][] create(int n) {
        int[][] arr = new int[n][n];

        int m = 1, r = 0, c = 0, size = n - 1;
        char dir = 'r';

        while (m <= 9) {
            switch (dir) {
                case 'r':
                    while (true) {
                        arr[r][c] = m ++;
                        if ((r + c) == (size - 1)) break;
                        c ++;
                    }
                    dir = 'd';
                    break;
                
                case 'd':
                    while (true) {
                        arr[r][c] = m++;
                        if (r == (c - 1)) break;
                        r ++;
                    }
                    dir = 'l';
                    break;
                
                // case 'l':
                //     while (true) {
                //         arr[r][c] = m ++;
                //         if (r + c == size) break;
                //         c --;
                //     }
                //     dir = 'u';
                //     break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = (new Spiral()).create(5);

        for (int[] i : arr) {
            for (int j : i)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
