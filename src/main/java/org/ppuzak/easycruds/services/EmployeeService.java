package org.ppuzak.easycruds.services;

import lombok.RequiredArgsConstructor;
import org.ppuzak.easycruds.model.Employee;
import org.ppuzak.easycruds.projections.EmployeeSimpleProjection;
import org.ppuzak.easycruds.repositories.EmployeeRepository;
import org.springframework.data.projection.ProjectionFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author PPuzak
 * @since 1.0.0
 */
@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;


    private final ProjectionFactory projectionFactory;


    public List<?> findByName(String name) {

        return employeeRepository.findAllByName(name)
            .stream()
            .map(obj -> projectionFactory.createProjection(EmployeeSimpleProjection.class, obj))
            .collect(Collectors.toList());

    }


    public List<EmployeeSimpleProjection> findBySurname(String surname) {
        return employeeRepository.findAllBySurname(surname, EmployeeSimpleProjection.class);
    }
}
