package com.tienda.controller;

import com.tienda.dao.ClienteDao;
import com.tienda.domain.Cliente;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Fernando
 */
@Slf4j
@Controller
public class IndexController {
    
    @Autowired
    ClienteDao clienteDao;
    
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora utilizando  mvc");
//        String mensaje="Estamos en semana 4, saludos!";
//        model.addAttribute("MensajeSaludo", mensaje);
//        
//        Cliente cliente =new Cliente("jona","brenes", "jonabrenes@gmail.com", "55555");
//        Cliente cliente2 =new Cliente("fran","montero", "franmontero@gmail.com", "4444");
//        Cliente cliente3 =new Cliente("juan","montero", "franmontero@gmail.com", "4444");
//        
//        //model.addAttribute("cliente", cliente);
//        
//        List<Cliente> clientes= Arrays.asList(cliente, cliente2, cliente3);
//        model.addAttribute("clientes", clientes);
        var clientes =clienteDao.findAll();
        model.addAttribute("clientes", clientes);

        
        return "index";
    }
    
}
