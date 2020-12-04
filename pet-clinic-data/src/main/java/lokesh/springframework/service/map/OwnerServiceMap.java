package lokesh.springframework.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import lokesh.springframework.model.Owner;
import lokesh.springframework.service.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	@Override
	public Owner save(Owner object) {
		super.save( object);
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

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}
