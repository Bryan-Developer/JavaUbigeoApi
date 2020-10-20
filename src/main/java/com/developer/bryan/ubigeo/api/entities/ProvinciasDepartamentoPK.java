package com.developer.bryan.ubigeo.api.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ProvinciasDepartamentoPK implements Serializable {

    private Integer id;

    @Column(name = "id_departamento")
    private Integer idDepartamento;

    public ProvinciasDepartamentoPK() {

    }

    public ProvinciasDepartamentoPK(Integer id, Integer idDepartamento) {
        this.id = id;
        this.idDepartamento = idDepartamento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    @Override
    public String toString() {
        return "ProvinciasDepartamentoPK{" +
                "id=" + id +
                ", idDepartamento=" + idDepartamento +
                '}';
    }
}
