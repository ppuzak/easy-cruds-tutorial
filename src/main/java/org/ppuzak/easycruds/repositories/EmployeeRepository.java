package org.ppuzak.easycruds.repositories;

import org.ppuzak.easycruds.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * JPA-Repository for {@link Employee}.
 *
 * @author PPuzak
 * @since 1.0.0
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Long countAllByPosition_Id(Integer positionId);

    <T> List<T> findAllBySurname(String surname, Class<T> type);

    List<Employee> findAllByName(String name);
}
