package day04_practice;

import java.util.Scanner;

public class MultiplicationOfMatrices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //input for the first matrices

        System.out.println("Enter number of rows: ");
        int r1=sc.nextInt();
        System.out.println("Enter number of columns: ");
        int c1=sc.nextInt();

        int[][] a = new int[r1][c1];


        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }

        //input for the second matrices

        System.out.println("Enter number of rows: ");
        int r2=sc.nextInt();
        System.out.println("Enter number of columns: ");
        int c2=sc.nextInt();
        int[][] b = new int[r2][c2];

        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }


        //printing the matrices

        System.out.println("First Matrix is: ");

        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.println(a[i][j]);
            }
        }

        System.out.println("Second Matrix is: ");

        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                System.out.println(b[i][j]);
            }
        }

        //Multiplication logic 

        int[][] c = new int[r1][c2];

        if(c1==r2){

            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    for(int k=0;k<c1;k++){
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }

            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                        System.out.println(c[i][j]);
                    }
                }
            }else{
            System.out.println("Enter valid matrices for Multiplication!!");
        }

    }
}