package co.simplon.p25.handiaccess.services;

import java.util.List;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.simplon.p25.handiaccess.dtos.LoginDto;
import co.simplon.p25.handiaccess.entities.Role;
import co.simplon.p25.handiaccess.entities.User;
import co.simplon.p25.handiaccess.repositories.UserRepository;
import co.simplon.p25.handiaccess.security.Jwt;
import co.simplon.p25.handiaccess.security.JwtProvider;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final PasswordEncoder encoder;
    private final JwtProvider provider;

    public UserServiceImpl(UserRepository repository, PasswordEncoder encoder, JwtProvider provider) {
	this.repository = repository;
	this.encoder = encoder;
	this.provider = provider;
    }

    @Transactional
    @Override

    public Jwt signIn(LoginDto inputs) throws BadCredentialsException {
	String username = inputs.getUsername();
	User user = repository.findByUsernameIgnoreCase(username).orElseThrow(
		() -> new BadCredentialsException(String.format("no user founf whith username '%s'", username)));
	String password = inputs.getPassword();
	if (!encoder.matches(password, user.getPassword())) {
	    throw new BadCredentialsException(String.format("password does not match for username '%s'", username));
	}
	Role role = user.getRole();
	List<String> roles = null;
	if (role != null) {
	    roles = List.of(role.getName());
	}

	return provider.create(String.valueOf(user.getId()), roles);
    }
}
