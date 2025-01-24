package ASSIGNMENT;
import java.util.Scanner;

public class A13_UserInput2 {
    public void driver(){
       Program p1 = new Program();
       p1.Q1();
        p1.Q2();

    }

}
class Program{

    public void Q1(){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter a Number");
         int x = sc.nextInt();
         if(x%2==0)
             System.out.println("Even Number");
         else
             System.out.println("Odd Number");
    }
    public static void Q2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x >= y && x >= z) {
            System.out.println("Greatest number is " + x);
        } else if (y >= x && y >= z) {
            System.out.println("Greatest number is " + y);
        } else {
            System.out.println("Greatest number is " + z);
        }
    }
}