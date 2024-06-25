package cl.praxis.desafiojps.servlets;

import java.io.*;

import cl.praxis.desafiojps.utils.Utilities;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "Factorial", value = "/factorial")
public class Factorial extends HttpServlet {

    public Factorial() {
        super();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        int number = Integer.parseInt(request.getParameter("value"));

        Utilities utilities = new Utilities();
        String factorial = String.valueOf(utilities.factorial(number));

        response.getWriter().append("El factorial de ").append(String.valueOf(number)).append("es ").append(factorial);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request, response);
    }
}