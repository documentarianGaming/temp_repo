package edu.upc.gateway.eldercare.repositories;

import edu.upc.gateway.eldercare.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
