
function validate()
{ 
   if( document.StudentRegistration.textname.value == "" )
   {
     alert( "Please provide your Name!" );
     document.StudentRegistration.textname.focus() ;
     return false;
   }
   if( document.StudentRegistration.fathername.value == "" )
   {
     alert( "Please provide your Father Name!" );
     document.StudentRegistration.fathername.focus() ;
     return false;
   }
   
   
    if( document.StudentRegistration.cgpa.value == "" )
   {
     alert( "Please provide your 10th cgpa!" );
     document.StudentRegistration.cgpa.focus() ;
     return false;
   }
   
    if( document.StudentRegistration.per.value == "" )
   {
     alert( "Please provide your 12th percentage!" );
     document.StudentRegistration.per.focus() ;
     return false;
   }
   
    if( document.StudentRegistration.board.value == "-1")
   {
     alert( "Please provide your board!" );
    
     return false;
   }
    if( document.StudentRegistration.course.value == "-1")
   {
     alert( "Please provide your Course!" );
    
     return false;
   }
   
   
   if( document.StudentRegistration.city.value == "" )
   {
     alert( "Please provide your City!" );
     document.StudentRegistration.city.focus() ;
     return false;
   } 
   
    if( document.StudentRegistration.state.value == "" )
   {
     alert( "Please provide your State!" );
     
     return false;
   }
   
    if( document.StudentRegistration.pincode.value == "" ||
           isNaN( document.StudentRegistration.pincode.value) ||
           document.StudentRegistration.pincode.value.length != 6 )
   {
     alert( "Please provide a pincode in the format ######." );
     document.StudentRegistration.pincode.focus() ;
     return false;
   }
     
   
  
  
 var email = document.StudentRegistration.emailid.value;
  atpos = email.indexOf("@");
  dotpos = email.lastIndexOf(".");
 if (email == "" || atpos < 1 || ( dotpos - atpos < 2 )) 
 {
     alert("Please enter correct email ID")
     document.StudentRegistration.emailid.focus() ;
     return false;
 }
  if( document.StudentRegistration.dob.value == "" )
   {
     alert( "Please provide your DOB!" );
     document.StudentRegistration.dob.focus() ;
     return false;
   }
  if( document.StudentRegistration.mobileno.value == "" ||
           isNaN( document.StudentRegistration.mobileno.value) ||
           document.StudentRegistration.mobileno.value.length != 10 )
   {
     alert( "Please provide a Mobile No in 10 digit format." );
     document.StudentRegistration.mobileno.focus() ;
     return false;
   }
   return( true );
}