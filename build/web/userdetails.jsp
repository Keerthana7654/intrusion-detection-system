<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="action.Dbcon"%>
<%@page import="java.sql.Connection"%>
?<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Intrusion Detection and Prevention</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="styles.css" rel="stylesheet" type="text/css" media="screen" />
<link href="textboxstyle.css" rel="stylesheet" type="text/css" media="screen" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="screen" />
</head>
<body>
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
<div id="main" style="margin-top: 55px" >
<div id="main_top"></div>
<div id="content_bg">
  <div id="content">
	<div id="right">
		<h2>LIST</h2>
		<div class="categories">
		<ul>
			<li><a href="index.jsp" title="" class="active">Home</a></li>
                        <li><a href="userdetails.jsp" title="">USER DETAILS</a></li>
                        <li><a href="attackdetails.jsp" title="">ATTACK USER</a></li>
                        <li><a href="attackfiles.jsp" title="">ATTACK FILE</a></li>
                        <li><a href="filedetail.jsp" title="">FILE DETAILS</a></li>
			
			
		</ul>
		</div>
		
		<div class="company">
			<ul>

			</ul>
		</div>
	</div>
          	<div id="left" style=" width:580px;height: 400px;overflow: auto">
		<div class="left_top"></div>
                <center><h1 style="color: red;font-family:Castellar;font-size: 25px">USER REGISTRATION DETAILS</h1></center>
		<div id="text">
		
                   
                    <div >
                        <table class="table-fill" >
                            <thead>
        <tr><th class="text-left" >USERID</th><th class="text-left" >USERNAME</th><th class="text-left" >GENDER</th><th class="text-left" >LOCATION</th><th class="text-left" >MAILID</th><th class="text-left" >PHONE</th><th class="text-left" >AGE</th></tr>
                            </thead>
                           
        
        <%
        Connection con = Dbcon.getCon();
    Statement st = con.createStatement();
         ResultSet rs = st.executeQuery("select * from userreg ");
                       while (rs.next()) {
                           String userid=rs.getString("userid");
                           String username =rs.getString("username");
                            String gender=rs.getString("gender");
                           String location =rs.getString("location");
                           String mailid=rs.getString("mailid");
                           String date =rs.getString("phone");
                           String age =rs.getString("age");
                            
                           
        %>
        
        <tbody class="table-hover">  
                  
        
        
            <tr><td class="text-left" style="color:red" ><%=userid%></td>
            <td class="text-left" style="color:red" ><%=username%></td>
           <td class="text-left" style="color:red" ><%=gender%></td>
           <td class="text-left" style="color:red" ><%=location%></td>
            <td class="text-left" style="color:red" ><%=mailid%></td>
            <td class="text-left" style="color:red" ><%=date%></td>
            <td class="text-left" style="color:red" ><%=age%></td></tr>
                    
                    
                    <%
                            
                        }
                        
                    %>
                            </tbody>
        </table>    
                    </div>	
             



          
             


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
