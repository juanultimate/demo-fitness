package edu.juanultimate.demofitness.empleados.controller;

import edu.juanultimate.demofitness.empleados.model.Empleado;
import edu.juanultimate.demofitness.empleados.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpleadosController {

    @Autowired
    private EmpleadoService service;

    @GetMapping("/empleados")
    public List<Empleado> employeeList(){
        return service.getEmpleados();
    }
}
