package uy.edu.fing.tse.demo2023.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import uy.edu.fing.tse.demo2023.entity.Hecho;
import uy.edu.fing.tse.demo2023.service.impl.HechoDAO;
import java.util.List;


@Stateless
public class HechoService {

    @EJB
    private HechoDAO hechoDAO;

    public void agregarHecho(Hecho hecho) throws Exception {
        if (hecho.getValor() > 0) {
            hechoDAO.agregarHecho(hecho);
        } else {
            throw new Exception("El valor debe ser mayor que cero.");
        }
    }

    public Hecho buscarHechoPorDescripcion(String descripcion) {
        return hechoDAO.buscarHechoPorDescripcion(descripcion);
    } 

    public List<Hecho> listarHechos() {
        return hechoDAO.listarHechos();
    }
}
