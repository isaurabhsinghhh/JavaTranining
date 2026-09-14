package day04_practice;

import java.util.*;

public class TransposeOfMatrices {
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

        System.out.println("Original Matrix is: ");

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println(a[i][j]);
            }
        }

        int[][] trans = new int[c][r];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
            trans[j][i]=a[i][j];
            }
        }

        System.out.println("Transposed Matrix is: ");

        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
            System.out.println(trans[i][j]);
            }
        }

    }
}
