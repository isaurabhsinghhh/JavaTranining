package Day2;
import java.util.*;

class New
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your units: ");
        int units = sc.nextInt();
        double bill;
        if((units>=0)&&(units<=100)){
            bill = units*0;
        }else if((units>=101)&&(units<=200)){
            bill = 100*0+(units-100)*7;
        }else if((units>=201)&&(units<=300)){
            bill = (100*0)+(100*7)+(units-200)*9;
        }else if((units>=301)&&(units<=400)){
            bill = (100*0)+(100*7)+(100*9)+(units-300)*12;
        }else{
        bill = (100*0)+(100*7)+(100*9)+(100*12)+(units-400)*15;
        }

        System.out.print("Your bill is: "+bill);
    }
}
