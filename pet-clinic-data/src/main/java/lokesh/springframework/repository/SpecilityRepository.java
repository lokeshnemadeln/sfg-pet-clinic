package lokesh.springframework.repository;

import org.springframework.data.repository.CrudRepository;

import lokesh.springframework.model.Speciality;

public interface SpecilityRepository  extends CrudRepository<Speciality, Long> {

}
