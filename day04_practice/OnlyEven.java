package day04_practice;

import java.util.Scanner;

public class OnlyEven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of an array ");
        int l = sc.nextInt();
        int[] a = new int[l];
        int num;

        System.out.println("Enter the elements: ");

        for(int i=0;i<l;i++){
            num=sc.nextInt();
            if(num%2==0){
                a[i]=num;
            }else{
                System.out.println("Enter even elements!!");
                i--;
            }
            
        }
    }
}
