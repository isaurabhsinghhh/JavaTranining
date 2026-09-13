package day03;

public class car {
    String brand;
    String model;
    double price;

    public void setDetails(String brand,String model,double price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    
    public void getDetails(){
        System.out.println("This Car brand is  "+brand);
        System.out.println("This Car model is "+model);
        System.out.println("This Car price is "+price);
    }

    public static void main(String[] args) {
        car c1 = new car();
        car c2 = new car();
        c1.setDetails("Toyota","Fortuner", 5000000);
        c2.setDetails("Mahindra","Thar", 2000000);

        c1.getDetails();
        c2.getDetails();
    }
}
