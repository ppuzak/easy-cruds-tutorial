package org.ppuzak.easycruds.projections;

import org.ppuzak.easycruds.model.Employee;
import org.ppuzak.easycruds.model.Position;
import org.springframework.data.rest.core.config.Projection;

/**
 * Simple projection.
 *
 * @author PPuzak
 * @since 1.0.0
 */

@Projection(name = "simple", types = {Employee.class})
public interface EmployeeSimpleProjection {

    Integer getId();

    String getName();

    String getSurname();

    String getPhoneNumber();

    Position getPosition();
}
