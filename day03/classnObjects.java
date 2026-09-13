package day03;

public class classnObjects {
    String name;
    int age; 
    int birthYear;
    double currentSalary;

    public void setDeatils(String name,int age,int birthYear,double currentSalary){
        this.name=name;
        this.age=age;
        this.birthYear=birthYear;
        this.currentSalary=currentSalary;
    }

    public void getDetails(){
        System.out.println("The Name is: "+name);
        System.out.println("The Age is: "+age);
        System.out.println("The Birth Year is: "+birthYear);
        System.out.println("The Current Salary is: "+currentSalary);
    }

    public static void main(String[] args) {
        classnObjects c = new classnObjects();
        c.setDeatils("Saurabh",22,2004,300000);
        c.getDetails();
    }

} 

