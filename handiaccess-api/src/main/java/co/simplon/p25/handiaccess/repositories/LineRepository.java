package co.simplon.p25.handiaccess.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.p25.handiaccess.entities.Line;

public interface LineRepository extends JpaRepository<Line, Long> {

    List<Line> findAllProjectedBy();

    List<Line> findAllProjectedBy(int number);

}
