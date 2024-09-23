package co.allconnected.fussiontech.servicesservice.repository;

import co.allconnected.fussiontech.servicesservice.model.ReportedService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportedServiceRepository extends JpaRepository<ReportedService, Integer> {
}