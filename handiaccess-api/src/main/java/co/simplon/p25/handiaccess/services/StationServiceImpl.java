package co.simplon.p25.handiaccess.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.simplon.p25.handiaccess.dtos.StationCreate;
import co.simplon.p25.handiaccess.dtos.StationUpdate;
import co.simplon.p25.handiaccess.entities.Station;
import co.simplon.p25.handiaccess.repositories.StationRepository;

@Service
public class StationServiceImpl implements StationService {

    private final StationRepository stations;

//------------------------------------------------------------
    public StationServiceImpl(StationRepository repository) {
	this.stations = repository;

    }

//------------------------------------------------------------
    @Override
    public List<Station> getStations() {
	return stations.findAllByOrderByName();
    }

    @Override
    public Station getById(Long id) {
	return stations.findById(id).get();

    }

    @Override
    @Transactional
    public void updateStationById(Long id, StationUpdate inputs) {
	Station station = stations.findById(id).get();
	station.setCallTerminal(inputs.isCallTerminal());
	station.setEscalator(inputs.isEscalator());
	station.setLift(inputs.isLift());
	station.setName(inputs.getName());
	stations.save(station);

    }

    @Override
    public List<StationUpdate> getStationUpdate() {
	return stations.findAllProjectedBy(StationUpdate.class);
    }

    public Station updateStationById(Long id) {
	return stations.findById(id).get();
    }

    @Override
    @Transactional
    public void createStation(StationCreate inputs) {
	Station station = new Station();
	station.setCallTerminal(inputs.isCallTerminal());
	station.setEscalator(inputs.isEscalator());
	station.setLift(inputs.isLift());
	station.setName(inputs.getName());
	stations.save(station);

    }

    @Override
    @Transactional
    public void deleteStationById(Long id) {
	stations.deleteById(id);
    }

}
