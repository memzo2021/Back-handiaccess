package co.simplon.p25.handiaccess.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.p25.handiaccess.entities.Station;

public interface StationRepository extends JpaRepository<Station, Long> {

    // List<Station> findAllProjectedBy(String name);
}
