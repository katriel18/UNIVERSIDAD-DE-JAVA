
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
      
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
        String usuario=request.getParameter("usuario");
        
        String password=request.getParameter("password");
   
        System.out.println("usuario = " + usuario);
        System.out.println("password = " + password);
        
        PrintWriter out=response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        out.print("<html>");
        out.print("<body>");
        out.print("El parametro usuario: "+usuario);
        out.print("<br/>");
        out.print("<br/>");
        out.print("El parametro password: "+password);
        out.print("</body>");
        out.print("</html>");
        out.close();
    }
    
}
