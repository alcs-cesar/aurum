/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.calfonso.aurum.spring.negocio.impl;

import java.util.ArrayList;
import java.util.List;
import org.calfonso.aurum.spring.datos.dao.AsentamientoDao;
import org.calfonso.aurum.spring.datos.dao.CodigoPostalDao;
import org.calfonso.aurum.spring.datos.entidades.Asentamiento;
import org.calfonso.aurum.spring.datos.entidades.CodigoPostal;
import org.calfonso.aurum.spring.negocio.AsentamientoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author cesar
 */
@Service
@Transactional
public class AsentamientoServicioImpl implements AsentamientoServicio{
    
    private final AsentamientoDao asentamientoDao;
    private final CodigoPostalDao codigoPostalDao;

    @Autowired
    public AsentamientoServicioImpl(AsentamientoDao asentamientoDao, CodigoPostalDao codigoPostalDao) {
        this.asentamientoDao = asentamientoDao;
        this.codigoPostalDao = codigoPostalDao;
    }

    @Override
    public List<Asentamiento> buscarPorCodigoPostal(String codigoPostal) {
        List<Asentamiento> asentamientos = new ArrayList<Asentamiento>();
        
        for(CodigoPostal cp : codigoPostalDao.findByNumeroCodigo(codigoPostal)){
            asentamientos.addAll(cp.getAsentamientos());
        }
        return asentamientos;
    }
    
}
