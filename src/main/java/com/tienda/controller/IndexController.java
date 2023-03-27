package com.tienda.controller;

import com.tienda.dao.ArticuloDao;
import com.tienda.domain.Articulo;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.tienda.service.ArticuloService;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Fernando
 */
@Slf4j
@Controller
public class IndexController {
    
    @Autowired
    ArticuloService articuloService;
    
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora utilizando  mvc");
        var articulos =articuloService.getArticulos(true);
//        var articulos = Arrays.asList();
        model.addAttribute("articulos", articulos);

        
        return "index";
    }
    
    
   

        
        
    
      
}
