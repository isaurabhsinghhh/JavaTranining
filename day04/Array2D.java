package day04;

import java.util.*;

public class Array2D {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of rows: ");
    int r=sc.nextInt();
    System.out.println("Enter number of columns: ");
    int c=sc.nextInt();

    int[][] a = new int[r][c];

    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            a[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.println("The array elements are: "+a[i][j]);
        }
    }
     
    }

}
