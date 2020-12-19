package lokesh.springframework.repository;

import org.springframework.data.repository.CrudRepository;

import lokesh.springframework.model.Vet;

public interface VetRepository  extends CrudRepository<Vet, Long> {

}
