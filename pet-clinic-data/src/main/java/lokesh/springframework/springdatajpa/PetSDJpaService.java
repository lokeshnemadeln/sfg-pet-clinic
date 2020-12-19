package lokesh.springframework.springdatajpa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import lokesh.springframework.model.Pet;
import lokesh.springframework.repository.PetRepository;
import lokesh.springframework.service.PetService;
@Service
@Profile("springdatajpa")
public class PetSDJpaService implements PetService {

	private final PetRepository petRepository;
	public PetSDJpaService(PetRepository petRepository) {
		super();
		this.petRepository = petRepository;
	}

	@Override
	public Pet save(Pet object) {
		petRepository.save(object);
		return null;
	}

	@Override
	public Pet findById(Long id) {
		Optional <Pet>  petOptional = petRepository.findById(id);
		if(petOptional.isPresent())
		{
			return petOptional.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public Set<Pet> findAll() {
    Set<Pet> pets = new HashSet<>();
    petRepository.findAll().forEach(pets::add);
	return pets;
	}

	@Override
	public void delete(Pet Object) {
		petRepository.delete(Object);
	}

	@Override
	public void deleteById(Long id) {
		petRepository.deleteById(id);
	}

}
