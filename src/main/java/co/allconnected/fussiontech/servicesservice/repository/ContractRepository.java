package co.allconnected.fussiontech.servicesservice.repository;

import co.allconnected.fussiontech.servicesservice.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ContractRepository extends JpaRepository<Contract, UUID> {
}