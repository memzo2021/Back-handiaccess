package co.simplon.p25.handiaccess.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.p25.handiaccess.dtos.LineIdentity;
import co.simplon.p25.handiaccess.entities.Line;

@Repository
public interface LineRepository extends JpaRepository<Line, Long> {

    List<LineIdentity> findAllProjectedBy();
}
