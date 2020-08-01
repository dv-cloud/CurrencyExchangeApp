package app.model.repositories;

import app.model.entities.Numerar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NumerarRepo extends JpaRepository<Numerar, Long> {
}
