package com.developer.bryan.ubigeo.api.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "provincias")
public class Provincia implements Serializable {

    private static final long serialVersionUID = -812552466883304946L;

    @EmbeddedId
    private ProvinciasDepartamentoPK id;

    @Column(length = 25)
    private String nombre;

    @Column(length = 4)
    private String codigo;

    @ManyToOne
    @JoinColumn(name = "id_departamento", insertable = false, updatable = false)
    private Departamento departamento;

    @JsonIgnore
    @OneToMany(mappedBy = "provincia")
    private List<Distrito> distritos;

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public ProvinciasDepartamentoPK getId() {
        return id;
    }

    public void setId(ProvinciasDepartamentoPK id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Provincia{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", departamento=" + departamento +
                '}';
    }
}
