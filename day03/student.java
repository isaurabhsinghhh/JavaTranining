package day03;

public class student {
    String name;
    int age;
    String course;

    public void setDetails(String name,int age,String course){
        this.name=name;
        this.age=age;
        this.course=course;
    }

    public void getDetails(){
        System.out.println("The Name is: "+name);
        System.out.println("The Age is: "+age);
        System.out.println("The Course is: "+course);
    }

    public static void main(String[] args) {
        student sc = new student();
        sc.setDetails("Saurabh Singh", 20,"BTech CSE");
        sc.getDetails();
    }
}
