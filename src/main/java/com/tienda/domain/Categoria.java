/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
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
    
    private static final long seriaVersionUID= 1L;
    
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
