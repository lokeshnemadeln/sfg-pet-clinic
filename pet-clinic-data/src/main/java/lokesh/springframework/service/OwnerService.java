package lokesh.springframework.service;

import java.util.Set;

import lokesh.springframework.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	Owner findByLastName(String lastName);

}
