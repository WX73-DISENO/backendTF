package backend.housekeeper.houseelegantservice.infrastucture.persistence.jpa.repositories;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.KeeperRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface KeeperRequestRepository extends JpaRepository<KeeperRequest, Long> {
    Optional<KeeperRequest> findById(Long id);
    List<KeeperRequest> findAll();
    void delete(KeeperRequest keeperRequest);
}