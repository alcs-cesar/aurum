/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.calfonso.aurum.spring.datos.dao;


import java.math.BigDecimal;
import java.util.List;
import org.calfonso.aurum.spring.datos.entidades.Asentamiento;
import org.calfonso.aurum.spring.datos.entidades.CodigoPostal;

/**
 *
 * @author cesar
 */
public interface AsentamientoDao extends GenericoDao<Asentamiento, BigDecimal>{
    List<Asentamiento> findByName(String nombreAsentamiento);
    List<Asentamiento> findByCodigoPostal(CodigoPostal codigoPostal);
}
