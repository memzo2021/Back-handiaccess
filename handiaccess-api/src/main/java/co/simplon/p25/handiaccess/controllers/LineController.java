package co.simplon.p25.handiaccess.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.p25.handiaccess.dtos.LineIdentity;
import co.simplon.p25.handiaccess.services.LineService;

@RestController
@RequestMapping("/lines")
public class LineController {
    private final LineService service;

    public LineController(LineService service) {
	this.service = service;

    }

    @GetMapping // ("/numbers")
    public List<LineIdentity> getIdentities() {
	return service.getIdentities();

    }

}