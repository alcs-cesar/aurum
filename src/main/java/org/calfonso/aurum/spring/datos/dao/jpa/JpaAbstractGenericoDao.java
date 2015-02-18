/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.calfonso.aurum.spring.datos.dao.jpa;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author cesar
 */
public class JpaAbstractGenericoDao<T extends Serializable, S extends Serializable> {
    
    @PersistenceContext
    private EntityManager entityManager;
    private Class<T> classEntidad;

    protected EntityManager getEntityManager() {
        return entityManager;
    }
   
   
    public JpaAbstractGenericoDao() {
    }
    
    public JpaAbstractGenericoDao(Class<T> classEntidad){
        this.classEntidad = classEntidad;
    }
 
    public T crear(T entidad) {
        entityManager.persist(entidad);
        return entidad;
    }

    public T buscarPorId(S id) {
        return entityManager.find(classEntidad, id);
    }

    public List<T> buscarTodos() {
        return entityManager.createQuery("SELECT e FROM " + classEntidad.getSimpleName() + " e", classEntidad)
                .getResultList();
    }

    public void actualizar(T entidad) {
        entityManager.merge(entidad);
    }

    public void eliminar(T entidad) {
        entityManager.remove(entidad);
    }

    public void eliminarPorId(S id) {
        entityManager.remove(id);
    }

    public Long totalElementos() {
        return (long)buscarTodos().size();
    }

    
}
