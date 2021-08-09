package org.ppuzak.easycruds.repositories;

import org.ppuzak.easycruds.model.Position;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JPA-Repository for {@link Position}.
 *
 * @author PPuzak
 * @since 1.0.0
 */
public interface PositionRepository extends JpaRepository<Position, Integer> {
}
