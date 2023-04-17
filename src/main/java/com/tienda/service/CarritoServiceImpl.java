/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service;

import com.tienda.dao.CarritoDao;
import com.tienda.domain.Carrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Fernando
 */
@Service
public class CarritoServiceImpl implements CarritoService{
    
    @Autowired
    CarritoDao carritoDao;
    
    @Override
    public Carrito getCarrito(Carrito carrito){
        return carritoDao.findById(carrito.getIdCarrito()).orElse(null);
    }
    @Override
    public Carrito getCarritoCliente(Long idCliente){
        Carrito carritoCliente = carritoDao.findByIdCliente(idCliente). orElse(null);
    if (carritoCliente==null){
        Carrito carritoNuevo= new Carrito (idCliente);
        carritoCliente = carritoDao.save(carritoNuevo);
    }
        return carritoCliente;
    }
}