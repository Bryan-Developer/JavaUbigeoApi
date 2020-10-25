package com.developer.bryan.ubigeo.api.services;

import com.developer.bryan.ubigeo.api.entities.Distrito;
import com.developer.bryan.ubigeo.api.entities.DistritosProvinciaPK;

import java.util.List;

public interface DistritoService {

    List<Distrito> getDistritosList();
    Distrito getDistrito(DistritosProvinciaPK pk);
}
