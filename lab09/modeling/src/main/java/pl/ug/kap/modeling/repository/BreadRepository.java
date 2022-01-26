package pl.ug.kap.modeling.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.ug.kap.modeling.domain.Bread;

@Repository
public interface BreadRepository extends CrudRepository<Bread, Long> {
}
