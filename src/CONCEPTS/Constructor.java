package CONCEPTS;

public class Constructor {
    public void driver(){
//        Student s1 = new Student();
//        Student s2 = new Student();
        Student s3 = new Student(10 , "Aakash");
        Student s4 = new Student(s3);

    }

}
class Student{
  private int rollNo;
  private String name;

  //Non-Parameterized Constructor.
   public Student(){
        rollNo=1;
        name = "Dummy";
       System.out.println("Name: "+name+" RollNo: "+rollNo);
    }
    //Parameterized Constructor.
  public Student(int x , String Name){
     rollNo = x;
     name = Name;
      System.out.println("Name: "+name+" RollNo: "+rollNo);
  }
    //Copy Constructor.
    public Student(Student s){
       rollNo = s.rollNo;
       name = s.name;
       System.out.println("Name: "+name+" RollNo: "+rollNo);
    }
}
