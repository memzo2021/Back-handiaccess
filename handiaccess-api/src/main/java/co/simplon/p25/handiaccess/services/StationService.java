package co.simplon.p25.handiaccess.services;

import java.util.List;

import co.simplon.p25.handiaccess.dtos.StationCreate;
import co.simplon.p25.handiaccess.dtos.StationUpdate;
import co.simplon.p25.handiaccess.entities.Station;

public interface StationService {

    List<Station> getStations();

    Station getById(Long id);

    void updateStationById(Long id, StationUpdate station);

    List<StationUpdate> getStationUpdate();

    void deleteStationById(Long id);

    void createStation(StationCreate station);
}
