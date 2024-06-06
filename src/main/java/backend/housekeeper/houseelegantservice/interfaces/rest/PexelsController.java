package backend.housekeeper.houseelegantservice.interfaces.rest;

import backend.housekeeper.houseelegantservice.application.service.PexelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PexelsController {

    @Autowired
    private PexelsService pexelsService;

    @GetMapping("/api/photos")
    public String getPhotos(@RequestParam String query, @RequestParam int perPage) {
        return pexelsService.searchPhotos(query, perPage);
    }
}
