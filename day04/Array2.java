package day04;

import java.util.*;

public class Array2 {
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
        int key=sc.nextInt();
        int c=0;

        for(int i=0;i<l;i++){
            System.out.println(b[i]);

            if(key==b[i]){
                System.out.println("Key founded at: "+(i+1));
                c=1;
                break;
            }
        }

        if(c==0){
            System.out.println("Key not found!!");
        }

    }
    
}

