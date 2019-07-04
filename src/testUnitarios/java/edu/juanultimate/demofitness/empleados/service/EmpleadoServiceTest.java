package edu.juanultimate.demofitness.empleados.service;

import edu.juanultimate.demofitness.empleados.dao.EmpleadoDao;
import edu.juanultimate.demofitness.empleados.model.Empleado;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class EmpleadoServiceTest {
    @Mock
    private EmpleadoDao dao;
    @InjectMocks
    private EmpleadoService service;
    @Test
    public void debeLlamarADaoParaObtenerEmpleados(){

        List<Empleado> empleados = service.getEmpleados();
        System.out.println(empleados);
        verify(dao).getEmpleados();

    }

}