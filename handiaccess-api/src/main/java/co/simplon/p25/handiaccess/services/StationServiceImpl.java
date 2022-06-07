package co.simplon.p25.handiaccess.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.simplon.p25.handiaccess.dtos.StationAdminView;
import co.simplon.p25.handiaccess.dtos.StationCreate;
import co.simplon.p25.handiaccess.dtos.StationUpdate;
import co.simplon.p25.handiaccess.dtos.StationView;
import co.simplon.p25.handiaccess.entities.Line;
import co.simplon.p25.handiaccess.entities.Station;
import co.simplon.p25.handiaccess.repositories.LineRepository;
import co.simplon.p25.handiaccess.repositories.StationRepository;

@Service
public class StationServiceImpl implements StationService {

    private final StationRepository stations;

    private final LineRepository lines;

//------------------------------------------------------------
    public StationServiceImpl(StationRepository repository, LineRepository lines) {
	this.stations = repository;
	this.lines = lines;

    }

//------------------------------------------------------------
    @Override
    public List<StationView> getStations() {
	return stations.findAllProjectedBy();
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

	Long lineId = inputs.getLineId();
	Line line = lines.findById(lineId).get();
	List<Station> lineStations = line.getStations();
	boolean present = false;
	for (Station lineStation : lineStations) {
	    if (lineStation.getId().equals(id)) {
		present = true;
	    }
	}
	if (!present) {
	    lineStations.add(station);
	    lines.save(line);
	}
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
	Long lineId = inputs.getLineId();
	Line line = lines.findById(lineId).get();
	List<Station> lineStations = line.getStations();
	lineStations.add(station);
	lines.save(line);
    }

    @Override
    @Transactional
    public void deleteStationById(Long id) {
	stations.deleteById(id);
    }

    @Override
    public List<StationAdminView> getAdminStations() {
	return stations.findAllProjectedByOrderByName(StationAdminView.class);
    }

}
