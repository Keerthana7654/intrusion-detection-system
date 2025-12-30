<%-- 
    Document   : reranking3
    Created on : Aug 20, 2015, 3:59:23 PM
    Author     : java1
--%>
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
               String files  = ses.getAttribute("filepath").toString();
               String uidsss  = ses.getAttribute("uidsss").toString();
               String attackname  = "cyberattadck";
                String attackk  = "attack";
               String useername;
              
              String s = request.getQueryString();
            System.out.println("your value="+s);
            session.setAttribute("breffid", s);
           
            int i = 1;
           
            Integer r = null;
            Connection con = Dbcon.getCon();
            Statement st = con.createStatement();
            Statement st1 = con.createStatement();
            ResultSet rs = st.executeQuery("select * from userreg  where id='" + userid + "'");
            if (rs.next()) {
                r = rs.getInt("attackcount");
                 useername=rs.getString("username");
            }            
            int a = r+1;
           
            System.out.println("here added " + a);
            int up = st.executeUpdate("update userreg set attackcount ='" + a + "' , attackuser ='" + attackk + "'  where id = '" + userid + "' ");
            int upp = st1.executeUpdate("insert into attackfile(userid,attackname,attackfile) values('"+uidsss+"','"+attackname+"','"+files+"')");
            if (up != 0) {
                response.sendRedirect("cyperattack2.jsp?msg=imageview");
                System.out.println("update and insert sucess..!");
            }
        %>
        
    </body>
</html>
