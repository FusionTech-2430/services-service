package co.allconnected.fussiontech.servicesservice.repository;

import co.allconnected.fussiontech.servicesservice.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Integer> {
}