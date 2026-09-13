package day02;
import java.util.*;

public class highestNo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first no.: ");
        int a = sc.nextInt();
        System.out.print("Enter the second no.: ");
        int b = sc.nextInt();
        System.out.print("Enter the third no.: ");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.print("Largest no. is: "+a);
        }else if(b>c && b>a){
            System.out.print("Largest no. is: "+b);
        }else{
            System.out.print("Largest no. is: "+c);
        }
    }

}
