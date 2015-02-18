/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.calfonso.aurum.spring.datos.dao.jpa;

import java.math.BigDecimal;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.calfonso.aurum.spring.datos.dao.AsentamientoDao;
import org.calfonso.aurum.spring.datos.entidades.Asentamiento;
import org.calfonso.aurum.spring.datos.entidades.CodigoPostal;
import org.springframework.stereotype.Repository;

/**
 *
 * @author cesar
 */
@Repository
public class JpaAsentamientoDao extends JpaAbstractGenericoDao<Asentamiento, BigDecimal> 
    implements AsentamientoDao{

    public JpaAsentamientoDao() {
        super(Asentamiento.class);
    }
    
    @Override
    public List<Asentamiento> findByName(String nombreAsentamiento) {
        return getEntityManager().createNamedQuery(Asentamiento.BUSCAR_POR_NOMBRE)
                .setParameter("nombreAsentamiento", "%" + nombreAsentamiento + "%")
                .getResultList();
    }

    @Override
    public List<Asentamiento> findByCodigoPostal(CodigoPostal codigoPostal) {
        return getEntityManager().createNamedQuery(Asentamiento.BUSCAR_POR_CP)
                .setParameter("codigoPostal", codigoPostal)
                .getResultList();
    }
    
}
