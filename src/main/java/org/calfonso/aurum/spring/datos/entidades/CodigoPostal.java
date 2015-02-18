/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.calfonso.aurum.spring.datos.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

/**
 *
 * @author cesar
 */
@Entity
@NamedQueries({
    @NamedQuery(name = CodigoPostal.BUSCAR_POR_NUMERO, 
            query = "SELECT c FROM CodigoPostal c WHERE c.numeroCodigo " +
                    "LIKE :numeroCodigo")
})
public class CodigoPostal implements Serializable{
    private Integer id;
    private String numeroCodigo;
    private Municipio idMunicipio;
    private List<Asentamiento> asentamientos;
    
    public static final String BUSCAR_POR_NUMERO = "CodigoPostal.buscarPorNumero";

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCodigoPostal")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroCodigo() {
        return numeroCodigo;
    }

    public void setNumeroCodigo(String numeroCodigo) {
        this.numeroCodigo = numeroCodigo;
    }
    
    @ManyToOne
    @JoinColumn(name = "idMunicipio")
    public Municipio getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Municipio idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    @OneToMany(mappedBy = "idCodigoPostal", fetch = FetchType.LAZY)
    public List<Asentamiento> getAsentamientos() {
        return asentamientos;
    }

    public void setAsentamientos(List<Asentamiento> asentamientos) {
        this.asentamientos = asentamientos;
    }

    @Override
    public String toString() {
        return numeroCodigo;
    }
    
    
}
