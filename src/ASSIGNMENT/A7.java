package ASSIGNMENT;

public class A7 {
    public void driver(){
//       //Complex Class;
//        Complex c1 = new Complex();
//        c1.setNum(10,20);
//        c1.printNum();

//        //Time Class
//        Time t1 = new Time();
//        t1.setTime(3,55,20);
//        t1.showTime();

//        Cuboid Class
        Cuboid c1 = new Cuboid();
        c1.setLength(10);
        c1.setBreadth(20);
        c1.setHeight(30);

        System.out.println("length : "+c1.getlength());
        System.out.println("breadth : "+c1.getBreadth());
        System.out.println("height : "+c1.getheight());
        System.out.println("Volume : "+c1.getVolume());
        System.out.println("Surface : "+c1.getSurface());
    }
}
class Cuboid{
    private int length , breadth , height;
    public void setLength(int l){length=l;}
    public void setBreadth(int b){breadth=b;}
    public void setHeight(int h){height = h;}

    public int getlength(){return length;}
    public int getheight(){return height;}
    public int getBreadth(){return breadth;}

    public int getVolume(){
        return length*breadth*height;
    }
    public int getSurface(){
        return 2*(length*breadth*height);
    }

}
class Time{
  private int hr , min , sec;
  public void setTime(int h , int m , int s){
      hr = h;
      min=m;
      sec=s;
  }
  public void showTime() {
      System.out.println(hr + ":" + min+":" + sec);
  }
}
class Complex{
    private int real , imag;
    public void setNum(int r , int i){
        real = r;
        imag = i;
    }
    public void printNum(){
        System.out.println("real: "+real+"imag: "+imag);
    }
}


