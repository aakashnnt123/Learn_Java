package ASSIGNMENT;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class A11_javaPackages {
    public void driver(){
        CurrentDate_Time.printDate();
        CurrentDate_Time.printTime();
        RandomNum.PrintRandom();
        Root.calculateRoots(1,-5,6);
    }
}
class CurrentDate_Time {
    public static void printDate(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(f.format(now));
    }
    public static void printTime(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter f=DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(f.format(now));
    }
}
class RandomNum{
    public static void PrintRandom(){
        double d1 = Math.random()*100+100;
        System.out.println((int)d1);
    }
}
class Root{
    public static void calculateRoots(int a , int b,int c){
        double x1 , x2;
        x1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
        x2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("Root 1= "+x1+" Root 2= "+x2);
    }
}

