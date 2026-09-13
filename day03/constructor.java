package day03;

public class constructor {
    // thsi is an example of the constructor 

    int age;
    int year;
    String model;

    public constructor(int age,int year,String model){
        this.age=age;
        this.year=year;
        this.model=model;
    }
    public void getItems(){
        System.out.println("The age is: "+age);
        System.out.println("The year is: "+year);
        System.out.println("The model is: "+model);
    }

    public static void main(String[] args) {
        constructor c1=new constructor(20,30,"nulllllll");
        constructor c2=new constructor(787,22,"not given");

        c1.getItems();
        c2.getItems();
    }
}
