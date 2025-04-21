package algo.string;

import java.util.Scanner;

class DigitSum {
    public static void main(String[] args) {
        String st;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter String: ");
            st = sc.nextLine();
        }
        
        int sum = 0, temp;
        int[] bounds = {(int) '0', (int) '9'};

        for (int i = 0; i < st.length(); i ++) {
            temp = (int) st.charAt(i);
            if (temp >= bounds[0] && temp <= bounds[1]) {
                sum += (temp - bounds[0]);
            }
        }

        System.out.println("sum = " + sum);
    }
}
