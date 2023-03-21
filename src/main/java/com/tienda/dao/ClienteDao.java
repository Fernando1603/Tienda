package com.tienda.dao;

import com.tienda.domain.Cliente;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Fernando
 */
public interface ClienteDao extends CrudRepository<Cliente, Long>{
    

//Darle "CTRL" y darle click a "CrudRepository"
    List<Cliente> findByApellidos(String apellidos);
    
}
