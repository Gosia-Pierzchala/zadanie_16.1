package przelicznikWag;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/przelicznikWag")
public class PrzelicznikWagServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String kilogramy = request.getParameter("kilogramy");
        String gramy = request.getParameter("gramy");
        String miligramy = request.getParameter("miligramy");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        final PrintWriter writer = response.getWriter();

        if(!kilogramy.equals(null) && gramy.equals(null) && miligramy.equals(null)) {
            double kg = Double.valueOf(kilogramy);
            double result1 = CalculateWeight.changeKGtoG(kg);
            double result2 = CalculateWeight.changeKGtoMg(kg);
            writer.println("Podana wartość " + kilogramy + " kg w przeliczeniu na:" + "/n" + "gramy: " + result1 + "/n" + "miligramy: " + result2);
        } else if(!gramy.equals(null) && kilogramy.equals(null) && miligramy.equals(null)){
            double g = Double.valueOf(gramy);
            double result1 = CalculateWeight.changeGtoMg(g);
            double result2 = CalculateWeight.changeGtoKg(g);
            writer.println("Podana wartość " + gramy + " g w przeliczeniu na:" + "/n" + "miligramy: " + result1 + "/n" + "kilogramy: " + result2);
        } else if(!miligramy.equals(null) && gramy.equals(null) && kilogramy.equals(null)){
            double mg = Double.valueOf(miligramy);
            double result1 = CalculateWeight.changeMGtoG(mg);
            double result2 = CalculateWeight.changeMGtoKG(mg);
            writer.println("Podana wartość " + miligramy + " mg w przeliczeniu na:" + "/n" + "gramy: " + result1 + "/n" + "kilogramy: " + result2);
        } else {
            writer.println("Należy wypełnić tylko jedno pole");
        }
    }
}
