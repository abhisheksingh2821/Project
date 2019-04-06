/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;




import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Abhishek Singh
 */
public class updatecomp extends HttpServlet {

   protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try{
             if(request.getParameter("id")!=null)
             {
                 int id=Integer.parseInt(request.getParameter("id"));
                 String status=request.getParameter("value");
                 int i=UserOperation.updateComplaint(id,status);
                 
                 if(i>0){
                     HttpSession session = request.getSession(false);
                  
               
                  out.println("<script type=\"text/javascript\">");
       out.println("alert('Complaint updated successfully');");
       out.println("</script>"); 
          response.sendRedirect("comp2.jsp"); 
                 }
                 else
                 {
                     HttpSession session = request.getSession(false);
                  session.setAttribute("message","Complaint Not Udpated");
                  response.sendRedirect("comp2.jsp"); 
                 }
             }
        
            
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
