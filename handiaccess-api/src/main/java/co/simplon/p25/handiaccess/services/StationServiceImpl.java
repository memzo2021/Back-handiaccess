package co.simplon.p25.handiaccess.services;

import org.springframework.stereotype.Service;

import co.simplon.p25.handiaccess.entities.Station;
import co.simplon.p25.handiaccess.repositories.StationRepository;

@Service
public class StationServiceImpl implements StationService {

    private final StationRepository repository;

    public StationServiceImpl(StationRepository repository) {
	this.repository = repository;
    }

    @Override
    public Station getById(Long id) {
	return repository.findById(id).get();

    }

}
