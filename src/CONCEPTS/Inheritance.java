package CONCEPTS;

public class Inheritance {
  public void driver(){
      Employee e1 = new Employee();
      e1.setName("Aakash");
      System.out.println("Name of Employee: "+e1.getName());
      e1.setAge(22);
      System.out.println("Age of Employee: "+e1.getAge());
      e1.setSalary(100000);
      System.out.println("Salary of Employee: "+e1.getSalary());
  }
}

class Person{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Employee extends Person{
    private double salary;
    public void setSalary(double s){
        salary=s;
    }
    public double getSalary(){
        return salary;
    }
}
