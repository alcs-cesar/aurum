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

/**
 *
 * @author cesar
 */
@Entity
public class EntidadFederativa implements Serializable{
    private Short id;
    private String nombreEntidadFederativa;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEntidadFederativa")
    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getNombreEntidadFederativa() {
        return nombreEntidadFederativa;
    }

    public void setNombreEntidadFederativa(String nombreEntidadFederativa) {
        this.nombreEntidadFederativa = nombreEntidadFederativa;
    }

    @Override
    public String toString() {
        return nombreEntidadFederativa;
    }
    
    
}
