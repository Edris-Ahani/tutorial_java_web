import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class DemoServlet1 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) {
        try {

            res.setContentType("text/html");
            PrintWriter out = res.getWriter();

            ServletContext context = getServletContext();
            context.setAttribute("company", "IBM");

            //context.removeAttribute("company");

            out.println("Welcome to first servlet");
            out.println("<a href='servlet2'>visit</a>");
            out.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
