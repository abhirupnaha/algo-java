package algo.matrix;

class Multiplication {
    
    private int[][] mul(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i ++) {
            for (int j = 0; j < b[0].length; j ++) {
                for (int k = 0; k < b.length; k ++) // b.length == a[0].length
                {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] b = {
            {5, 8},
            {6, 9},
            {7, 10}
        };

        Multiplication ob = new Multiplication();
        int[][] result = ob.mul(a, b);

        for (int i = 0; i < result.length; i ++) {
            for (int j = 0; j < result[0].length; j ++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
