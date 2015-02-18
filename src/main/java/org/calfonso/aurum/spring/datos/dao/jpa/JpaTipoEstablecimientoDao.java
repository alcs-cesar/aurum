/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.calfonso.aurum.spring.datos.dao.jpa;

import org.calfonso.aurum.spring.datos.dao.TipoEstablecimientoDao;
import org.calfonso.aurum.spring.datos.entidades.TipoAsentamiento;
import org.calfonso.aurum.spring.datos.entidades.TipoEstablecimiento;
import org.springframework.stereotype.Repository;

/**
 *
 * @author cesar
 */
@Repository
public class JpaTipoEstablecimientoDao extends JpaAbstractGenericoDao<TipoEstablecimiento, Short> 
    implements TipoEstablecimientoDao{

    public JpaTipoEstablecimientoDao() {
        super(TipoEstablecimiento.class);
    }
    
    
}
