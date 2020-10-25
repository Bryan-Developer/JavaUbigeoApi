package com.developer.bryan.ubigeo.api.services.impl;

import com.developer.bryan.ubigeo.api.entities.Distrito;
import com.developer.bryan.ubigeo.api.entities.DistritosProvinciaPK;
import com.developer.bryan.ubigeo.api.repositories.DistritoRepository;
import com.developer.bryan.ubigeo.api.services.DistritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DistritoServiceImpl implements DistritoService {

    @Autowired
    private DistritoRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Distrito> getDistritosList() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Distrito getDistrito(DistritosProvinciaPK pk) {
        return repository.findById(pk).orElse(null);
    }
}
