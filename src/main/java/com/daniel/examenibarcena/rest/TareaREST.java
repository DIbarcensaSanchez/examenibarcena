package com.daniel.examenibarcena.rest;

import com.daniel.examenibarcena.entidades.Tarea;
import com.daniel.examenibarcena.negocio.TareaNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TareaREST {
    @Autowired
    private TareaNegocio tareaNegocio;

    @PostMapping("/tarea")
    public Tarea grabar(@RequestBody Tarea tarea) {
        return tareaNegocio.grabar(tarea);
    }

    @GetMapping("/tareas")
    public List<Tarea> obtenerTareas() {
        try{
            return tareaNegocio.obtenerTarea();
        }
        catch(Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"No es posible obtener los datos");
        }
    }
}
