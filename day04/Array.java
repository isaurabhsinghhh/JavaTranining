package day04;

import java.util.*;

public class Array {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the Array: ");
        int l = sc.nextInt();
        int[] b = new int[l];
        int sum=0;
        

        for(int i=0;i<l;i++){
            System.out.println("Please enter the values");
            b[i]=sc.nextInt(); 
            sum=sum+b[i];        
        }

        for(int i=0;i<l;i++){
            System.out.println(b[i]);
        }

        System.out.print("The sum of array is: "+sum);
    }
    
}
