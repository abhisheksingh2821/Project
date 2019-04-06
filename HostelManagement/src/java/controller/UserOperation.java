/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */package controller;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author Abhishek Singh
 */
public class UserOperation {
     static PreparedStatement stmt=null;
    static Connection con=null;
    static ResultSet rs=null;

   public static int updateComplaint(int id,String status)
        {
            int i=0;
            try{
                Class.forName("com.mysql.cj.jdbc.Driver"); 
                Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/hostelmanagement?useSSL=false&verifyServerCertificate=false&allowMultiQueries=true","root","abhi@2821");  

                stmt=con.prepareStatement("update compfile set status=? where id=?");
                stmt.setString(1,status);
                stmt.setInt(2,id);
                i=stmt.executeUpdate();
                 
            }
            catch(Exception e){
                e.printStackTrace();
            }
            return i;
        }
   
   
   public static int updateLeave(int id,String status)
        {
            int i=0;
            try{
                Class.forName("com.mysql.cj.jdbc.Driver"); 
                Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/hostelmanagement?useSSL=false&verifyServerCertificate=false&allowMultiQueries=true","root","abhi@2821");  

                stmt=con.prepareStatement("update leaveapp set status=? where id=?");
                stmt.setString(1,status);
                stmt.setInt(2,id);
                i=stmt.executeUpdate();
                 
            }
            catch(Exception e){
                e.printStackTrace();
            }
            return i;
        }
    
}
