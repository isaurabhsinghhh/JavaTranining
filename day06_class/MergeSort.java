import java.util.Scanner;

public class MergeSort {

    static void mergeSort(int[] arr, int start, int end){

        if(start < end){

            int mid = (start + end) / 2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);

            merge(arr, start, mid, end);
        }
    }

    static void merge(int[] arr, int start, int mid, int end){

        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i=0;i<n1;i++){
            left[i] = arr[start + i];
        }

        for(int j=0;j<n2;j++){
            right[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = start;

        while(i < n1 && j < n2){

            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }

            k++;
        }

        while(i < n1){
            arr[k] = left[i];
            i++;
            k++;
        }

        while(j < n2){
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args){

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

        mergeSort(arr, 0, length - 1);

        System.out.println("Sorted array: ");

        for(int i=0;i<length;i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}