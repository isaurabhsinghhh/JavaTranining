package day04_practice;

import java.util.*;

public class ZeroToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of an array:");
        int l = sc.nextInt();

        int[] arr = new int[l];

        System.out.println("Enter the elements:");
        for(int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }

        int index = 0;

        
        for(int i = 0; i < l; i++) {
            if(arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        
        while(index < l) {
            arr[index] = 0;
            index++;
        }

        System.out.println("Array after moving zeros to the right:");
        for(int i = 0; i < l; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}