package pl.ug.kap.modeling.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.ug.kap.modeling.domain.Label;

@Repository
public interface LabelRepository extends CrudRepository<Label, Long> {
}
