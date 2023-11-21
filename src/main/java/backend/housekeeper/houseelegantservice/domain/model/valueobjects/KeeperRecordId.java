package backend.housekeeper.houseelegantservice.domain.model.valueobjects;


import jakarta.persistence.Embeddable;

import java.util.UUID;

@Embeddable
public record KeeperRecordId(String KeeperRecordId) {

    public KeeperRecordId(){

        this(UUID.randomUUID().toString());
    }

    public KeeperRecordId{
        if (KeeperRecordId == null || KeeperRecordId.isBlank()){
            throw new IllegalArgumentException("Acme student record profileId " +
                    "cannot be null or blank");
        }
    }



}
