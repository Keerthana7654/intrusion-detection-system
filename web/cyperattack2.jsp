<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

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
<div id="mainbg">
<!-- header begins -->
<div id="header">
	<div id="buttons">
		<div class="menu_width">
		<ul>
			<li><a href="index.jsp" title="" class="active">Home</a></li>
			<li><a href="userlogin.jsp" title="">USER</a></li>
			<li><a href="adminlogin.jsp" title="">ADMIN</a></li>
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
<div id="main" style="margin-top: 150px" >
<div id="main_top"></div>
<div id="content_bg">
  <div id="content">
	<div id="right">
		<h2>LIST</h2>
		<div class="categories">
		<ul>
			<li><a href="index.jsp">HOME</a></li>
			<li><a href="attack.jsp">ATTACK</a></li>
			
			
		</ul>
		</div>
		
		<div class="company">
			<ul>

			</ul>
		</div>
	</div>
          	<div id="left">
		<div class="left_top"></div>
                <center><h1 style="color: RED;font-family:Castellar;font-size: 25px">CYBER ATTACK  </h1></center>
		<%
                
         
               HttpSession ses = request.getSession();
               String files  = ses.getAttribute("filepath").toString();
   
                
                  
                   
                    
                    %>
                <div id="text">
		
                   
                    
                        <center><table><br></br>
                                <tr><td><h2>YOUR FILE  HAS ATTACK  SUCCESSFULLY</h2> </tr>
                                
                                
                                <tr><td><h2><%=files%></h2> </td></tr>
                               
                       
                        
                 </table></center>
                    
                    
             



          
             


           </div>

	</div>
   
</div>
</div>
<!-- content ends -->
<!-- footer begins -->

</div>
</body>
</html>
