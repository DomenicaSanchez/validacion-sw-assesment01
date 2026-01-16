package com.viraj.sample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;



import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.viraj.sample.entity.Employee;
import com.viraj.sample.repository.EmployeeRepository;
import com.viraj.sample.service.EmployeeServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceImplTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeServiceImpl employeeService;
    private Employee employee;

    @Before
    public void setUp() {
        employee = new Employee();
        employee.setId(1L);
        employee.setName("Domenica");
    }


    // Pruebas Unitarias
    @Test
    public void givenEmployee_whenSaveEmployee_thenReturnEmployee() {
        // Arrange
        when(employeeRepository.save(employee)).thenReturn(employee);

        // Act
        Employee savedEmployee = employeeService.saveEmployee(employee);

        // Assert
        assertEquals(employee, savedEmployee);
    }

    @Test
    public void givenEmployee_whenUpdateEmployee_thenReturnUpdatedEmployee() {
        // Arrange
        when(employeeRepository.save(employee)).thenReturn(employee);

        // Act
        Employee updatedEmployee = employeeService.updateEmployee(employee);

        // Assert
        assertEquals(employee, updatedEmployee);
    }

    @Test
    public void givenEmployeeId_whenDeleteEmployee_thenRepositoryCalled() {
        // Act
        employeeService.deleteEmployee(1L);

        // Assert
        verify(employeeRepository, times(1)).deleteById(1L);
    }



}
