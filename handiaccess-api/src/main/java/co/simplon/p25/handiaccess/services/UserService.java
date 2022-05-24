package co.simplon.p25.handiaccess.services;

import java.util.List;

import co.simplon.p25.handiaccess.dtos.LoginDto;
import co.simplon.p25.handiaccess.entities.User;
import co.simplon.p25.handiaccess.security.Jwt;

public interface UserService {

    Jwt signIn(LoginDto inputs);

    List<User> getAllTest();
}
