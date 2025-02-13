package CONCEPTS;
import java.io.*;
import java.util.Scanner;

public class FileHanding {
    public void driver(){
         int i;

         try {
             FileOutputStream Font =  new FileOutputStream("C:/Users/hp/OneDrive/Desktop/JavaLearning/File/myData.txt",true);
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter Your Company Name");
             String name = sc.nextLine();
             for(i=0;i<name.length();i++) {
                 Font.write(name.charAt(i));
             }
             System.out.println();
             Font.close();
             System.out.println("All Done");
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
    }
  public void FileRead() throws IOException{
        int i;
        try {
            FileInputStream fin = new FileInputStream("C:/Users/hp/OneDrive/Desktop/JavaLearning/File/myData.txt");
            do{
                i=fin.read();
                if(i!=-1){
                    System.out.print((char)i);
                }
            }
            while(i!=-1);
                fin.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
  }
}



