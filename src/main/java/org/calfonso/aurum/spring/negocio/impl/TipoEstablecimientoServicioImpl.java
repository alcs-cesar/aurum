/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.calfonso.aurum.spring.negocio.impl;


import org.calfonso.aurum.spring.datos.entidades.TipoEstablecimiento;
import org.calfonso.aurum.spring.negocio.TipoEstablecimientoServicio;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author cesar
 */
@Transactional
public class TipoEstablecimientoServicioImpl extends GenericoServicioImpl<TipoEstablecimiento, Short> 
    implements TipoEstablecimientoServicio{
    
}
