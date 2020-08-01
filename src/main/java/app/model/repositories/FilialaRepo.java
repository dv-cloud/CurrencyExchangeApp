package app.model.repositories;

import app.model.entities.Filiala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilialaRepo extends JpaRepository<Filiala, Long> {
}
