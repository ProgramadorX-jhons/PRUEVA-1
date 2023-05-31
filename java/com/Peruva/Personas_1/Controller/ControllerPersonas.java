package com.Peruva.Personas_1.Controller;

import ch.qos.logback.core.model.Model;
import com.Peruva.Personas_1.Entity.Personas;
import com.Peruva.Personas_1.Service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//ultima hoja
@Controller
@RequestMapping("/api")
public class ControllerPersonas {
    @Autowired
   private IPersonaService service;

    @GetMapping("/listar")
    public String listar(Model model){
        List<Personas>personas=service.listar();
      //  model.addAttribuete("Personas",personas);
        return "index";
    }
}
