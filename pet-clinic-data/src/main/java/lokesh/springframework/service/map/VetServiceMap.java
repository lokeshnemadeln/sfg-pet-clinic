package lokesh.springframework.service.map;

import java.util.Set;

import lokesh.springframework.model.Vet;
import lokesh.springframework.service.CrudService;

public class VetServiceMap extends  AbstractMapService<Vet, Long> implements CrudService<Vet, Long>
{

	@Override
	public Vet save(Vet object) {
		super.save(object.getId(), object);
		return null;
	}

	@Override
	public void deleteById(Long id) {
		super.deleteByID(id);
		
	}
	
	@Override
	public Set<Vet> findAll()
	{
		return super.findAll();
	}
	
	@Override
	public Vet	 findById(Long id)
	{
		return super.findById(id);
	}
	
	@Override
	public void delete(Vet object)
	{
		super.delete(object);
	}
}
