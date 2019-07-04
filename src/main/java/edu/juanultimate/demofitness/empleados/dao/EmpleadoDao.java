package edu.juanultimate.demofitness.empleados.dao;


import edu.juanultimate.demofitness.empleados.model.Empleado;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Component
public class EmpleadoDao {

    public List<Empleado> getEmpleados() {
        log.info("Reading from DB");
        Empleado juan = new Empleado("Juan Gabriel");
        Empleado jorge = new Empleado("Jorge");
        Empleado francisco = new Empleado("Francisco");
        Empleado nico = new Empleado("Nico");
        return Arrays.asList(juan, jorge, francisco, nico);
    }
    
}
