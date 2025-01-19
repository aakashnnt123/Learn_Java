package CONCEPTS;

public class Initialization_Static_Block {
    public void driver(){
        Box b1 = new Box(6,5,5);
        Box b2 = new Box();
        b1.showDimensions();
        b2.showDimensions();
    }

}

class Box{
    private int lenght, breadth , height;

    //Parameterized Constructor
    public Box(int l ,int b,int h){
        lenght=l;
        breadth=b;
        height = h;
    }
    //Non-Parameterized Constructor
    public Box(){}
    //Initialization block 1
    {
        lenght =10;
        breadth = 20;
        height =30;
    }
    //Initialization block 2
    {
        lenght =50;
        breadth = 60;
        height =70;
    }
    public void showDimensions(){
        System.out.println("Lenght : "+lenght);
        System.out.println("Breadth : "+breadth);
        System.out.println("Height: "+height);
    }
    public void setDimensions(int l , int b ,int h){
        lenght=l;
        breadth=b;
        height=h;
    }
}