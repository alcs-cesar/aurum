/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.calfonso.aurum.spring.datos.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author cesar
 */
@Entity
@NamedQueries({
    @NamedQuery(name = Asentamiento.BUSCAR_POR_NOMBRE, 
            query = "SELECT a FROM Asentamiento a WHERE " +
                    "a.nombreAsentamiento LIKE :nombreAsentamiento"),
    @NamedQuery(name = Asentamiento.BUSCAR_POR_CP,
            query = "SELECT a FROM Asentamiento a WHERE " +
                    "a.idCodigoPostal = :codigoPostal")
})
public class Asentamiento implements Serializable{
    private BigDecimal id;
    private TipoAsentamiento idTipoAsentamiento;
    private String nombreAsentamiento;
    private CodigoPostal idCodigoPostal;
    
    public static final String BUSCAR_POR_NOMBRE = "Asentamiento.buscarPorNombre";
    public static final String BUSCAR_POR_CP = "Asentamiento.buscarPorCP";

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAsentamiento")
    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "idTipoAsentamiento")
    public TipoAsentamiento getIdTipoAsentamiento() {
        return idTipoAsentamiento;
    }

    public void setIdTipoAsentamiento(TipoAsentamiento idTipoAsentamiento) {
        this.idTipoAsentamiento = idTipoAsentamiento;
    }

    public String getNombreAsentamiento() {
        return nombreAsentamiento;
    }

    public void setNombreAsentamiento(String nombreAsentamiento) {
        this.nombreAsentamiento = nombreAsentamiento;
    }

    @ManyToOne
    @JoinColumn(name = "idCodigoPostal")
    public CodigoPostal getIdCodigoPostal() {
        return idCodigoPostal;
    }

    public void setIdCodigoPostal(CodigoPostal idCodigoPostal) {
        this.idCodigoPostal = idCodigoPostal;
    }

    @Override
    public String toString() {
        return "Asentamiento{" + "idTipoAsentamiento=" + idTipoAsentamiento + ", nombreAsentamiento=" + nombreAsentamiento + ", idCodigoPostal=" + idCodigoPostal + '}';
    }
    
    
}
