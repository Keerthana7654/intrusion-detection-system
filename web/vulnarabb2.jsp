<%@page import="org.apache.commons.io.FileUtils"%>
<%@page import="org.apache.commons.io.filefilter.TrueFileFilter"%>
<%@page import="java.util.List"%>
<%@page import="java.io.File"%>
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
<div id="main" style="margin-top: 150px" >
<div id="main_top"></div>
<div id="content_bg">
  <div id="content">
	<div id="right">
		<h2>LIST</h2>
		<div class="categories">
		<ul>
			<li><a href="index.jsp">HOME</a></li>
			<li><a href="attack.jsp">BACK</a></li>
			
			
		</ul>
		</div>
		
		<div class="company">
			<ul>

			</ul>
		</div>
	</div>
      <div id="left" style="height: 400px;overflow: auto">
		<div class="left_top"></div>
                <center><h1 style="color: RED;font-family:Castellar;font-size: 25px">VULNERABILITY ATTACK FILES </h1></center>
		<%
                
         
               HttpSession ses = request.getSession();
               String vuln  = ses.getAttribute("vuln").toString();
               File dir = new File(vuln);
               List<File> files = (List<File>) FileUtils.listFiles(dir, TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE);
		for (File file : files) {
                    
                                       }
                    %>
                    
               
   
                
                  
                   
                    
                   
                <div id="text">
		
                   
                    
                        <center><table><br></br>
                                
                                
                                
                                <tr><td><h2><%=files%></h2> </td></tr>
                                
                               <tr><td><h2>LIST All ATTACK FILES</h2> </tr>
                       
                        
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
