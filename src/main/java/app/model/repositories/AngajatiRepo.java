package app.model.repositories;

import app.model.entities.Angajati;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AngajatiRepo extends JpaRepository<Angajati, Long> {
}
