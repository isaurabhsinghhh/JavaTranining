package day02;
import java.util.*;

public class factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number from 1 to 10: ");
		int number = sc.nextInt();
        
		int factorial=1;

        if(number>10){
            System.out.println("Enter the valid number");
		}else{
			for (int i = 1; i <= number; i++) {
			factorial *= i;
			}	
		}
		System.out.println("Factorial of is " + factorial);
	}
}
