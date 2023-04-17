/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author Fernando
 */
@Data
@Entity
@Table(name="categoria")
public class Categoria implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoria; 
    private String descripcion;
    private boolean activo;

    public Categoria() {
    }

    public Categoria(Long idCategoria, String descripcion, boolean activo) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.activo = activo;
    }

  
    
    
    
    
}
