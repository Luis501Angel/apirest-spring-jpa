/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.combi.personasapi.controller;

import com.combi.personasapi.model.Persona;
import com.combi.personasapi.repository.RepositoryPersonas;
import com.combi.personasapi.repository.repositoryProductos;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Luis Angel
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/api")
public class ControllerPersonas {
    
    @Autowired
    private RepositoryPersonas repositoryPersonas;
    
    @Lazy
    @Autowired
    private repositoryProductos repositoryProductos;
    
    @RequestMapping(value = "/personas", method = RequestMethod.GET)
    public List<Persona> obtenerPersonas(){
        List<Persona> lstPersonas = repositoryPersonas.findAll();
        return lstPersonas;
    }
    
    @RequestMapping(value = "/personas/{id}", method = RequestMethod.GET)
    public Persona obtenerPersona(@PathVariable Long id){
        Optional<Persona> persona = repositoryPersonas.findById(id);
        return persona.get();
    }
    
    @RequestMapping(value = "/personas", method = RequestMethod.POST)
    public Boolean guardarPersona(@RequestBody Persona persona){
        try {
            repositoryPersonas.save(persona);
            return true;
        } catch (Exception e){
            return false;
        }
    }
    
    @RequestMapping(value = "/personas", method = RequestMethod.PUT)
    public Boolean actualizarPersona(@RequestBody Persona persona){
        try {
            repositoryPersonas.save(persona);
            return true;
        } catch (Exception e){
            return false;
        }
    }
    
    @RequestMapping(value = "/personas/{id}", method = RequestMethod.DELETE)
    public Boolean eliminarPersona(@PathVariable Long id){
        try {
            repositoryPersonas.deleteById(id);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
