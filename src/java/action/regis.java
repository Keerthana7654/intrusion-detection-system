package action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jp
 */
public class regis extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
             Calendar cal = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("HH:mm dd/MM/yyyy");
		String report= format.format(cal.getTime());
          
           
            String userid = request.getParameter("usreid");
             System.out.println(userid);
             String username = request.getParameter("username");
             System.out.println(username);
             String passw= request.getParameter("password");
             System.out.println(passw);
            String gender = request.getParameter("gender");
            String loca = request.getParameter("loca");
            String mailid = request.getParameter("mailid");
            String age = request.getParameter("age");
            String phone = request.getParameter("phone");
            String date = report;
            String attackuser = "normal";
            String attackusername = "0";
            String attackcount  = "0";
            


            int k=1;

            if(k==1){
            Connection con  =action.Dbcon.getCon();
            Statement st = con.createStatement();
            int i = st.executeUpdate("insert into userreg (userid,username,password,gender,location,mailid,age,phone,date,attackuser,attackcount,attackusername)values('"+userid+"','"+username+"','"+passw+"','"+gender+"','"+loca+"','"+mailid+"','"+age+"','"+phone+"','"+date+"','"+attackuser+"','"+attackcount+"','"+attackusername+"')"); 
            
             if(i!=0){

                 
                 response.sendRedirect("userlogin.jsp?Msg=Registeration done");
                 System.out.println("Registeration done");
             }
             else{
                   response.sendRedirect("userregis.jsp?m=submit_error...check");
                   System.out.println("Registeration not done check it ");
             }
            }
            else{
                response.sendRedirect("mobile_user.jsp?m=password_not_match");
            }
        } catch (Exception ex) {
            Logger.getLogger(action.regis.class.getName()).log(Level.SEVERE, null, ex);
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
//            Logger.getLogger(actionPackage.register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
//            Logger.getLogger(actionPackage.register.class.getName()).log(Level.SEVERE, null, ex);
        }
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
