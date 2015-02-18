/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.calfonso.aurum.spring.datos.entidades;

import java.io.Serializable;
import java.util.Objects;
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
public class TipoAsentamiento implements Serializable{
    private Short id;
    private String nombreTipo;

    public TipoAsentamiento(Short id, String nombreTipo) {
        this.id = id;
        this.nombreTipo = nombreTipo;
    }

    public TipoAsentamiento() {
    }
    

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTipoAsentamiento")
    public Short getId() {
        return id;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.nombreTipo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TipoAsentamiento other = (TipoAsentamiento) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.nombreTipo, other.nombreTipo)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return nombreTipo;
    }
    
    
}
