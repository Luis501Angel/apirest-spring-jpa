/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.combi.personasapi.repository;

import com.combi.personasapi.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Luis Angel
 */
public interface repositoryProductos extends JpaRepository<Producto, Long> {
    
}
