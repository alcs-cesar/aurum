/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.calfonso.aurum.spring.datos;

import java.util.List;
import org.calfonso.aurum.spring.datos.config.JpaConfig;
import org.calfonso.aurum.spring.datos.dao.GenericoDao;
import org.calfonso.aurum.spring.datos.dao.TipoEstablecimientoDao;
import org.calfonso.aurum.spring.datos.entidades.TipoAsentamiento;
import org.calfonso.aurum.spring.datos.entidades.TipoEstablecimiento;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
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
public class TipoEstablecimientoDaoTest {
    
    @Autowired
    TipoEstablecimientoDao tipoEstablecimientoDao;
    
    //Confirma que el total de elementos obtenidos desde la BD 
    //embedida sea igual a 10
    @Test
    public void count(){
        assertEquals(Long.valueOf(TIPOS_ESTABLECIMIENTO.length - 1), 
                tipoEstablecimientoDao.totalElementos());
    }
    
    /**
     *      1.- Confirma que el número del elementos recuperados desde la BD
     *          embebida sea el total de insertados en ella
     * 
     *      2.- Véase Comparación Semántica 
     **/
    @Test
    @Transactional
    public void buscarTodos(){
        List<TipoEstablecimiento> establecimientos = tipoEstablecimientoDao.buscarTodos();
        //1.-
        assertEquals((TIPOS_ESTABLECIMIENTO.length - 1), establecimientos.size());
        for(int indice = 0; indice < establecimientos.size(); indice++){
            //2.-
            assertTipoEstablecimiento(indice, establecimientos.get(indice));
        }
    }
    
    // Véase Comparación Semántica
    @Test
    @Transactional
    public void buscarPorId(){
        for(int indice = 0; indice < TIPOS_ESTABLECIMIENTO.length - 1; indice++){
            assertTipoEstablecimiento(indice, tipoEstablecimientoDao.buscarPorId((short)(indice + 1)));
        }
    }
    
    /**
     *      1.- Confirma el número total de elementos en la BD
     * 
     *      2.- Crea una nueva instancia, la persiste y el resultado
     *          de dicho método es asignado a una nueva variable
     * 
     *      3.- Confirma que el total de elementos recuperados desde la BD
     *          haya aumentado en uno
     * 
     *      4.- Confirma que el elemento persistido es idéntico al
     *          de la memoria (el del array), verificando la generación del ID
     * 
     *      5.- Confirma el funcionameinto de la busqueda por id
     **/
    @Test
    @Transactional
    public void crear_NuevoTipoAsentamiento(){
        //1.-
        assertEquals(Long.valueOf(TIPOS_ESTABLECIMIENTO.length - 1), 
                tipoEstablecimientoDao.totalElementos());
        //2.-
        TipoEstablecimiento tipoEstablecimiento = new TipoEstablecimiento(null, "Nuevo_Tipo");
        TipoEstablecimiento persistido = tipoEstablecimientoDao.crear(tipoEstablecimiento);
        //3.-
        assertEquals(Long.valueOf(TIPOS_ESTABLECIMIENTO.length), 
                tipoEstablecimientoDao.totalElementos());
        //4.-
        assertTipoEstablecimiento((TIPOS_ESTABLECIMIENTO.length - 1), persistido);
        //5.-
        assertTipoEstablecimiento((TIPOS_ESTABLECIMIENTO.length - 1), 
                tipoEstablecimientoDao.buscarPorId((short)TIPOS_ESTABLECIMIENTO.length));
    }
   
    //Comparación semántica: Confirma que el elemento en memoria (el del array) 
    //sea semánticamente idéntico al recuperado desde la BD
    private static void assertTipoEstablecimiento(int indiceEsperadoTipoEstablecimiento, 
            TipoEstablecimiento actual){
        TipoEstablecimiento esperado = TIPOS_ESTABLECIMIENTO[indiceEsperadoTipoEstablecimiento];
        assertEquals(esperado, actual);
    }
    
    private static TipoEstablecimiento[] TIPOS_ESTABLECIMIENTO = new TipoEstablecimiento[11];
    
    @BeforeClass
    public static void before(){
        TIPOS_ESTABLECIMIENTO[0] = new TipoEstablecimiento((short)1, "Plaza Comercial");
        TIPOS_ESTABLECIMIENTO[1] = new TipoEstablecimiento((short)2, "Restaurante AAA");
        TIPOS_ESTABLECIMIENTO[2] = new TipoEstablecimiento((short)3, "Restaurante AA");
        TIPOS_ESTABLECIMIENTO[3] = new TipoEstablecimiento((short)4, "Restaurante A");
        TIPOS_ESTABLECIMIENTO[4] = new TipoEstablecimiento((short)5, "Hospital");
        TIPOS_ESTABLECIMIENTO[5] = new TipoEstablecimiento((short)6, "Clinica");
        TIPOS_ESTABLECIMIENTO[6] = new TipoEstablecimiento((short)7, "Estetica");
        TIPOS_ESTABLECIMIENTO[7] = new TipoEstablecimiento((short)8, "Club Deportivo");
        TIPOS_ESTABLECIMIENTO[8] = new TipoEstablecimiento((short)9, "Bar");
        TIPOS_ESTABLECIMIENTO[9] = new TipoEstablecimiento((short)10, "Otro");
        TIPOS_ESTABLECIMIENTO[10] = new TipoEstablecimiento((short)11, "Nuevo_Tipo");
    }
}
