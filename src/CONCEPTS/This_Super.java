package CONCEPTS;

public class This_Super {
  public  void driver(){
      A obj1  = new B();
      B obj2 = (B)obj1;
      obj2.f2();
  }
}
class A{
    int a=10;
  public void  f1(){
      System.out.println("Class a f1 call");
  }

}
class B extends A{
    int a=20;
     public void f1(){
         System.out.println("Class b f1 call");
     }
     public void f2(){
         int a=30;
         System.out.println("Print a of f2 of class b"+a);
         System.out.println("Print a  of class b"+this.a);
         System.out.println("Print a  of class a"+super.a);
         this.f1();
         super.f1();
     }


}
