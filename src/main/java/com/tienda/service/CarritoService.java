/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import com.tienda.domain.Carrito;

/**
 *
 * @author Fernando
 */
public interface CarritoService {
    
    public Carrito getCarrito(Carrito carrito);
    
    public Carrito getCarritoCliente(Long idCliente);
    
}
