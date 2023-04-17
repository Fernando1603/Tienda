/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.domain;

import static com.fasterxml.jackson.databind.util.ClassUtil.name;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Data;

/**
 *
 * @author Fernando
 */
@Data
@Entity
@Table(name = "articulo")

public class Articulo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_articulo")
    private Long idArticulo; // Transforma en id_cliente
    private Long idCategoria;
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    private boolean activo;
    private String rutaImagen;

    public Articulo() {
    }

    public Articulo(Long idCategoria, String descripcion, String detalle, double precio, int existencias, boolean activo, String rutaImagen) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencias = existencias;
        this.activo = activo;
        this.rutaImagen = rutaImagen;
    }

}
