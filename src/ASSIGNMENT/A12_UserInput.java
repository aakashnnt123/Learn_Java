package ASSIGNMENT;
import java.util.Scanner;
public class A12_UserInput {
    public void driver(){
        PrintN p1 = new PrintN();
//        p1.Natural_Num();
//        p1.Natural_Num_Reverse();
//        p1.Odd_Natural_Num();
//        p1.Odd_Natural_Num_Reverse();
//        p1.Even_Natural_Num();
//        p1.Even_Natural_Num_Reverse();
//        p1.Square_Natural_Num();
    }
}
class PrintN{
    public void Natural_Num(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
          System.out.print(i+" ");
        }
        System.out.println(" ");
    }
    public void Natural_Num_Reverse() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    public void Odd_Natural_Num() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
        for(int i = 1; i <=2*n; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    public void Odd_Natural_Num_Reverse() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
        for(int i = 2*n-1; i >=1; i-=2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    public void Even_Natural_Num() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
        for(int i = 2; i <=2*n; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    public void Even_Natural_Num_Reverse() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
        for(int i = 2*n; i >=1; i-=2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    public void Square_Natural_Num() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
        for(int i = 1; i <=n; i++) {
            System.out.print(i*i + " ");
        }
        System.out.println(" ");
    }

}
