package com.tienda.dao;

import com.tienda.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Fernando
 */
public interface ClienteDao extends CrudRepository<Cliente, Long>{
    

//Darle "CTRL" y darle click a "CrudRepository"
    
    
}
