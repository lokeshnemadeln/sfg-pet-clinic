package lokesh.springframework.service.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import lokesh.springframework.model.Pet;
import lokesh.springframework.service.CrudService;
import lokesh.springframework.service.PetService;

@Service
@Profile({"default","map"})
public class PetServiceMap extends  AbstractMapService<Pet, Long> implements CrudService<Pet, Long> { 
	
	@Override
	public Pet save(Pet object) {
		super.save(object);
		return null;
	}

	@Override
	public void deleteById(Long id) {
		super.deleteByID(id);
		
	}
	
	@Override
	public Set<Pet> findAll()
	{
		return super.findAll();
	}
	
	@Override
	public Pet findById(Long id)
	{
		return super.findById(id);
	}
	
	@Override
	public void delete(Pet object)
	{
		super.delete(object);
	}

}
