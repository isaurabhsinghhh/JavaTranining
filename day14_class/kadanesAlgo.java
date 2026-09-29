package day14_class;

import java.util.Scanner;

public class kadanesAlgo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array length must be greater than 0.");
            sc.close();
            return;
        }

        long[] a = new long[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long currentSum = a[0];
        long maxSum = a[0];

        for (int i = 1; i < n; i++) {
            currentSum = Math.max(a[i], currentSum + a[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("Maximum subarray sum is: " + maxSum);
        sc.close();
    }
}