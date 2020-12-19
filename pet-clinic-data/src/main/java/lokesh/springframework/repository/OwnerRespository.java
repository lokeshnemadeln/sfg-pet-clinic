package lokesh.springframework.repository;

import org.springframework.data.repository.CrudRepository;

import lokesh.springframework.model.Owner;

public interface OwnerRespository extends CrudRepository<Owner, Long>
{
  Owner findByLastName(String lastName);
}
