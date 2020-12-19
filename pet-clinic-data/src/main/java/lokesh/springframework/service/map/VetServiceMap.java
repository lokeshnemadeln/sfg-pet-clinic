package lokesh.springframework.service.map;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import lokesh.springframework.model.Speciality;
import lokesh.springframework.model.Vet;
import lokesh.springframework.service.PetService;
import lokesh.springframework.service.SpecialitiesService;
import lokesh.springframework.service.VetService;

@Service
@Profile({"default","map"})
public class VetServiceMap extends  AbstractMapService<Vet, Long> implements VetService
{
	private final SpecialitiesService specilitiesService;
	
	public VetServiceMap(SpecialitiesService specilitiesService) {
		super();
		this.specilitiesService = specilitiesService;
	}

	@Override
	public Vet save(Vet object) {
		
		if(object.getSpecility().size() >0)
		{
			object.getSpecility().forEach(specility ->
			{
				if(specility.getId() == null)
				{
					Speciality savedSpeclity = specilitiesService.save(specility);
					specility.setId(savedSpeclity.getId());
				}
			});
		}
		
		super.save(object);
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
