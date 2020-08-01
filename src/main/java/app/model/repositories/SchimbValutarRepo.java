package app.model.repositories;

import app.model.entities.SchimbValutar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchimbValutarRepo extends JpaRepository<SchimbValutar, Long> {
}
