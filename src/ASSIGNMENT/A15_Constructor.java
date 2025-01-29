package ASSIGNMENT;
import javax.swing.*;
import java.util.Scanner ;

public class A15_Constructor {
     public void driver(){
         Person c1 = new Person();
         Employee e1 = new Employee();
         Box b1 = new Box();
     }


}

class Person {
  private String name;
  private int age;

  public Person(){
    name = "Anonymous";
    age = 0;
  }
  public Person(String name){
      this.name = name;
  }
  public Person(int age){
   this.age = age;
  }
  public Person(String name , int age){
    this.name = name;
    this.age = age;
  }

}

class Employee{
    private int empid;
    private String name;
    private double salary;
    private static int objectCount;

    private static int generateEmpid(){
        return objectCount+1;
    }

    public Employee(){
        objectCount++;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter name of Employee");
       name=sc.nextLine();
        System.out.println("Enter Salary of employee");
        salary=sc.nextDouble();
        empid=generateEmpid();
    }
    public Employee(String name , double salary){
        objectCount++;
        this.name = name;
        this.salary=salary;
        empid=generateEmpid();
    }

}

class Box{
    private int length , breadth ,height;
    public Box(){

    }
    public Box(int side){
        length=side;
        breadth= side;
        height=side;
    }
    public Box(int l , int b, int h){
       length=l;
       breadth=b;
       height=h;
    }
}

