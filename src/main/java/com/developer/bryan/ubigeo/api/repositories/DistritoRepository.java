package com.developer.bryan.ubigeo.api.repositories;

import com.developer.bryan.ubigeo.api.entities.Distrito;
import com.developer.bryan.ubigeo.api.entities.DistritosProvinciaPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistritoRepository extends JpaRepository<Distrito, DistritosProvinciaPK> {
}
