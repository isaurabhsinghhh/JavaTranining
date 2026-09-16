package day05_class;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int l = sc.nextInt();
        int[] arr = new int[l];

        System.out.println("Enter the elements: ");

        for(int i=0;i<l;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("The elements are: ");

        for(int i=0; i<l;i++){
            System.out.print(arr[i] +" ");
        }

        for(int i=0;i<l-1;i++){
            int minIndex = i;
            for(int j=i+1;j<l;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }


        System.out.print("The sorted array is: ");

        for(int i=0; i<l;i++){
            System.out.print(arr[i] +" ");
        }
    }
    


}