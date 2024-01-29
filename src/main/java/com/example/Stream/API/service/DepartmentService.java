package com.example.Stream.API.service;

import com.example.Stream.API.dto.Employee;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface DepartmentService {

    Employee findMaxSalaryInTheDep(int department);

    Employee findMinSalaryInTheDep(int department);

    Collection<Employee> findAllInfoDep(int department);

    Map<Integer, List<Employee>> getGroupingDep();
}