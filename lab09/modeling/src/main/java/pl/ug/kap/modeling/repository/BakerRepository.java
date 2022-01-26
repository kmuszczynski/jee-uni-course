package pl.ug.kap.modeling.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.ug.kap.modeling.domain.Baker;

@Repository
public interface BakerRepository extends CrudRepository<Baker, Long> {
}
