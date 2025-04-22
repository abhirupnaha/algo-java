package algo.string;

import java.util.Scanner;

class ReverseMid {
    private static void reverse(char[] chArr, int i, int j) {
        char temp;
        while (i < j) {
            temp = chArr[i];
            chArr[i] = chArr[j];
            chArr[j] = temp;
            i ++; j --;
        }
    }

    public static void main(String[] args) {
        String st;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            st = sc.nextLine();
        }

        char[] chArr = st.toCharArray();
        int mid = chArr.length/ 2;

        ReverseMid.reverse(chArr, 0, mid - 1);
        ReverseMid.reverse(
            chArr, 
            mid + (chArr.length % 2), 
            chArr.length - 1
        );

        String rev = new String(chArr);
        System.out.println(rev);
    }
}
