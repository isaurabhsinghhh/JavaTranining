package day04;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the Array: ");
        int l = sc.nextInt();
        int[] b = new int[l];
    
        

        for(int i=0;i<l;i++){
            System.out.println("Please enter the values");
            b[i]=sc.nextInt();      
        }

        System.out.print("Enter the key: ");
        int key = sc.nextInt();
        int c=0;

        int start = 0;
        int end =(l-1);

        while (start<=end) {
            int mid = (start+end)/2;
            if(key==b[mid]){
                System.out.println("element found at position: "+mid);
                c=1;
                break;

            }

            if(key<b[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
            
        }

        for(int i=0;i<l;i++){
            System.out.println(b[i]);    
            }

        if(c==0){
            System.out.println("Key not found!!");
        }
    }        
}

