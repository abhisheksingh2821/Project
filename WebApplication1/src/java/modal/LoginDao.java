package modal; 
  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {  
public static boolean validate(String uname,String pwd){  
boolean status=false;  
try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/collegeapp?useSSL=false&verifyServerCertificate=false&allowMultiQueries=true","root","abhi@2821");  
      
PreparedStatement ps=con.prepareStatement(  
"select * from register where username=? and pwd=?");  
ps.setString(1,uname);  
ps.setString(2,pwd);  
      
ResultSet rs=ps.executeQuery();  
status=rs.next();  
          
}catch(Exception e){System.out.println(e);}  
return status;  
}  
}  