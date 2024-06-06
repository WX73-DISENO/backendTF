package backend.housekeeper.houseelegantservice.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PexelsService {

    @Value("${pexels.api.key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    public String searchPhotos(String query, int perPage) {
        String url = "https://api.pexels.com/v1/search?query=" + query + "&per_page=" + perPage;

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", apiKey);

        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        return response.getBody();
    }
}
