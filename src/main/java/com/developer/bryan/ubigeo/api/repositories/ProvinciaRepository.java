package com.developer.bryan.ubigeo.api.repositories;

import com.developer.bryan.ubigeo.api.entities.Provincia;
import com.developer.bryan.ubigeo.api.entities.ProvinciasDepartamentoPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProvinciaRepository extends JpaRepository<Provincia, ProvinciasDepartamentoPK> {
}
