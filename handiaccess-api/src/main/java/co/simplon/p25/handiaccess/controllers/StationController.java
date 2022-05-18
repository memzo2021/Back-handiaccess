package co.simplon.p25.handiaccess.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.p25.handiaccess.entities.Station;
import co.simplon.p25.handiaccess.services.StationService;

@RestController
@RequestMapping("/stations")
public class StationController {

    private final StationService service;

    public StationController(StationService service) {
	this.service = service;
    }

    @GetMapping("/{id}")
    public Station getById(@PathVariable("id") Long id) {
	return service.getById(id);
    }

}
