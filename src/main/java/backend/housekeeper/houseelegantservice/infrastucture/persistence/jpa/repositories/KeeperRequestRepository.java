package backend.housekeeper.houseelegantservice.infrastucture.persistence.jpa.repositories;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.KeeperRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KeeperRequestRepository extends JpaRepository<KeeperRequest, Long> {
    List<KeeperRequest> findAll();
}
