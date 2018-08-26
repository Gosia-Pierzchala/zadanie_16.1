package przelicznikMetryczny;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/przelicznikMetryczny")
public class PrzelicznikMetrycznyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String metry = request.getParameter("metry");
        String centymetry = request.getParameter("centymetry");
        String milimetry = request.getParameter("milimetry");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        final PrintWriter writer = response.getWriter();

        if(!metry.equals("") && centymetry.equals("") && milimetry.equals("")) {
            double m = Double.valueOf(metry);
            double result1 = CalculateLenght.changeMtoCM(m);
            double result2 = CalculateLenght.changeMtoMM(m);
            writer.println("Podana wartość " + metry + " m w przeliczeniu na");
            writer.println("centymetry: " + result1 + ",");
            writer.println("milimetry: " + result2);
        } else if(!centymetry.equals("") && metry.equals("") && milimetry.equals("")){
            double cm = Double.valueOf(centymetry);
            double result1 = CalculateLenght.changeCMtoM(cm);
            double result2 = CalculateLenght.changeCMtoMM(cm);
            writer.println("Podana wartość " + centymetry + " cm w przeliczeniu na");
            writer.println("metry:  " + result1 + ",");
            writer.println("milimetry: " + result2);
        } else if(!milimetry.equals("") && centymetry.equals("") && metry.equals("")){
            double mm = Double.valueOf(milimetry);
            double result1 = CalculateLenght.changeMMtoCM(mm);
            double result2 = CalculateLenght.changeMMtoM(mm);
            writer.println("Podana wartość " + milimetry + " mm w przeliczeniu na");
            writer.println("centymetry: " + result1 + ",");
            writer.println("metry: " + result2);
        } else {
            writer.println("Należy wypełnić tylko jedno pole");
        }
    }

}
