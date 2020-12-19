package lokesh.springframework.service.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import lokesh.springframework.model.Owner;
import lokesh.springframework.model.Pet;
import lokesh.springframework.service.OwnerService;
import lokesh.springframework.service.PetService;
import lokesh.springframework.service.PetTypeService;

@Service
@Profile({"default","map"})
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	
	private final PetTypeService petTypeService;
//	private final PetService petService ;
	
	public OwnerServiceMap(PetTypeService petTypeService) {
		super();
		this.petTypeService = petTypeService;
	//	this.petService = petService;
	}
	
	@Override
	public Owner save(Owner object) {

		if(object != null)
		{
			if(object.getPets() != null)
			{
				object.getPets().forEach(pet -> 
				{
					if(pet.getPetType() != null)
					{
						if(pet.getId() == null)
						{
							pet.setPetType(petTypeService.save(pet.getPetType()));
						}
						else
						{
							throw new RuntimeException("Pet type is required");
						}

						if(pet.getId() == null)
						{
//							Pet savedPet = petService.save(pet);
//							pet.setId(savedPet.getId());
						}
					}
				});
			}
			return super.save( object);
		}
		else
		{
			return null;
		}
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
