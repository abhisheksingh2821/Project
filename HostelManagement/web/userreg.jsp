<%-- 
    Document   : userreg
    Created on : 30 Mar, 2019, 6:27:18 PM
    Author     : Abhishek Singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <body>
            <style> 
             body 
            {
                     background-image: url(back.png)
            }
            .middle
            {
                height: 750px;
            }
           
             .div01
            {
                float:left;
                border-radius:15px;
                background-color: white;
                height: 700px;
                width:400px;
                margin-left: 430px;
                margin-top:10px;
                font-size:20px;
            }
            .div01 input
            {
                margin-left:30px;
                margin-top:20px;
                padding:10px 80px;
            }


        </style>
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
             <div class="div3">
            <p style="color: red;font-size: 35px;height: 50px;width:400px;background-color: white;margin-top: 0;text-align: center;border-bottom-right-radius:  40px;">Complete Your Profile</p>
           </div>
           <div class="middle">
               <div class="div01">
                   <form method="post" action="userp">
                    
                    <h1 style="float:left;margin-left:30px;margin-top:30px;color:black">Profile Info</h1>
                    <input type="text" id="name" name="name" placeholder="Name" required onfocus="style.background='firebrick';style.color='white'" onblur="style.background='grey   '" onkeyup="up()">
                                  <input type="text" id = "univid" name="univid" placeholder="University ID" required onfocus="style.background='firebrick';style.color='white'" onblur="style.background='grey'">
               
                    <input type="text" id="fname" name="fname" placeholder="Father Name" required onfocus="style.background='firebrick';style.color='white'" onblur="style.background='grey'" onkeyup="up()">
                    <input type="text" name="mname" placeholder="Mother name" required onfocus="style.background='firebrick';style.color='white'" onblur="style.background='grey'">
                    <input type="text" id ="mobileno" name="mobileno" placeholder="Mobile no." required onfocus="style.background='firebrick';style.color='white'" onblur="style.background='grey'">
          <input type="email" name="email"  placeholder="Email" required onfocus="style.background='firebrick';style.color='white'" onblur="style.background='grey'">
          <input type="date" name="dob"  placeholder="dOB DD-MM-YYYY" required onfocus="style.background='firebrick';style.color='white'" onblur="style.background='grey'" onkeyup="up()"><br>
         
          <input type="text" name="city"  placeholder="Your City" required onfocus="style.background='firebrick';style.color='white'" onblur="style.background='grey'" onkeyup="up()"><br>
                    <input type="submit" value="Upadate Profile"  style="border-radius: 60px;border: 1px; color:white;background:red;padding:16px 100px;font-family:inherit;font-size:20px;">
                    </form>
                </div>

          
        
           
           
        </div> 
    </body>
</html>
