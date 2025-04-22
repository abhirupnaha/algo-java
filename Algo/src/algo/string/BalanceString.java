package algo.string;

import java.util.Scanner;

class BalanceString {
    public static void main(String[] args) {
        String st;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter string: ");
            st = sc.nextLine();
        }

        int i = 0, count = 0;
        String tempString = "";
        char tempChar;

        while (i < st.length()) {
            tempChar = st.charAt(i);
            do {
                tempString += tempChar;
                count ++;
                i ++;
            } while ((i < st.length()) && (st.charAt(i) == tempChar));
            
            if (count > 1) System.out.println(tempString);

            tempString = "";
            count = 0;
        }
    }
}
