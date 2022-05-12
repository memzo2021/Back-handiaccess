package co.simplon.p25.handiaccess.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.p25.handiaccess.entities.Line;
import co.simplon.p25.handiaccess.services.LineService;

@RestController
@CrossOrigin("*")
public class LineController {
    private final LineService service;

    public LineController(LineService service) {
	this.service = service;

    }

    @GetMapping("/lines")
    public List<Line> getIdentities() {
	return service.getIdentities();

    }
}