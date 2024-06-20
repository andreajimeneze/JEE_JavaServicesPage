package cl.praxis.desafiojps;

import cl.praxis.desafiojps.models.Utilities;
import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "impar", value = "/impar")
public class Impar extends HttpServlet {
  public Impar() {
      super();
  }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int number = Integer.parseInt(request.getParameter("value"));

        Utilities utilities = new Utilities();
        String parOImpar = utilities.parOimpar(number);

        response.getWritter().append("El número" + number + "es: ").append(parOimpar);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}