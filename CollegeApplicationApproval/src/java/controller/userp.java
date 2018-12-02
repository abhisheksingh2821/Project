/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
 
import java.sql.*;  
import javax.servlet.ServletException;  

/**
 *
 * @author Abhishek Singh
 */
public class userp extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            /* TODO output your page here. You may use following sample code. */
            String emailid=request.getParameter("email");  
String email =String.valueOf(emailid);  
          
try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/collegeapp?useSSL=false&verifyServerCertificate=false&allowMultiQueries=true","root","abhi@2821");  
              
PreparedStatement ps=con.prepareStatement("select * from appform where emailid=?");  
ps.setString(1,email);  
              
 

  
ResultSet rs=ps.executeQuery();  
            
ResultSetMetaData rsmd=rs.getMetaData();  
int total=rsmd.getColumnCount(); 
out.print("<html>\n" +
"<head>\n" +
"  <style>\n" +
"            body \n" +
"            {\n" +
"                background-image: url(57.jpg);\n" +
"                height:740px;\n" +
"            }\n" +
"            \n" +
"\n" +
"             .div1\n" +
"{\n" +
"    width: 1346;\n" +
"    height: 120px;  \n" +
"}\n" +
".div28\n" +
"{\n" +
"    margin-left: 400;\n" +
"     color:black;\n" +
"    font-size: 30px;\n" +
"}\n" +
"\n" +
".div6\n" +
"{\n" +
"    background-color: #004d4d;\n" +
"    width: 1346px;\n" +
"    height: 350px;\n" +
"}\n" +
".div2\n" +
"{\n" +
"    width: 1346px;\n" +
"    height: 52px;  \n" +
"}\n" +
".div2 a\n" +
"{\n" +
"    float: left;\n" +
"    text-decoration: none;\n" +
"    color:black;\n" +
"    font-size: 20px;\n" +
"    background-color:lightcyan;\n" +
"    padding: 15px 45.5px;\n" +
"}\n" +
".div2 a:hover{color:red;background-color:lightgoldenrodyellow ;}\n" +
"td{padding:2px 75px;font-size:20px;font-family: cursive;}   \n" +
"            </style>\n" +
"        \n" +
"<script type=\"text/javascript\" src=\"validate.js\"></script>\n" +
"</head>\n" +
"<body>\n" +
"               <div class=\"div1\">\n" +
"                <img src=\"images.png\" style=\"height: 90;width: 90;float:left;margin-left: 20;margin-top: 5;\">\n" +
"                <h1 style=\"font-family: cursive;text-shadow: 1px 1px 1px white;color: palegoldenrod;float:left;margin-left: 300;\">COLLEGE APPLICATION APPROVAL</h1>\n" +
"<nav style=\"float:right;\">\n" +
"    <a href=\"home.jsp\"> <input type=\"button\" value=\"Home\" style=\"background-color:whitesmoke; margin-top: 20px;color:red;text-decoration:none;font-size:20px;margin-left:40px;padding:16px 15px;border: 1px;border-radius:60px\">\n" +
"       </a> </nav></div>\n" +
"   \n" +
"    \n" +
"     <div class=\"div2\">\n" +
"               <nav>\n" +
"                   <a href=\"StudentRegistration.html\">Application form</a>\n" +
"                   <a href=\"apply.html\">Colleges for you</a>\n" +
"                   <a href=\"counsel.html\">Counselling</a>\n" +
"                   <a href=\"userp.html\">User profile</a>\n" +
"                   <a href=\"contact.html\">Contact US</a>\n" +
"                   <a href=\"about.html\">About US</a>\n" +
"                       <a href=\"index.html\">Log Out</a>\n" +
"                   \n" +
"               </nav>\n" +
"     </div>\n" +
"    <hr>\n" +
"\n" +
"      \n" +
"           <div class=\"div3\">\n" +
"           <p style=\"color: red;font-size: 35px;height: 50px;width:400px;background-color: whitesmoke;margin-top: 0;text-align: center;border-bottom-right-radius:  40px;\">User Profile</p>\n" +
"           </div>");

out.print("<div class=\"div28\">");

out.print(" <nav style=\"float:left;\">");

for(int i=1;i<=total;i++)  
{  
out.print("<b>"+rsmd.getColumnName(i)+"</b>"+":"+"<br><br>");  
}  
  out.print("</nav");
 
              
  out.print(" <nav style=\"float:right;\">");
  
while(rs.next())  
{  
out.print("<B>"+rs.getString(1)+"<br><br>"+rs.getString(2)+"<br><br>"+rs.getString(3)+"<br><br>"+rs.getString(4)+"<br><br>"+rs.getString(5)+"<br><br>"+rs.getString(6)+"<br><br>"+rs.getString(7)+"<br><br>"+rs.getString(8)+"<br><br>"+rs.getString(9)+"<br><br>"+rs.getString(10)+"<br><br>"+rs.getString(11)+"<br><br>"+rs.getString(12)+"</B>");  
                  
}  
 out.print("</nav");

    out.print("   </div>");           
}catch (Exception e2) {e2.printStackTrace();}  
          
finally{out.close();}  
  
}  


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
