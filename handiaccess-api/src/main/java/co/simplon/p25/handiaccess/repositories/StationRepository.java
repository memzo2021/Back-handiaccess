package co.simplon.p25.handiaccess.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.simplon.p25.handiaccess.dtos.StationView;
import co.simplon.p25.handiaccess.entities.Station;

@Repository
public interface StationRepository extends JpaRepository<Station, Long> {

    Optional<Station> findById(Long id);

    <T> List<T> findAllProjectedBy(Class<T> type);

    List<Station> findAllByOrderByName();

    @Query("select s.id as id, s.lift as lift, s.escalator as escalator, "
	    + "s.name as name, s.callTerminal as callTerminal, l.number as lineNumber, "
	    + "l.landingDoor as lineLandingDoor from Line l join l.stations s")
    List<StationView> findAllProjectedBy();

}