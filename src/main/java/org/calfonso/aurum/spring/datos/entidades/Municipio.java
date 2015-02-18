/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.calfonso.aurum.spring.datos.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

/**
 *
 * @author cesar
 */
@Entity
@NamedQueries({
    @NamedQuery(name = Municipio.BUSCAR_POR_PLAZA, 
            query = "SELECT m FROM Municipio m WHERE m.idPlaza = :plaza")
})
public class Municipio implements Serializable{
    private Integer id;
    private String nombreMunicipio;
    private Plaza idPlaza;
    private EntidadFederativa idEntidadFederativa;
    
    public static final String BUSCAR_POR_PLAZA = "Municipio.buscarPorPlaza" ;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMunicipio")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }

    @ManyToOne
    @JoinColumn(name = "idPlaza")
    public Plaza getIdPlaza() {
        return idPlaza;
    }

    public void setIdPlaza(Plaza idPlaza) {
        this.idPlaza = idPlaza;
    }

    @ManyToOne
    @JoinColumn(name = "idEntidadFederativa")
    public EntidadFederativa getIdEntidadFederativa() {
        return idEntidadFederativa;
    }

    public void setIdEntidadFederativa(EntidadFederativa idEntidadFederativa) {
        this.idEntidadFederativa = idEntidadFederativa;
    }

    @Override
    public String toString() {
        return "Municipio{" + "nombreMunicipio=" + nombreMunicipio + ", idPlaza=" + idPlaza + '}';
    }
    
    
}
