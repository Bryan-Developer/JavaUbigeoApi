package com.developer.bryan.ubigeo.api.services.impl;

import com.developer.bryan.ubigeo.api.entities.Provincia;
import com.developer.bryan.ubigeo.api.entities.ProvinciasDepartamentoPK;
import com.developer.bryan.ubigeo.api.repositories.ProvinciaRepository;
import com.developer.bryan.ubigeo.api.services.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProvinciaServiceImpl implements ProvinciaService {

    @Autowired
    private ProvinciaRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Provincia> getProvinciasList() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Provincia getProvincia(ProvinciasDepartamentoPK pk) {
        return repository.findById(pk).orElse(null);
    }
}
