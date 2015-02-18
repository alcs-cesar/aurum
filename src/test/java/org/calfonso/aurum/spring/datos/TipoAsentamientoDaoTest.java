/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.calfonso.aurum.spring.datos;

import java.util.List;
import org.calfonso.aurum.spring.datos.config.JpaConfig;
import org.calfonso.aurum.spring.datos.dao.TipoAsentamientoDao;
import org.calfonso.aurum.spring.datos.entidades.TipoAsentamiento;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author cesar
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JpaConfig.class)
public class TipoAsentamientoDaoTest {
    @Autowired
    TipoAsentamientoDao tipoAsentamientoDao;
    
    @Test
    @Transactional
    public void buscarTodos(){
        List<TipoAsentamiento> asentamientos = tipoAsentamientoDao.buscarTodos();
        assertEquals(TIPOS_ASENTAMIENTOS.length, asentamientos.size());
        for(int indiceElemento = 0; indiceElemento < TIPOS_ASENTAMIENTOS.length; indiceElemento++){
            assertTipoAsentamiento(indiceElemento, TIPOS_ASENTAMIENTOS[indiceElemento]);
        }
    }
    
    private static void assertTipoAsentamiento(int indiceTipoAsentamientoEsperado, 
            TipoAsentamiento actual){
        TipoAsentamiento esperado = TIPOS_ASENTAMIENTOS[indiceTipoAsentamientoEsperado];
        assertEquals(esperado, actual);
    }
    
    private static TipoAsentamiento[] TIPOS_ASENTAMIENTOS = new TipoAsentamiento[3];
    
    @BeforeClass
    public static void before(){
        TIPOS_ASENTAMIENTOS[0] =  new TipoAsentamiento((short)1,"Colonia");
        TIPOS_ASENTAMIENTOS[1] =  new TipoAsentamiento((short)2,"Barrio");
        TIPOS_ASENTAMIENTOS[2] =  new TipoAsentamiento((short)3,"Unidad Habitacional");
    }
}
