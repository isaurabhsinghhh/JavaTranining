package day04_practice;

import java.util.Scanner;

public class SumOfMatrices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
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

        int[][] sum= new int[r1][c1];

        if(r1==r2 && c1==c2){

            System.out.println("The sum is: ");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    sum[i][j]=a[i][j]+b[i][j];
                    System.out.println(sum[i][j]);
                }
            }
        }else{
            System.out.println("Plese enter the valid matrices for addition!!");
        }


    }
}
