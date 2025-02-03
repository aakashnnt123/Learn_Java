package ASSIGNMENT;
import java.util.Scanner;

public class A16_Inheritance {
    public void driver(){
        Employee1 e1 = new Employee1();
        e1.inputEmployee();
        e1.displayEmployee();
    }
}

class Person1{
    private String name;
    private int age;
    protected void setName(String s){
        name =s ;
    }
    protected void setAge(int a){
        age = a;
    }
    protected String getName(){
        return name;
    }
    protected int getAge(){
        return age;
    }

}
class Employee1 extends Person1{
    private double salary;
    public void inputEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name , age and salary of Employee");
        setName(sc.nextLine());
        setAge(sc.nextInt());
        salary = sc.nextDouble();
    }
    public void displayEmployee(){
        System.out.println("Name "+getName());
        System.out.println("age "+getAge());
        System.out.println("Salary "+salary);
    }
}
