package backend.housekeeper.houseelegantservice.domain.model.valueobjects;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.KeeperRequest;
import jakarta.persistence.Embeddable;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;



@Embeddable
public class KepperItem{


    private List<KeeperRequest> keeperRequests;


    public KepperItem(){this.keeperRequests=new ArrayList<>();}


    public void addKeeperRequest(String name,String message,String photoUrl){

        KeeperRequest KeeperRequest=new KeeperRequest(name,message,photoUrl);
        keeperRequests.add(KeeperRequest);

    }

    public void updateKeeperRequest(int id, String name, String message, String photoUrl) {
        if (id >= 0 && id < keeperRequests.size()) {
            KeeperRequest keeperRequest = new KeeperRequest(name, message, photoUrl);
            keeperRequests.set(id, keeperRequest);
        } else {
            throw new IndexOutOfBoundsException("Index " + id + " is out of bounds for keeperRequests");
        }
    }


}
