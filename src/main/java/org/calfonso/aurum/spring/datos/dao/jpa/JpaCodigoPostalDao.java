/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.calfonso.aurum.spring.datos.dao.jpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.calfonso.aurum.spring.datos.dao.CodigoPostalDao;
import org.calfonso.aurum.spring.datos.entidades.CodigoPostal;
import org.springframework.stereotype.Repository;

/**
 *
 * @author cesar
 */
@Repository
public class JpaCodigoPostalDao extends JpaAbstractGenericoDao<CodigoPostal, Integer> 
    implements CodigoPostalDao{

    public JpaCodigoPostalDao() {
        super(CodigoPostal.class);
    }
    
    @Override
    public List<CodigoPostal> findByNumeroCodigo(String numeroCodigo) {
        return getEntityManager().createNamedQuery(CodigoPostal.BUSCAR_POR_NUMERO)
                .setParameter("numeroCodigo", "%" + numeroCodigo + "%")
                .getResultList();
    }
    
}
