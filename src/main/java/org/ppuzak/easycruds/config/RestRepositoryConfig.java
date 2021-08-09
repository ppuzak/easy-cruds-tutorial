package org.ppuzak.easycruds.config;

import lombok.RequiredArgsConstructor;
import org.ppuzak.easycruds.projections.EmployeeClosedProjection;
import org.ppuzak.easycruds.projections.EmployeeDefaultMethodProjection;
import org.ppuzak.easycruds.projections.EmployeeOpenProjection;
import org.ppuzak.easycruds.projections.EmployeeSimpleProjection;
import org.springframework.context.annotation.Bean;
import org.springframework.data.projection.SpelAwareProxyProjectionFactory;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import java.util.Arrays;

/**
 * Config for projections.
 *
 * @author PPuzak
 * @since 1.0.0
 */
@Component
@RequiredArgsConstructor
public class RestRepositoryConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(
        RepositoryRestConfiguration config, CorsRegistry corsRegistry
    ) {

        Arrays
            .asList(
                EmployeeClosedProjection.class,
                EmployeeDefaultMethodProjection.class,
                EmployeeOpenProjection.class,
                EmployeeSimpleProjection.class
            )
            .forEach(config.getProjectionConfiguration()::addProjection);

    }

    /**
     * Config to create ProjectionFactory.
     *
     * @return ProjectionFactory
     */
    @Bean
    public SpelAwareProxyProjectionFactory projectionFactory() {
        return new SpelAwareProxyProjectionFactory();
    }
}
