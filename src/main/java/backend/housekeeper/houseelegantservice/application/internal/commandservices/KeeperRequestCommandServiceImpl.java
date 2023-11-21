package backend.housekeeper.houseelegantservice.application.internal.commandservices;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.KeeperRequest;
import backend.housekeeper.houseelegantservice.domain.model.command.CreateKeeperRequestCommand;
import backend.housekeeper.houseelegantservice.domain.service.KeeperRequestCommandService;
import backend.housekeeper.houseelegantservice.domain.service.ViajeCommandService;
import backend.housekeeper.houseelegantservice.infrastucture.persistence.jpa.repositories.KeeperRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KeeperRequestCommandServiceImpl  implements KeeperRequestCommandService {
    private final KeeperRequestRepository keeperRequestRepository;

    @Autowired
    public KeeperRequestCommandServiceImpl(KeeperRequestRepository keeperRequestRepository) {
        this.keeperRequestRepository = keeperRequestRepository;
    }

    @Override
    public KeeperRequest createKeeperRequest(CreateKeeperRequestCommand command) {
        KeeperRequest keeperRequest = new KeeperRequest(command.name(), command.message(), command.photoUrl(), command.rating());
        return keeperRequestRepository.save(keeperRequest);
    }

    @Override
    public void deleteKeeperRequest(Long requestId) {
        KeeperRequest existingRequest = keeperRequestRepository.findById(requestId)
                .orElseThrow(() -> new KeeperRequestNotFoundException("KeeperRequest not found"));

        keeperRequestRepository.delete(existingRequest);
    }
}