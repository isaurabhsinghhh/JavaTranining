import java.util.*;

public class passwordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "Saurabh";
        System.out.println("Enter Your Password");
        String inputPass = sc.nextLine();
        if(password.equals(inputPass)){
            System.out.println("Granted Access!");
        }else{
            System.out.println("Password not matched!");
        }
    }
    
}
