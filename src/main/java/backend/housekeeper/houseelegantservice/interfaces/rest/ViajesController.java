package backend.housekeeper.houseelegantservice.interfaces.rest;

import backend.housekeeper.houseelegantservice.domain.model.aggregates.Viaje;
import backend.housekeeper.houseelegantservice.domain.model.command.CreateViajeCommand;
import backend.housekeeper.houseelegantservice.domain.model.command.UpdateViajeCommand;
import backend.housekeeper.houseelegantservice.domain.service.ViajeCommandService;
import backend.housekeeper.houseelegantservice.domain.service.ViajeQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/viajes", produces = MediaType.APPLICATION_JSON_VALUE)
public class ViajesController {

    private final ViajeCommandService viajeCommandService;
    private final ViajeQueryService viajeQueryService;

    public ViajesController(ViajeCommandService viajeCommandService, ViajeQueryService viajeQueryService) {
        this.viajeCommandService = viajeCommandService;
        this.viajeQueryService = viajeQueryService;
    }

    @GetMapping
    public List<Viaje> getAllViajes() {
        return viajeQueryService.getAllViajes();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Viaje createViaje(@RequestBody CreateViajeCommand command) {
        return viajeCommandService.createViaje(command);
    }


}