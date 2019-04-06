<%-- 
    Document   : register
    Created on : 30 Mar, 2019, 5:25:47 PM
    Author     : Abhishek Singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<html>
    <head>
         <script>
            function registersuccess()
            {
                
                var x=document.getElementById("input2").value;
                var y=document.getElementById("input3").value;
                if(x!=y)
                {
                   alert("Confirm Password NOT Matched");
                }
                
            }
           
          
           
        </script>
        <style>
            body 
            {
                background-image: url(back.png) ;
                    
            
            }
        
          
            .div01
            {
                border-radius:25px;
                height:520px;
                width: 400px;
                background-color:whitesmoke;
                margin-top:60px;
                margin-left: 440px;
                font-size:20px;
                float:left;
            }
            .div01 a
            {
                padding: 10px 30px;
                float:left;
            }
        </style>
    </head>
    <body>
        
           <div class="div1">
                <img src="images.jpg" style="height: 90px;width: 90px;float:left;margin-left: 20px;margin-top: 5px;">
                <h1 style="font-family: cursive;text-shadow: 5px 5px 5px black;color:whitesmoke;float:left;margin-left: 300px;">HOSTEL MANAGEMENT SYSTEM</h1>
<nav style="float:right;">
    </nav></div><br>
<br>
        
   
        <br>
        <br>
        <br>
     
         <br><hr>
           
      <div class="div01">
                  
                    <h3 style="margin-left:60px;margin-top: 40px;">Username</h3>
                    <form method="post" action="register">
                    <input type="text"  id="input1" name="uname" style="margin-left: 60px;font-size: 20px;" required onfocus="style.background='firebrick';style.color='white'" onblur="style.background='grey'">
                    <h3 style="margin-left:60px">Password</h3>
                    <input type="password" id="input2" name="pwd1" style="margin-left: 60px;font-size: 20px" required onfocus="style.background='firebrick';style.color='white'" onblur="style.background='grey'"><br>
                    <h3 style="margin-left:60px">University ID</h3>
                    <input type="password" id="input3" name="univid"   style="margin-left: 60px;font-size: 20px" required onfocus="style.background='firebrick';style.color='white'" onblur="style.background='grey'"><br>
                   
                    <h3 style="margin-left:60px;margin-top: 20px;">User Type :
                    <select style="margin-left:5px;" name="ut" id="ut">
<option value="-1" selected>select..</option>
<option value="User">User  </option>
<option value="Admin">Admin</option>

</select></h3>
                    <br>
                    
                    
                       <input type="submit" value="register "  style="background-color:red;color:white;text-decoration:none;font-size:20px;margin-left:40px;padding:16px 130px;border: 1px;border-radius:60px"></form>
</a>
                </div>