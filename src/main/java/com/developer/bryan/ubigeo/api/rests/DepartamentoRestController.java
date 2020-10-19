package com.developer.bryan.ubigeo.api.rests;

import com.developer.bryan.ubigeo.api.entities.Departamento;
import com.developer.bryan.ubigeo.api.services.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/departamento")
@RestController
public class DepartamentoRestController {

    @Autowired
    private DepartamentoService service;

    @GetMapping
    public List<Departamento> getDepartamentoList(){
        return service.getDepartamentosList();
    }

    @GetMapping("/{id}")
    public Departamento getDepartamento(@PathVariable Integer id){
        return service.getDepartamento(id);
    }

}
