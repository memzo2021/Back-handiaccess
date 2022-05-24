package co.simplon.p25.handiaccess.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.p25.handiaccess.entities.Station;

@Repository
public interface StationRepository extends JpaRepository<Station, Long> {

    Optional<Station> findById(Long id);

    <T> List<T> findAllProjectedBy(Class<T> type);

    List<Station> findAllByOrderByName();

}