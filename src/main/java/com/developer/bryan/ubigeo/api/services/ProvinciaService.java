package com.developer.bryan.ubigeo.api.services;

import com.developer.bryan.ubigeo.api.entities.Provincia;
import com.developer.bryan.ubigeo.api.entities.ProvinciasDepartamentoPK;

import java.util.List;

public interface ProvinciaService {

    List<Provincia> getProvinciasList();
    Provincia getProvincia(ProvinciasDepartamentoPK pk);
}
