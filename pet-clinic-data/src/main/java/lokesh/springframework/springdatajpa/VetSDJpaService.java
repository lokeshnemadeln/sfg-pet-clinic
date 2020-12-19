package lokesh.springframework.springdatajpa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import lokesh.springframework.model.Vet;
import lokesh.springframework.repository.VetRepository;
import lokesh.springframework.service.VetService;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService 
{

	private final VetRepository vetRepository;
	
	public VetSDJpaService(VetRepository vetRepository) {
		super();
		this.vetRepository = vetRepository;
	}

	@Override
	public Vet save(Vet object) {
		vetRepository.save(object);
		return null;
	}

	@Override
	public Vet findById(Long id) {
    Optional<Vet> optionalVet = vetRepository.findById(id);
		
		if(optionalVet.isPresent())
		{
			return optionalVet.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public Set<Vet> findAll() {
		Set<Vet> vets = new HashSet<>();
		vetRepository.findAll().forEach(vets::add);
		return null;
	}

	@Override
	public void delete(Vet Object) {
		vetRepository.delete(Object);
	}

	@Override
	public void deleteById(Long id) {
		vetRepository.deleteById(id);
		
	}

}
