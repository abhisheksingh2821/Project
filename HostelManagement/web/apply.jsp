<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<% if(!(request.getSession().getAttribute("username") ==null)){
    %>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<nav style="float: right">
        <p style="background-color:none; font-family: cursive;margin-top: 0px;color:white;text-decoration:none;font-size:30px;margin-left:40px;border: 1px;border-radius:60px">
                   
        <%

            String str = (String) session.getAttribute("username");

            out.print("Welcome " + str);
            

        %>
        </p>
        <form action="logout" method="post" ><a ><input type="submit" value="Log Out"  style="background-color:red;color:white;text-decoration:none;font-size:20px;margin-left:230px;border: 1px;border-radius:60px"></a></form>
                   <% response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");%>
</nav>
        
<html>
       <style>
           /* Navbar container */
.navbar {
  overflow: hidden;
  background-color: #333;
  font-family: Arial;
}

/* Links inside the navbar */
.navbar a {
  float: left;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

/* The dropdown container */
.dropdown {
  float: left;
  overflow: hidden;
}

/* Dropdown button */
.dropdown .dropbtn {
  font-size: 16px; 
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit; /* Important for vertical align on mobile phones */
  margin: 0; /* Important for vertical align on mobile phones */
}

/* Add a red background color to navbar links on hover */
.navbar a:hover, .dropdown:hover .dropbtn {
  background-color: red;
}

/* Dropdown content (hidden by default) */
.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

/* Links inside the dropdown */
.dropdown-content a {
  float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

/* Add a grey background color to dropdown links on hover */
.dropdown-content a:hover {
  background-color: #ddd;
}

/* Show the dropdown menu on hover */
.dropdown:hover .dropdown-content {
  display: block;
}/* Navbar container */
.navbar {
  overflow: hidden;
  background-color: #333;
  font-family: Arial;
}

/* Links inside the navbar */
.navbar a {
  float: left;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

/* The dropdown container */
.dropdown {
  float: left;
  overflow: hidden;
}

/* Dropdown button */
.dropdown .dropbtn {
  font-size: 16px; 
  border: none;
  outline: none;
  color: black;
  padding:17.5px 60px;
  background-color:lightcyan ;
  font-family: inherit; /* Important for vertical align on mobile phones */
  margin: 0; /* Important for vertical align on mobile phones */
}

/* Add a red background color to navbar links on hover */
.navbar a:hover, .dropdown:hover .dropbtn {
  background-color:lightgoldenrodyellow;
}

/* Dropdown content (hidden by default) */
.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

            .div01
            {
                border-radius:25px;
                height:710px;
                width: 400px;
                background-color:whitesmoke;
                margin-top:40px;
                margin-left: 440px;
                font-size:20px;
                float:left;
            }
            .div01 a
            {
                padding: 10px 30px;
                float:left;
            }

/* Links inside the dropdown */
.dropdown-content a {
  float: none;
  color: black;
  padding: 20px 25px;
  text-decoration: none;
  display: block;
  text-align: left;
}

/* Add a grey background color to dropdown links on hover */
.dropdown-content a:hover {
  background-color: #ddd;
}

/* Show the dropdown menu on hover */
.dropdown:hover .dropdown-content {
  display: block;
}
            body 
            {
                     background-image: url(a1.jpg);
            }
  .div1
{
    width: 1350;
    height: 120px;  
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
    padding: 15px 60px;
}
.div2 a:hover{color:red;background-color:lightgoldenrodyellow ;}
      .div01
            {
                border-radius:25px;
                height:720px;
                width: 450px;
                background-color:whitesmokei;
                margin-top:50px;
                margin-left: 440px;
                font-size:20px;
                float:left;
                padding:0px 70px;
            }
              .div02
            {
                border-radius:25px;
                height:720px;
                width: 620px;
                background-color:whitesmoke;
                margin-top:50px;
                margin-left: 360px;
                font-size:20px;
                float:left;
                padding:0px 70px;
            }
            
            .div02 table{
                margin-top:50px;
               
            }
  </style>
<body>
    
           <div class="div1">
                <img src="images.jpg" style="height: 100px;width: 100px;float:left;margin-left: 20;margin-top: 5;">
                <h1 style="font-family: cursive;text-shadow: 3px 3px 3px white;color: red;float:left;margin-left: 300px;">HOSTEL MANAGEMENGT SYSTEM</h1>
</div>
   
    
     <div class="div2">
               <nav>
               <a href="student.jsp">Home</a>
                   <a href="apply.jsp">Apply for leave</a>
                    <div class="dropdown">
    <button class="dropbtn">Complaints/Feedbacks 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
        <a href="comp1.jsp">Complaints</a><br>
      <a href="feed.jsp">Feedbacks</a>
      
      
    </div>
  </div> 
                   
                   <a href="userp.jsp">Student profile</a>
                   <a href="notice.jsp">Notices</a>
                    <a href="gallery.jsp">Update Profile</a>
                       
               </nav>
     </div>
    <div class="div01" >
                   <h3 style="margin-left:60px">Enter Your Leave Details Below:</h3><hr>
                    <h4 style="margin-left:60px">University ID</h4>
                    <form method="post" action="apply" id="appf">
                    <input type="text"  id="input1" name="univid" style="margin-left: 60px;font-size: 20px;" required onfocus="style.background='firebrick';style.color='white'" onblur="style.background='grey'">
                    <h4 style="margin-left:60px">Leave Start</h4>
                    <input type="date" id="input2" name="lstart" style="margin-left: 60px;font-size: 20px" required onfocus="style.background='firebrick';style.color='white'" onblur="style.background='grey'"><br>
                    <h4 style="margin-left:60px">Leave End</h4>
                    <input type="date" id="input2" name="lend" style="margin-left: 60px;font-size: 20px" required onfocus="style.background='firebrick';style.color='white'" onblur="style.background='grey'"><br>
                     <h4 style="margin-left:60px;margin-top: 20px;">Leave Type :
                    <select style="margin-left:5px;" name="lt" id="ut">
<option value="-1" selected>select..</option>
<option value="Sick">Sick  </option>
<option value="Vacation">Vacation</option>

</select></h4>
                    <h4 style="margin-left:60px">Leave Description</h4>
               
                               <textarea name="feed" style="margin-left: 60px" rows="5" cols="35"  form="appf"></textarea>
                               <br>
                               <br>
                   <a href="home.html"> <input type="submit" value="Apply Leave" style="background-color:red;color:white;text-decoration:none;font-size:20px;margin-left:0px;padding:16px 150px;border: 1px;border-radius:60px"></a></form>
                   
                   
                </div>
    

    <div class="div02" >
        <h3>Recent leave Status:</h3>
        <hr>
<table border="2">
<tr>
<td>Sno.</td>
<td>University ID</td>
<td>Leave Start</td>
<td>Leave End</td>
<td>Leave Type</td>
<td>Reason</td>
<td>Status</td>

</tr>
<% try {

                String str1 = (String) session.getAttribute("username");
                System.out.println(str1);
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostelmanagement?useSSL=false&verifyServerCertificate=false&allowMultiQueries=true","root","abhi@2821");

                PreparedStatement st = con.prepareStatement("select * from leaveapp  join regsiter on leaveapp.univid = regsiter.pwd2 where regsiter.uname=?");
                st.setString(1,str1);
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    System.out.println("s");
                    
                    %>
                    
                         
                         <tr> <td><%= rs.getInt(1)%></td>
                    <td> <%= rs.getString(2)%></td>
                    <td><%= rs.getString(3)%></td>
                         <td><%= rs.getString(4)%></td>
                         <td><%= rs.getString(5)%></td>
                         <td><%= rs.getString(6)%></td>
                         <td><%= rs.getString(7)%></td></tr>
                    

                    <%
                    }
           }
           catch(Exception e){
            System.out.println(e);
           }
        %>
                    </table></div>
</body></html>
<%}
else
{
response.sendRedirect("login.html");
}%>