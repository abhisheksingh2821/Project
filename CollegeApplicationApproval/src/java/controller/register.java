/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Abhishek Singh
 */
public class register extends HttpServlet {

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
          
String fn=request.getParameter("fname");  
String ln=request.getParameter("lname");  
String g=request.getParameter("gender"); 
String un=request.getParameter("uname"); 
String p1=request.getParameter("passone");
String p2=request.getParameter("passtwo");
String e=request.getParameter("email");
String c=request.getParameter("city"); 
          
try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/collegeapp?useSSL=false&verifyServerCertificate=false&allowMultiQueries=true","root","abhi@2821");  
  
PreparedStatement ps=con.prepareStatement(  
"insert into register values(?,?,?,?,?,?,?,?)");  
  
ps.setString(1,fn);  
ps.setString(2,ln);  
ps.setString(3,g);  
ps.setString(4,un);
ps.setString(5,p1);
ps.setString(6,p2);
ps.setString(7,e);
ps.setString(8,c);
          
int i=ps.executeUpdate();  
if(i>0)  
request.getRequestDispatcher("/index.html").forward(request, response);
      
          
}catch (Exception e2) {System.out.println(e2);}  
          
out.close();  
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
