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
public class Plaza implements Serializable{
    private Short id;
    private String nombrePlaza;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPlaza")
    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getNombrePlaza() {
        return nombrePlaza;
    }

    public void setNombrePlaza(String nombrePlaza) {
        this.nombrePlaza = nombrePlaza;
    }

    @Override
    public String toString() {
        return "Plaza{" + "nombrePlaza=" + nombrePlaza + '}';
    }
    
}
