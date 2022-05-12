package co.simplon.p25.handiaccess.services;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.p25.handiaccess.entities.Line;
import co.simplon.p25.handiaccess.repositories.LineRepository;

@Service
public class LigneServiceImpl implements LineService {

    private final LineRepository repository;

    public LigneServiceImpl(LineRepository repository) {
	this.repository = repository;
    }

    @Override
    public List<Line> getIdentities() {
	return repository.findAllProjectedBy();
    }

}
