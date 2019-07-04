package edu.juanultimate.demofitness.empleados.dao;

import edu.juanultimate.demofitness.empleados.model.Empleado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.MatcherAssert.assertThat;


@SpringBootTest
public class EmpleadoDaoTest {

    @Autowired
    private EmpleadoDao dao;

    @Test
    public void debeRetornarUnArreglodeNombres(){
        assertThat(dao.getEmpleados(),hasItem(new Empleado("Juan Gabriel")));

    }

}

