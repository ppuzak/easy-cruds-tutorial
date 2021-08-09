package org.ppuzak.easycruds.projections;

import org.ppuzak.easycruds.model.Employee;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

/**
 * Closed projection.
 *
 * @author PPuzak
 * @since 1.0.0
 */
@Projection(name = "closed", types = {Employee.class})
public interface EmployeeClosedProjection {

    Integer getId();

    String getName();

    String getSurname();

    String getPhoneNumber();

    @Value("#{target.getPosition() != null ? target.getPosition().getName() : null}")
    String getPosition();
}
