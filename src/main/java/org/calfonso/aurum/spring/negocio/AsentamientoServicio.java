/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.calfonso.aurum.spring.negocio;

import java.util.List;
import org.calfonso.aurum.spring.datos.entidades.Asentamiento;

/**
 *
 * @author cesar
 */
public interface AsentamientoServicio {
    List<Asentamiento> buscarPorCodigoPostal(String codigoPostal);
}
