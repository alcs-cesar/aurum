/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.calfonso.aurum.spring.datos;

import java.io.Serializable;
import java.util.List;

import org.calfonso.aurum.spring.datos.dao.AsentamientoDao;
import org.calfonso.aurum.spring.datos.dao.GenericoDao;
import org.calfonso.aurum.spring.datos.dao.MunicipioDao;
import org.calfonso.aurum.spring.datos.dao.jpa.JpaAbstractGenericoDao;
import org.calfonso.aurum.spring.datos.entidades.Asentamiento;
import org.calfonso.aurum.spring.datos.entidades.Municipio;
import org.calfonso.aurum.spring.datos.entidades.Plaza;
import org.calfonso.aurum.spring.datos.entidades.TipoAsentamiento;
import org.calfonso.aurum.spring.datos.entidades.TipoEstablecimiento;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author cesar
 */
public class TestGenericDao {
    public static void main(String[] args){
        /*
        ApplicationContext context = new AnnotationConfigApplicationContext(JPAConfig.class);
        //TipoEstablecimientoService tes = context.getBean(TipoEstablecimientoService.class);
        
       
        JpaGenericoDao<TipoEstablecimiento, Short> genericoDao = context.getBean(JpaGenericoDao.class);
        genericoDao.setClassEntidad(TipoEstablecimiento.class);
        System.out.println(genericoDao.buscarTodos());
        
        JpaGenericoDao<TipoAsentamiento, Short> genericoDao1 = context.getBean(JpaGenericoDao.class);
        genericoDao1.setClassEntidad(TipoAsentamiento.class);
        System.out.println(genericoDao1.buscarTodos());
        */
        /*     
        AsentamientoDao asentamientoDao = context.getBean(AsentamientoDao.class);
        Asentamiento asentamiento = asentamientoDao.findByName("resi").get(0);
        System.out.println(asentamiento);
        System.out.println(asentamiento.getIdCodigoPostal());
        System.out.println(asentamiento.getIdTipoAsentamiento());
        System.out.println(asentamiento.getIdCodigoPostal().getIdMunicipio());
        System.out.println(asentamiento.getIdCodigoPostal().getIdMunicipio().getIdEntidadFederativa());
        System.out.println(asentamiento.getIdCodigoPostal().getIdMunicipio().getIdPlaza());
        
        MunicipioDao municipioDao = context.getBean(MunicipioDao.class);
        Plaza plaza = new Plaza();
        plaza.setId((short)1);
        plaza.setNombrePlaza("Distrito Federal");
        List<Municipio> municipios = municipioDao.findByPlaza(plaza);
        System.out.println(municipios.get(0));
                */
    }
}
