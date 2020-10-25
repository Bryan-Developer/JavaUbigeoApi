package com.developer.bryan.ubigeo.api.rests;

import com.developer.bryan.ubigeo.api.entities.Provincia;
import com.developer.bryan.ubigeo.api.entities.ProvinciasDepartamentoPK;
import com.developer.bryan.ubigeo.api.services.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/provincia")
@RestController
public class ProvinciaRestController {

    @Autowired
    private ProvinciaService service;

    @GetMapping
    public List<Provincia> getProvinciasList(){
        return service.getProvinciasList();
    }

    @GetMapping("/{idDepartamento}/{id}")
    public Provincia getProvincia(@PathVariable Integer idDepartamento, @PathVariable Integer id){
        return service.getProvincia(new ProvinciasDepartamentoPK(id, idDepartamento));
    }

}
