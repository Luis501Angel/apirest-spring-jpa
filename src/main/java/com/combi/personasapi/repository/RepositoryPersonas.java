/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.combi.personasapi.repository;

import com.combi.personasapi.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Luis Angel
 */
@Repository
public interface RepositoryPersonas extends JpaRepository<Persona, Long> {
    
}
