import java.util.Scanner;

public class QuickSort {

    static void quickSort(int[] arr, int start, int end){

        if(start < end){

            int pivotIndex = partition(arr, start, end);

            quickSort(arr, start, pivotIndex-1);
            quickSort(arr, pivotIndex, end);
        }
    }

    static int partition(int[] arr, int start, int end){

        int pivot = arr[(start+end)/2];

        while(start <= end){

            while(arr[start] < pivot){
                start++;
            }

            while(arr[end] > pivot){
                end--;
            }

            if(start <= end){

                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }

        return start;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Length of array: ");

        int length = sc.nextInt();

        int[] arr = new int[length];

        System.out.println("Enter the elements: ");

        for(int i=0;i<length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The elements are: ");

        for(int i=0;i<length;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.println("Sorted array: ");

        quickSort(arr, 0, length-1);

        for(int i=0;i<length;i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}