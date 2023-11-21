package backend.housekeeper.houseelegantservice.infrastucture.persistence.jpa.repositories;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.KeeperRequest;
import org.springframework.data.jpa.repository.JpaRepository;


public interface KeeperRequestRepository extends JpaRepository<KeeperRequest, Long> {

}
