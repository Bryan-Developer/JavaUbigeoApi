package com.developer.bryan.ubigeo.api.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class DistritosProvinciaPK implements Serializable {

    private Integer id;

    @Column(name = "id_provincia")
    private Integer idProvincia;

    @Column(name = "id_departamento")
    private Integer idDepartamento;

    public DistritosProvinciaPK() {

    }

    public DistritosProvinciaPK(Integer id, Integer idProvincia, Integer idDepartamento) {
        this.id = id;
        this.idProvincia = idProvincia;
        this.idDepartamento = idDepartamento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(Integer idProvincia) {
        this.idProvincia = idProvincia;
    }

    public Integer getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    @Override
    public String toString() {
        return "DistritosProvinciaPK{" +
                "id=" + id +
                ", idProvincia=" + idProvincia +
                ", idDepartamento=" + idDepartamento +
                '}';
    }
}
