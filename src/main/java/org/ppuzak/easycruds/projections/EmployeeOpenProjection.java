package org.ppuzak.easycruds.projections;

import org.ppuzak.easycruds.model.Employee;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

/**
 * Open projection.
 *
 * @author PPuzak
 * @since 1.0.0
 */
@Projection(name = "open", types = {Employee.class})
public interface EmployeeOpenProjection {

    Integer getId();

    String getName();

    String getSurname();

    @Value("#{target.getPosition() != null ? target.getPosition().getName() : null}")
    String getPosition();

    @Value("#{target.getPosition() != null ? @employeeRepository.countAllByPosition_Id(target.getPosition().getId()) : null}")
    Long getNumOfEmployeesInTheSamePosition();

}
