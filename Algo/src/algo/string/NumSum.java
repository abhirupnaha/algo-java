/*
 * Sum of numbers present in a string
 * O/P - ab13c43d2
 * I/P - 13 + 43 + 2 = 58
 */

package algo.string;

import java.util.Scanner;

class NumSum {
    public static void main(String[] args) {
        String st;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter string: ");
            st = sc.nextLine();
        }

        int sum = 0, i = 0, n;

        while (i < st.length()) {
            n = 0;
            while (
                (i < st.length()) &&
                (st.charAt(i) >= '0') &&
                (st.charAt(i) <= '9')
            ) {
                n = (n * 10) + (st.charAt(i) - '0');
                i ++;
            }
            sum += n;
            i ++;
        }

        System.out.println("sum = " + sum);
    }
}
