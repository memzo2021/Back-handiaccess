package co.simplon.p25.handiaccess.services;

import co.simplon.p25.handiaccess.dtos.LoginDto;
import co.simplon.p25.handiaccess.security.Jwt;

public interface UserService {

    Jwt signIn(LoginDto inputs);
}
