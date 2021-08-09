package org.ppuzak.easycruds.projections;

import org.ppuzak.easycruds.model.Employee;
import org.springframework.data.rest.core.config.Projection;

/**
 * Projection with default method.
 *
 * @author PPuzak
 * @since 1.0.0
 */
@Projection(name = "defaultMethod", types = {Employee.class})
public interface EmployeeDefaultMethodProjection {

    Integer getId();

    String getName();

    String getSurname();

    default String getFullName() {
        return getName().concat(" ").concat(getSurname());
    }

    String getPhoneNumber();

}
