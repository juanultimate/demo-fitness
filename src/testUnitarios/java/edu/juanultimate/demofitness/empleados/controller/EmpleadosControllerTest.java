package edu.juanultimate.demofitness.empleados.controller;

import edu.juanultimate.demofitness.empleados.model.Empleado;
import edu.juanultimate.demofitness.empleados.service.EmpleadoService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


@SpringBootTest
public class EmpleadosControllerTest {

    @Mock
    private EmpleadoService service;

    @InjectMocks
    private EmpleadosController controller;

    @Test
    public void debeLlamarAServiceParaObtenerEmpleados(){
        List<Empleado> empleados = controller.employeeList();

        verify(service,times(1)).getEmpleados();
    }

}