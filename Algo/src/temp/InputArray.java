package temp;

import java.util.Scanner;

class InputArray {
    public static void main(String[] args) {
        int[] arr = null;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a array of number seperated by comma(,)");
            String[] stArr = sc.nextLine().split(",");
            arr = new int[stArr.length];
            for (int i = 0; i < arr.length; i ++)
                arr[i] = Integer.parseInt(stArr[i]);
        } catch (NumberFormatException e) {
            System.out.println("only numbers are allowed");
            return;
        } catch (RuntimeException e) {
            System.out.println("something went wrong");
            System.out.println(e.getMessage());
            e.printStackTrace();
            return;
        }

        System.out.println("the array is");
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
}
