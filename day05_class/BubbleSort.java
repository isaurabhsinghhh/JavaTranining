package day05_class;

import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Length of array: ");
        int length = sc.nextInt();
        int[] arr = new int[length];

        System.out.println("Enter the elements: ");

        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("The elements are: ");

        for(int i=0; i<length;i++){
            System.out.print(arr[i] +" ");
        }

        for(int i=0;i<length-1;i++){
            for(int j=0;j<length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.print("The sorted array is: ");

        for(int i=0; i<length;i++){
            System.out.print(arr[i] +" ");
        }
    }

}
