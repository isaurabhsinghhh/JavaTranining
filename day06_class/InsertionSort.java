import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Length of array: ");
        int length = sc.nextInt();
        int[] arr = new int[length];


        System.out.println("Enter the elements: ");

        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("The elements are: ");

        for(int i=0; i<length;i++){
            System.out.println(arr[i] +" ");
        }

        //logic

        for(int i=1;i<length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }


        System.out.println("Sorted array is: ");

        for(int i=0;i<length;i++){
            System.out.println(arr[i] + " ");
        }
    }
}
