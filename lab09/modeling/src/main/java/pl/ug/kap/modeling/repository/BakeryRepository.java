package pl.ug.kap.modeling.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.ug.kap.modeling.domain.Bakery;

@Repository
public interface BakeryRepository extends CrudRepository<Bakery, Long> {
}
