package com.apolo.springdb.controladores;

import com.apolo.springdb.entidades.Empleado;
import com.apolo.springdb.repositorios.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmpleadoController {

    @Autowired //Inyectar dependencias al repositorio de empleados
    EmpleadoRepository empleadoRepository;

    @GetMapping("/formulario")
    public String formulario(Model model){
        model.addAttribute("empleado", new Empleado()); //Se crea un nuevo empleado
        return "formulario";
    }

    @GetMapping("/personal")
    public String personal(Model model){
        List<Empleado> empleados = empleadoRepository.findAll(); //Traer los elementos de empleadoRepository
        model.addAttribute("empleados", empleados);
        return "personal";
    }

    @PostMapping("/formulario")
    public String crear(Empleado empleado){
        empleadoRepository.save(empleado); //Guardar un "empleado"
        return "redirect:/personal";
    }

}
