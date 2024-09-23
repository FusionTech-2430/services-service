package co.allconnected.fussiontech.servicesservice.repository;

import co.allconnected.fussiontech.servicesservice.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating, Integer> {
}