package com.developer.bryan.ubigeo.api.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "distritos")
public class Distrito implements Serializable {

    private static final long serialVersionUID = 2923893013384287354L;

    @EmbeddedId
    private DistritosProvinciaPK id;

    @Column(length = 31)
    private String nombre;

    @Column(length = 6)
    private String codigo;

    @ManyToOne
    @JoinColumns(
            {
                    @JoinColumn(name = "id_provincia", insertable = false, updatable = false, referencedColumnName = "id"),
                    @JoinColumn(name = "id_departamento", insertable = false, updatable = false, referencedColumnName = "id_departamento")
            }
    )
    private Provincia provincia;

    public DistritosProvinciaPK getId() {
        return id;
    }

    public void setId(DistritosProvinciaPK id) {
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

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Distrito{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", provincia=" + provincia +
                '}';
    }
}
