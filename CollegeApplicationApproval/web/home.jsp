<%-- 
    Document   : home
    Created on : 22 Nov, 2018, 9:57:14 AM
    Author     : Abhishek Singh
--%>
<% if(!(request.getSession().getAttribute("uname")==null)){
    %>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
       <style>
            body 
            {
                     background-image: url(pens2.jpg);
            }
  .div1
{
    width: 1350;
    height: 120px;
   
}
.div1 img
{
    height: 90px;
    width: 90px;
}
input[type=submit]
{
    background: transparent;
    border: none;
    font-size: 16px;
}
.div1 h1
{
    margin-left: 350px;
}

.div1 p
{margin-top: 10px;
    margin-right: 80px;
     font-size: 50px;
}
.div1 input
{
    margin-right: 0px; 
    margin-top: 10px;
}

.div2
{
    width: 1350px;
    height: 52px;  
}
.div2 a
{
    float: left;
    text-decoration: none;
    color:black;
    font-size: 20px;
    background-color:lightcyan;
    padding: 15px 45.5px;
}
.div2 a:hover{color:red;background-color:lightgoldenrodyellow ;}
       </style>
    </head>
    <body>
    
           <div class="div1">
                <img src="images.png" style="float:left;margin-left: 20;margin-top: 5;">
                <center>       <h1 style="font-family: cursive;text-shadow: 1px 1px 1px white;color: palegoldenrod;float:left;margin-left: 300;">COLLEGE APPLICATION APPROVAL</h1></center>
                 <nav style="float:right;">
  
                     <p style="background-color:none; font-family: cursive;margin-top: 15px;color:black;text-decoration:none;font-size:30px;margin-left:40px;padding:16px 15px;border: 1px;border-radius:60px">
                         <%= request.getSession().getAttribute("uname").toString()%>  </p></b> </nav>
               
               </div>
   
    
     <div class="div2">
               <nav>
                   <a href="StudentRegistration.html">Application form</a>
                   <a href="apply.html">Colleges for you</a>
                   <a href="counsel.html">Counselling</a>
                   <a href="userp.html">User profile</a>
                   <a href="contact.html">Contact US</a>
                   <a href="about.html">About US</a>
                   <form action="logout" method="post"><a ><input type="submit" value="Log Out"></a></form>
                   <% response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");%>
  
               </nav>
     </div>

               
</body>
    
</html>
<%}
else
{
response.sendRedirect("index.html");
}%>
