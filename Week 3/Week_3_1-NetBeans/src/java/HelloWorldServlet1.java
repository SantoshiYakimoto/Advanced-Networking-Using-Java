import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dpayne
 */
/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
@WebServlet(urlPatterns = {"/HelloWorldServlet1"})
public class HelloWorldServlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        
        try{
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet - Hello World Servlet 1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet - Hello World Servlet 1</h1>");
            out.println("</body>");
            out.println("</html>");
        }
        finally{
            out.close();
        }
    }
}