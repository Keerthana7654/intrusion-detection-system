 <%@page import="action.cyberattact"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="action.cyberattact"%>
<%
                    String files = "D:\\uploads\\" + request.getParameter("cyber");
                    session.setAttribute("filepath", files);
                    
                    String key = "pavihtra"; // needs to be at least 8 characters for DES
                       

			FileInputStream fis = new FileInputStream(files);
                         
			FileOutputStream fos = new FileOutputStream(files);
			cyberattact.doc(key, fis, fos);
                     
                     
                     
                        response.sendRedirect("cyberupdata.jsp?msg=requestsend");
                    
                    %>