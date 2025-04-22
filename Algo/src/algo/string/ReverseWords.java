/*
 * Reverse worlds in a string
 * I/P - "hello world"
 * O/P - "olleh dlrow"
 */

package algo.string;

import java.util.Scanner;

class ReverseWords {
    
    private static void reverse(char[] a, int i, int j) {
        char temp;
        while (i < j) {
            temp =  a[i];
            a[i] = a[j];
            a[j] = temp;
            i ++; j --;
        }
    }

    public static void main(String[] args) {
        String st;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter string: ");
            st = sc.nextLine();
        }

        char[] chArr = st.toCharArray();
        int i = 0, j = 0;

        while (j < chArr.length) {
            if (chArr[j] != ' ') {
                i = j;
                while ((j < chArr.length) && chArr[j] != ' ')
                    j ++;
                ReverseWords.reverse(chArr, i, j - 1);
            }
            j ++;
        }

        st = new String(chArr);
        System.out.println(st);
    }
}
