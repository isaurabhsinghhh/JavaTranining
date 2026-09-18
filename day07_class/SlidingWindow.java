package day07_class;

public class SlidingWindow {

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};

        int k = 3;

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }

        int maxSum = sum;

        for (int i = k; i < arr.length; i++) {

            sum = sum + arr[i];       
            sum = sum - arr[i - k];   

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        System.out.println("Maximum sum = " + maxSum);
    }
}