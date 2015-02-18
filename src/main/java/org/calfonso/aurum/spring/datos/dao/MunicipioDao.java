/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.calfonso.aurum.spring.datos.dao;

import java.util.List;
import org.calfonso.aurum.spring.datos.entidades.Municipio;
import org.calfonso.aurum.spring.datos.entidades.Plaza;

/**
 *
 * @author cesar
 */
public interface MunicipioDao extends GenericoDao<Municipio, Integer>{
    List<Municipio> findByPlaza(Plaza plaza);
}
