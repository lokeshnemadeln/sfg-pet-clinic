package lokesh.springframework.repository;

import org.springframework.data.repository.CrudRepository;

import lokesh.springframework.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
