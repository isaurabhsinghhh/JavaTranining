package day04_practice;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int l = sc.nextInt();
        int[] a = new int[l];

        System.out.println("Enter the elements: ");

        for(int i=0;i<l;i++){
            a[i]=sc.nextInt();
        }
        
        System.out.print("The original array is: ");

        for(int i=0;i<l;i++){
            System.out.print(a[i]);
        }

        int start=0;
        int end=l-1;

        while(start<end){

            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start++;
            end--;

            }

            System.out.println("Reversed array is: ");

            for(int i=0;i<l;i++){
                System.out.print(a[i]);
            }
        }


    }

