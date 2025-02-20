package CONCEPTS;
import java.sql.*;

public class JDBC {
    public static void getConnection() throws SQLException{
         Connection con;
         String Url = "jdbc:mysql://localhost:3306/temp";

         con = DriverManager.getConnection(Url , "root" , "Aakash@123456");
         if(con!=null){
             System.out.println("Connection Established");
//             String q = "select * from book";
             String q = "select * from book where price > ? ";
             PreparedStatement ps = con.prepareStatement(q);
             ps.setDouble(1,400.0);
             ResultSet rs = ps.executeQuery();
             while(rs.next())
             {
                 System.out.print(rs.getInt(1)+" ");
                 System.out.print(rs.getString(2)+" ");
                 System.out.print(rs.getDouble(3)+" ");
                 System.out.println();
             }
         }
    }

}
