package co.simplon.p25.handiaccess.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.p25.handiaccess.dtos.LoginDto;
import co.simplon.p25.handiaccess.entities.User;
import co.simplon.p25.handiaccess.security.Jwt;
import co.simplon.p25.handiaccess.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
	this.service = service;
    }

    @GetMapping
    public List<User> getAllTest() {
	return service.getAllTest();
    }

    @PostMapping("/sign-in")
    public Jwt signIn(@RequestBody LoginDto inputs) {
	return service.signIn(inputs);
    }

}
