/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service;

import com.tienda.dao.CarritoDetalleDao;
import com.tienda.domain.Articulo;
import com.tienda.domain.CarritoDetalle;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author Fernando
 */







@Service
public class CarritoDetalleServiceImpl implements CarritoDetalleService {

    @Autowired
    CarritoDetalleDao carritoDetalleDao;

    @Override
    public CarritoDetalle getCarritoDetalle(CarritoDetalle carritoDetalle) {
        return carritoDetalleDao.findById(carritoDetalle.getIdCarrito()).orElse(null);
    }
    
    @Override
    public CarritoDetalle getCarritoDetalleArticulo(Long idCarrito, Articulo articulo) {
        return carritoDetalleDao.findByidCarritoAndArticulo(idCarrito, articulo);
    }

    @Override
    public List<CarritoDetalle> getCarritoDetalles(Long idCarrito) {
        return carritoDetalleDao.findByidCarrito(idCarrito);//Cambie findByidCarrito era findByIdCarrito
    }

    @Override
    public void save(CarritoDetalle carritoDetalle) {
        carritoDetalleDao.save(carritoDetalle);
    }

    @Override
    public void delete(CarritoDetalle carritoDetalle) {
        carritoDetalleDao.deleteById(carritoDetalle.getIdDetalle());
    }

    @Override
    public void deleteAll(Long idCarrito) {
        carritoDetalleDao.deleteByIdCarrito(idCarrito);
    }

    
}
