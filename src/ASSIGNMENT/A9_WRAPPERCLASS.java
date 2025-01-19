package ASSIGNMENT;

public class A9_WRAPPERCLASS {
    public void driver(){
        Marksheet m1 = new Marksheet();
        m1.setMarks(90,80,70,75,95);
        m1.getMarks();
        m1.getMaxMarks();
        m1.getAverageMarks();
//        Circle c1 = new Circle();
//        c1.setRadius(5.5);
//        c1.getRadius();
//        c1.getArea();
//        c1.getCircumference();
    }
}

class Marksheet{
    public Integer physics, mathematics, chemistry,english,hindi;

    public void setMarks(Integer P,Integer M,Integer C,Integer E,Integer H){
        physics=P;
        mathematics=M;
        chemistry=C;
        english=E;
        hindi=H;
    }
    public void getMarks(){
        System.out.println("Physics: "+physics);
        System.out.println("Mathematics: "+mathematics);
        System.out.println("Chemistry: "+chemistry);
        System.out.println("Hindi: "+hindi);
        System.out.println("English: "+english);
    }

    public void getMaxMarks() {
        Integer maxMarks = Math.max(physics, Math.max(mathematics, Math.max(chemistry, Math.max(english, hindi))));
        System.out.println("MaxMarks: "+maxMarks);
    }
    public void getAverageMarks(){
        Double AverageMarks = (physics+mathematics+chemistry+hindi+english)/5.0;
        System.out.println("AverageMarks: "+AverageMarks);
    }

}
class Circle{
    private Double radius;

    public void setRadius(Double r){
      radius= r;
    }
    public void getRadius(){
        System.out.println("Value of radius: "+radius);
    }
    public void getArea(){
        Double area = 3.14*radius*radius;
        System.out.println("Area of Circle: "+area);
    }
    public void getCircumference(){
        Double Circumfrence = 2*3.14*radius;
        System.out.println("Circumference is :"+Circumfrence);
    }
}
