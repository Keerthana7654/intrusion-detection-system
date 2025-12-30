package action;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@MultipartConfig(maxFileSize = 16177215)
public class userimagupload extends HttpServlet {
 
                    String fileid = null;
         String filename = null;
         String filetype = null;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            
           
           
            
            
            
//                    String group = null;
                    
            boolean isMultipartContent = ServletFileUpload.isMultipartContent(request);
            if (!isMultipartContent) {
                return;
            }
            FileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);
            try {
                List<FileItem> fields = upload.parseRequest(request);
                Iterator<FileItem> it = fields.iterator();
//                if (! .hasNext()) {
//                    return;
//                }
                while (it.hasNext()) {
                    FileItem fileItem = it.next();
                    if (fileItem.getFieldName().equals("fileid")) {
                        fileid = fileItem.getString();
                    } 
                    else if (fileItem.getFieldName().equals("filename")) {
                        filename = fileItem.getString();
                    } 
                    else if (fileItem.getFieldName().equals("filetyp")) {
                        filetype = fileItem.getString();
                    } 
                    else {
                    }
                    boolean isFormField = fileItem.isFormField();
                    if (isFormField) {
                    } else {
                        String s = fileItem.getName().substring(fileItem.getName().lastIndexOf("\\") + 1);
                        fileItem.write(new File("D:\\uploads\\" + s));//create folder and set path for store
                        out.println(s);
                        fileItem.getOutputStream().close();
                        try {
                            Connection cn = Dbcon.getCon();
                                PreparedStatement ps = cn.prepareStatement("insert into userfle(fileid,filename,filetyp,files)values(?,?,?,?)");
                            FileInputStream fin = new FileInputStream("D:\\uploads\\" + s); //set path for access 
                            ps.setString(1, fileid);
                            ps.setString(2, filename);
                            ps.setString(3, filetype);
                            ps.setBinaryStream(4, fin, fin.available());
                            
                           
                            int i = ps.executeUpdate();
                            if (i == 1) {
                                response.sendRedirect("userupload.jsp?msg=Image_Shared");
                            } else {
                                response.sendRedirect("userupload.js?msg=Try_Again");
                            }
                            cn.close();

                        } catch (Exception e) {
                            out.println(e.toString());
                        }
                    }
                }
            } catch (FileUploadException e) {
                e.printStackTrace();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}

