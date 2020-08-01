package app.model.repositories;

import app.model.entities.CursValutar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursValutarRepo extends JpaRepository<CursValutar, Long> {
    @Query(value = "SELECT * FROM CursValutar c")
    List<CursValutar> findAllCurrencies();
}
