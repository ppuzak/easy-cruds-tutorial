package org.ppuzak.easycruds.repositories;

import org.ppuzak.easycruds.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for {@link Client}
 *
 * @author PPuzak
 * @since 1.0.0
 */
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
