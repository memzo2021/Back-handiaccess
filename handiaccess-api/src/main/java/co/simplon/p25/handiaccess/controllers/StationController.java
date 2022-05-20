package co.simplon.p25.handiaccess.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.p25.handiaccess.dtos.StationCreate;
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

    @GetMapping("/names")
    public List<Station> getStations() {

	return service.getStations();

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createStation(@RequestBody StationCreate station) {
	service.createStation(station);
    }

}