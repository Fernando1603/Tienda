/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import com.tienda.domain.Articulo;
import com.tienda.domain.Carrito;
import com.tienda.domain.CarritoDetalle;
import java.util.List;

/**
 *
 * @author Fernando
 */
public interface CarritoDetalleService {

    public CarritoDetalle getCarritoDetalle(CarritoDetalle carritoDetalle);
    
    public CarritoDetalle getCarritoDetalleArticulo (Long idCarrito, Articulo articulo );

    public List<CarritoDetalle> getCarritoDetalles(Long idCarrito);
    
    public void save (CarritoDetalle carritoDetalle);
    
    public void delete (CarritoDetalle carritoDetalle);
    
    public void deleteAll (Long idCarrito);

}
