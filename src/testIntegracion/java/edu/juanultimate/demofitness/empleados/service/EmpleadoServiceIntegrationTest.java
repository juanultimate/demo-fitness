package edu.juanultimate.demofitness.empleados.service;

import edu.juanultimate.demofitness.empleados.model.Empleado;
import edu.juanultimate.demofitness.empleados.service.EmpleadoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.MatcherAssert.assertThat;
@RunWith(SpringRunner.class)
@SpringBootTest
public class EmpleadoServiceIntegrationTest {

    @Autowired
    private EmpleadoService service;

    @Test
    public void debeLlamarADaoParaObtenerEmpleados(){
        List<Empleado> empleados = service.getEmpleados();
        assertThat(empleados, hasItem(new Empleado("Juan Gabriel")));


    }

}