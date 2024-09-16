package uy.edu.fing.tse.demo2023;

import java.io.IOException;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import uy.edu.fing.tse.demo2023.entity.Hecho;
import uy.edu.fing.tse.demo2023.service.HechoService;

@WebServlet("/agregarHecho")
public class AgregarHechoServlet extends HttpServlet {
    
    @EJB
    private HechoService hechoService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String descripcion = request.getParameter("descripcion");
        int valor = Integer.parseInt(request.getParameter("valor"));
        Date fecha = new Date(); // puedes manejar mejor la fecha según el input

        Hecho hecho = new Hecho();
        hecho.setDescripcion(descripcion);
        hecho.setValor(valor);
        hecho.setFecha(fecha);

        try {
            hechoService.agregarHecho(hecho);
            response.sendRedirect("listarHechos.jsp");
        } catch (Exception e) {
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
}
