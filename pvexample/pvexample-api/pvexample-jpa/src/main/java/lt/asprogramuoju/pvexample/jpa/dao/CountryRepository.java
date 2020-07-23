package lt.asprogramuoju.pvexample.jpa.dao;

import lt.asprogramuoju.pvexample.jpa.model.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * A simple Spring Data {@link JpaRepository} for storing {@link CountryEntity}s.
 *
 * @author pavel.vrublevskij
 * @version 1.0.0
 */
@Repository
public interface CountryRepository extends JpaRepository<CountryEntity, Short> {
}
