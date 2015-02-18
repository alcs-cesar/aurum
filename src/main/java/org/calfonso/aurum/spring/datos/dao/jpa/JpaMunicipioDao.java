/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.calfonso.aurum.spring.datos.dao.jpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.calfonso.aurum.spring.datos.dao.MunicipioDao;
import org.calfonso.aurum.spring.datos.entidades.Municipio;
import org.calfonso.aurum.spring.datos.entidades.Plaza;
import org.springframework.stereotype.Repository;

/**
 *
 * @author cesar
 */
@Repository
public class JpaMunicipioDao extends JpaAbstractGenericoDao<Municipio, Integer> 
    implements MunicipioDao{

    public JpaMunicipioDao() {
        super(Municipio.class);
    }
    
    @Override
    public List<Municipio> findByPlaza(Plaza plaza) {
        return getEntityManager().createNamedQuery(Municipio.BUSCAR_POR_PLAZA)
                .setParameter("plaza", plaza)
                .getResultList();
    }
    
}
