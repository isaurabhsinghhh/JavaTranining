package Day2;
import java.util.*;

public class passwordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "Saurabh123@";
        String inputPass;
        for(int i=1;i<=3;i++){
            System.out.println("Enter Your Password");
            inputPass = sc.nextLine();

            if(password.equals(inputPass)){
            System.out.println("Granted Access!");
            break;
            }else{
            System.out.println("Password not matched!");
              if(i==3){
                System.out.println("Logged out");
                break;
            }
            }
    }
    
}
}
