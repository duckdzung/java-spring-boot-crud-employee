package com.javaguides.javabackend.service;

import java.util.List;

import com.javaguides.javabackend.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto employee);

    void deleteEmployee(Long employeeId);
}
