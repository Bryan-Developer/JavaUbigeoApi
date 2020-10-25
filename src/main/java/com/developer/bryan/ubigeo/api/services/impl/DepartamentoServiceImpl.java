package com.developer.bryan.ubigeo.api.services.impl;

import com.developer.bryan.ubigeo.api.entities.Departamento;
import com.developer.bryan.ubigeo.api.repositories.DepartamentoRepository;
import com.developer.bryan.ubigeo.api.services.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {

    @Autowired
    private DepartamentoRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Departamento> getDepartamentosList() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Departamento getDepartamento(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
