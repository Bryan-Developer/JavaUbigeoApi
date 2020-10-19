package com.developer.bryan.ubigeo.api.services;

import com.developer.bryan.ubigeo.api.entities.Departamento;

import java.util.List;

public interface DepartamentoService {

    List<Departamento> getDepartamentosList();
    Departamento getDepartamento(Integer id);
}
