package com.viraj.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.viraj.sample.entity.Employee;
import com.viraj.sample.service.EmployeeService;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeIntegrationTest {

    @Autowired
    private EmployeeService employeeService;

    // Pruebas de Integración
    @Test
    public void whenSaveEmployee_thenEmployeeIsPersistedH2() {
        Employee newEmployee = new Employee();
        newEmployee.setEmployeeName("Domenica");
        newEmployee.setEmployeeDescription("Prueba de integracion");

        // Act 
        Employee savedEmployee = employeeService.saveEmployee(newEmployee);

        // Arrange
        assertTrue(savedEmployee.getEmployeeId() > 0);
        assertEquals("Domenica", savedEmployee.getEmployeeName());
    }

}
