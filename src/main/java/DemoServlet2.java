import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class DemoServlet2 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) {
        try {

            res.setContentType("text/html");
            PrintWriter out = res.getWriter();

            ServletContext context = getServletContext();
            String n = (String) context.getAttribute("company");

            out.println("Welcome to " + n);
            out.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
