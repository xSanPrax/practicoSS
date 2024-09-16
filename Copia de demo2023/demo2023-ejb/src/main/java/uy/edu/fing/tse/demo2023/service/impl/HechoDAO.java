package uy.edu.fing.tse.demo2023.service.impl;

import java.util.List;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import uy.edu.fing.tse.demo2023.entity.Hecho;

@Singleton
public class HechoDAO {

    @PersistenceContext(unitName = "TSE2023")
    private EntityManager em;

    public void agregarHecho(Hecho hecho) {
        em.persist(hecho);
    }

    public List<Hecho> listarHechos() {
        return em.createQuery("SELECT h FROM Hecho h", Hecho.class).getResultList();
    }

    public Hecho buscarHechoPorDescripcion(String descripcion) {
        try {
            return em.createQuery("SELECT h FROM Hecho h WHERE h.descripcion = :descripcion", Hecho.class)
                     .setParameter("descripcion", descripcion)
                     .getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
}
