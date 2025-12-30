<%-- 
    Document   : reranking3
    Created on : Aug 20, 2015, 3:59:23 PM
    Author     : java1
--%>
<%@page import="org.apache.commons.io.filefilter.TrueFileFilter"%>
<%@page import="org.apache.commons.io.FileUtils"%>
<%@page import="java.util.List"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.File"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="action.Dbcon"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.io.InputStream"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        
         HttpSession ses = request.getSession();
              String userid  = ses.getAttribute("uidss").toString();
               
           String Attack="warninguser";
           
            Connection con = Dbcon.getCon();
            Statement st = con.createStatement();
            Statement st1 = con.createStatement();
            ResultSet rs = st.executeQuery("select * from userreg  where id='" + userid + "'");
            if (rs.next()) {
               int up = st.executeUpdate("update userreg set attackuser ='" + Attack + "'  where id = '" + userid + "' ");
                response.sendRedirect("warningmsg.jsp?msg=imageview"); 
            }            
          
           
            
        %>
        
    </body>
</html>
