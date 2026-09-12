import java.util.*;

public class strongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        for(int i=0;i<number;i++){
            if(number%i==0){
                sum=sum+i;
            }

            if(sum==number){
                System.out.println(number+ " is a Strong Number");
            }else{
                System.out.println(number+ " is not a Strong Number");
            }
        }
    }
    
}
