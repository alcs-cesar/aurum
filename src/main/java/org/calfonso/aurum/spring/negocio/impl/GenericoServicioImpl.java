/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.calfonso.aurum.spring.negocio.impl;

import java.io.Serializable;
import java.util.List;
import org.calfonso.aurum.spring.datos.dao.GenericoDao;
import org.calfonso.aurum.spring.negocio.GenericoServicio;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author cesar
 */
public abstract class GenericoServicioImpl<T extends Serializable, S extends Serializable> 
    implements GenericoServicio<T, S>{
    
    @Autowired
    private GenericoDao<T,S> genericoDao;

    @Override
    public T crear(T entidad) {
        return genericoDao.crear(entidad);
    }

    @Override
    public T buscarPorId(S id) {
        return genericoDao.buscarPorId(id);
    }

    @Override
    public List<T> buscarTodos() {
        return genericoDao.buscarTodos();
    }

    @Override
    public void actualizar(T entidad) {
        genericoDao.actualizar(entidad);
    }

    @Override
    public void eliminar(T entidad) {
        genericoDao.eliminar(entidad);
    }

    @Override
    public void eliminarPorId(S id) {
        genericoDao.eliminarPorId(id);
    }

    @Override
    public Long totalElementos() {
        return genericoDao.totalElementos();
    }
    
    
}
