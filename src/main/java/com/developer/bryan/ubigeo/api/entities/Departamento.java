package com.developer.bryan.ubigeo.api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "departamentos")
public class Departamento implements Serializable {

    private static final long serialVersionUID = -9204945235758472664L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    @Column(length = 13)
    private String departamento;

    @Column(length = 2)
    private String codigo;

    public Departamento() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "id=" + id +
                ", departamento='" + departamento + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}
