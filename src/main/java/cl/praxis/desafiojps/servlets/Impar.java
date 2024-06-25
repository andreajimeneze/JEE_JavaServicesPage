package cl.praxis.desafiojps.servlets;

import java.io.*;

import cl.praxis.desafiojps.utils.Utilities;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "Impar", value = "/impar")
public class Impar extends HttpServlet {
  public Impar() {
      super();
  }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int number = Integer.parseInt(request.getParameter("value"));

        Utilities utilities = new Utilities();
        String parImpar = utilities.parOImpar(number);

        response.getWriter().append("El numero ").append(String.valueOf(number)).append(" es: ").append(parImpar);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request, response);
    }
}