package com.javaguides.javabackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaguides.javabackend.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
