package lokesh.springframework.service.map;

import java.util.Set;

import lokesh.springframework.model.Owner;
import lokesh.springframework.service.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

	@Override
	public Owner save(Owner object) {
		super.save(object.getId(), object);
		return null;
	}

	@Override
	public void deleteById(Long id) {
		super.deleteByID(id);
		
	}
	
	@Override
	public Set<Owner> findAll()
	{
		return super.findAll();
	}
	
	@Override
	public Owner findById(Long id)
	{
		return super.findById(id);
	}
	
	@Override
	public void delete(Owner object)
	{
		super.delete(object);
	}

}
