package ASSIGNMENT;

public class A17_OverRiding_OverLoading {
    public void driver(){
    ThickCircle c1 = new ThickCircle();
    c1.setRadius(5);
    c1.setThickness(2);
    System.out.println(c1.getArea());
    }
}

class Circle1{
    private int radius;

    public void setRadius(int r){
        radius=r;
    }
    public int getRadius(){
        return radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
}
class ThickCircle extends Circle1{
    private int thickness;
    public void setThickness(int t ){
      thickness=t;
    }
    public int getThickness(){
        return thickness;
    }
    public double getArea(){
         return 3.14*((getRadius()+thickness)*(getRadius()+thickness))-super.getArea();
    }
}

class Person2{
     String name;
    int age;

    public void setPerson(String n){
        name = n;
    }
    public void setPerson(int a){
        age = a;

    }
    public void setPerson(int a , String n){
        name = n;
        age = a;
    }
}

class Rectangle{
    int length , breadth;
    String borderColour ;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void PrintBorderColour() {
        System.out.println("BorderColour:"+borderColour);

    }

    public void setBorderColour(String borderColour) {
        this.borderColour = borderColour;
    }

}

class FilledRectangle extends Rectangle{
    String fillColour;

    public String getFillColour() {
        return fillColour;
    }

    public void setFillColour(String fillColour) {
        this.fillColour = fillColour;
    }

    public void printRectangleColour(){
        System.out.println("fillColour"+fillColour);
        super.PrintBorderColour();
    }
}