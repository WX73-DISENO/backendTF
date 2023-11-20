package backend.housekeeper.houseelegantservice.infrastucture.persistence.jpa.repositories;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.Keeper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KeeperRepository extends JpaRepository<Keeper, Long> {
    List<Keeper> findAll();
}
