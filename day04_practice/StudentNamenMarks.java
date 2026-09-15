package day04_practice;

import java.util.*;

public class StudentNamenMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        int num = sc.nextInt();
        sc.nextLine();
        String[] name = new String[num];
        int[] marks = new int[num];

        

        for(int i=0;i<num;i++){
            System.out.print("Enter the Name of Student" +(i+1) +": ");
            name[i]=sc.nextLine();
        }
        for(int i=0;i<num;i++){
            System.out.print("Enter the Marks of Student" +(i+1) +": ");
            marks[i]=sc.nextInt();
        }

        System.out.println("Enter the Name to Search: ");
        sc.nextLine();
        String searchName = sc.nextLine();

        for(int i=0;i<num;i++){

            if(searchName.equalsIgnoreCase(name[i])){
                System.out.println("The sudent is: "+name[i]);
                System.out.println("The marks is: "+marks[i]);
                
            }
        }


    }
}
