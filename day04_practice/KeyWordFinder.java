package day04_practice;

import java.util.Scanner;

public class KeyWordFinder {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the paragraph: ");
        String para = sc.nextLine();

        String[] words = para.split(" ");

        for(int i=0;i<words.length;i++){
            System.out.println(words[i]);
        }

        System.out.print("Enter the keyword: ");
        String key = sc.nextLine();

        for(int i=0;i<words.length;i++){
            if(key.equals(words[i])){
                System.out.println("Found at index: "+(i-1));
            }
        }

        
    }
    
}
