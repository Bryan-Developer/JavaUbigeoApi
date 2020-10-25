package com.developer.bryan.ubigeo.api.rests;

import com.developer.bryan.ubigeo.api.entities.Distrito;
import com.developer.bryan.ubigeo.api.entities.DistritosProvinciaPK;
import com.developer.bryan.ubigeo.api.services.DistritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/distrito")
@RestController
public class DistritoRestController {

    @Autowired
    private DistritoService service;

    @GetMapping
    public List<Distrito> getDistritosList(){
        return service.getDistritosList();
    }

    @GetMapping("/{idDepartamento}/{idProvincia}/{id}")
    public Distrito getDistrito(@PathVariable Integer idDepartamento,@PathVariable Integer idProvincia, @PathVariable Integer id){
        return service.getDistrito(new DistritosProvinciaPK(id, idProvincia, idDepartamento));
    }
}
