<%@page import="java.util.Random"%>
?<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Intrusion Detection and Prevention</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="styles.css" rel="stylesheet" type="text/css" media="screen" />
<link href="textboxstyle.css" rel="stylesheet" type="text/css" media="screen" />
</head>
<body>
    <%
    
    Random rand = new Random();
    
    String useridds ="UI_"+String.valueOf(rand.nextInt(10))+String.valueOf(rand.nextInt(10))+String.valueOf(rand.nextInt(10)
            +String.valueOf(rand.nextInt(10))+String.valueOf(rand.nextInt(10))+String.valueOf(rand.nextInt(10))+String.valueOf(rand.nextInt(10)));
    
//    String userid =  Integer.toString(randomNum);
//    String useridds = "LBS"+userid;
    
%>
<div id="mainbg">
<!-- header begins -->
<div id="header">
	<div id="buttons">
		<div class="menu_width">
		<ul>
			<li><a href="index.jsp" title="" class="active">Home</a></li>
			
<!--			<li><a href="#" title="">About</a></li>
			<li><a href="#" title="">Contact</a></li>-->
		</ul>
		</div>
	</div>
	<div id="logo">
		<h1><img style="margin-right: 1px"src="images/hedd1.png"></img></h1>
		
	</div>
<!-- header ends -->
<!-- content begins -->
<div id="main" style="margin-top: 190px" >
<div id="main_top"></div>
<div id="content_bg">
  <div id="content">
	<div id="right">
		<h2>LIST</h2>
		<div class="categories">
		<ul>
			<li><a href="index.jsp">HOME</a></li>
			<li><a href="userlogin.jsp">LOGIN</a></li>
			
			
		</ul>
		</div>
		
		<div class="company">
			<ul>

			</ul>
		</div>
	</div>
          	<div id="left">
		<div class="left_top"></div>
                <center><h1 style="color: red;font-family:Castellar;font-size: 25px">USER REGISTRATION</h1></center>
		<div id="text">
		
                   
                    <form  action="regis" method="post">
                        <center><table border="1"><br></br>
                                <tr><td style="color: brown;font-size: 20px">USER_ID</td><td><input style="width: 250px" type="text" name="usreid" value="<%=useridds%>" requireds="" style="color: red"  class="inputs" /> </td> </td></tr>
                                <tr><td style="color: brown;font-size: 20px">USERNAME</td><td><input style="width: 250px" type="text" name="username" value="" required style="color: red"  class="inputs" /> </td> </td></tr>
                                <tr><td style="color: brown;font-size: 20px">PASSWORD</td><td><input style="width: 250px" type="password" name="password" value="" required  pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Password must contain at least one number, one uppercase and lowercase letter, and be at least 8 characters long." style="color: red"  class="inputs" /> </td> </td>
                                <tr>
                                    <td style="color: brown; width: 0px; font-size: 20px">GENDER</td>
                                    <td><select name="gender" class="inputs" id="">
                                        <option value="Female">Female</option>
                                        <option value="Male">Male</option>
                                    </td></tr>
                                <tr><td style="color: brown;font-size: 20px">AGE</td><td><input style="width: 250px" type="number" min="10" max="99" name="age" value="" required style="color: red"  class="inputs" /> </td> </td></tr>
                                <tr><td style="color: brown;font-size: 20px">LOCATION</td><td><input style="width: 250px" type="text" name="loca" value="" required style="color: red"  class="inputs" /> </td> </td></tr>
                                <tr><td style="color: brown;font-size: 20px">MAIL_ID</td><td><input style="width: 250px" type="email"  pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" name="mailid" value=""  style="color: red"  class="inputs" required /> </td> </td></tr>
                                <tr><td style="color: brown;font-size: 20px">PHONE</td><td><input style="width: 250px" type="text" name="phone" value=""  pattern="[789][0-9]{9}" required style="color: red"  class="inputs" /> </td> </td></tr>
                                
                               
                                  <tr><td><input type="submit" value ="REGISTRATION " style="color: red"  class="inputs" /> </td></tr>
                       
                        
                 </table></center>
                    </form>
             



          
             


           </div>

	</div>
   
</div>
</div>
<div id="footer">
 
		
<!-- footer ends -->

</div>
</div>
</body>
</html>
