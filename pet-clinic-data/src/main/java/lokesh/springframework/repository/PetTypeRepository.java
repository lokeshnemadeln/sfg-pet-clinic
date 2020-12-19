package lokesh.springframework.repository;

import org.springframework.data.repository.CrudRepository;

import lokesh.springframework.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
