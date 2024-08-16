package com.daniel.examenibarcena.negocio;

import com.daniel.examenibarcena.entidades.Tarea;
import com.daniel.examenibarcena.repositorio.TareaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaNegocio {
    @Autowired
    private TareaRepositorio tareaRepositorio;

    public Tarea grabar(Tarea tarea){
        return tareaRepositorio.save(tarea);
    }

    public List<Tarea> obtenerTarea(){
        return (List<Tarea>) tareaRepositorio.findAll();
    }
}
