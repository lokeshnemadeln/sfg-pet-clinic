package lokesh.springframework.repository;

import org.springframework.data.repository.CrudRepository;

import lokesh.springframework.model.Visit;

public interface VisitRepository  extends CrudRepository<Visit, Long> {

}
