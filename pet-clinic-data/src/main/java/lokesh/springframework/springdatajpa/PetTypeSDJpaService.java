package lokesh.springframework.springdatajpa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import lokesh.springframework.model.PetType;
import lokesh.springframework.repository.PetTypeRepository;
import lokesh.springframework.service.PetTypeService;

@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService {

	private final PetTypeRepository petTypeRepository;
	
	public PetTypeSDJpaService(PetTypeRepository petTypeRepository) {
		super();
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public PetType save(PetType object) {
		petTypeRepository.save(object);
		return null;
	}

	@Override
	public PetType findById(Long id) {
		Optional <PetType> petTypeOptional = petTypeRepository.findById(id);
		if(petTypeOptional.isPresent())
		{
			return petTypeOptional.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public Set<PetType> findAll() {
		Set<PetType> petType = new HashSet<>();
		petTypeRepository.findAll().forEach(petType::add);
		return petType;
	}

	@Override
	public void delete(PetType Object) {
		petTypeRepository.delete(Object);
	}

	@Override
	public void deleteById(Long id) {
		petTypeRepository.deleteById(id);		
	}

}
