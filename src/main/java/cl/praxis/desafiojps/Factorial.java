package cl.praxis.desafiojps;

import cl.praxis.desafiojps.models.Utilities;
import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "factorial", value = "/factorial")
public class Factorial extends HttpServlet {

    public Factorial() {
        super();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        int number = Integer.parseInt(request.getParameter("value"));

        Utilities utilities = new Utilities();
        String factorial = String.valueOf(utilities.factorial(number));

        response.getWriter().append("El factorial de " + number + "es ").append(factorial);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}