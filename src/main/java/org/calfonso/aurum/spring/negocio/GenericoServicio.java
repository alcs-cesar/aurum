/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.calfonso.aurum.spring.negocio;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author cesar
 */
public interface GenericoServicio<T extends Serializable, S extends Serializable> {
    T crear(T entidad);
    T buscarPorId(S id);
    List<T> buscarTodos();
    void actualizar(T entidad);
    void eliminar(T entidad);
    void eliminarPorId(S id);
    Long totalElementos();
}
