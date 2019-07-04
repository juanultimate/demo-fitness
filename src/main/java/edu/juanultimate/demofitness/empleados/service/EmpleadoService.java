package edu.juanultimate.demofitness.empleados.service;

import edu.juanultimate.demofitness.empleados.dao.EmpleadoDao;
import edu.juanultimate.demofitness.empleados.model.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoDao dao;

    public List<Empleado> getEmpleados(){
        return dao.getEmpleados();
    }

}
