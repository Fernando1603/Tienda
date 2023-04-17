/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.dao;

import com.tienda.domain.Articulo;
import com.tienda.domain.CarritoDetalle;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Fernando
 */
public interface CarritoDetalleDao extends CrudRepository<CarritoDetalle, Long> {

    List<CarritoDetalle> findByidCarrito(Long idCarrito);

    CarritoDetalle findByidCarritoAndArticulo(Long idCarrito, Articulo articulo);

    void deleteByIdCarrito(Long idCarrito);

}


