package lokesh.springframework.springdatajpa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import lokesh.springframework.model.Owner;
import lokesh.springframework.repository.OwnerRespository;
import lokesh.springframework.repository.PetRepository;
import lokesh.springframework.repository.PetTypeRepository;
import lokesh.springframework.service.OwnerService;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

	private final OwnerRespository ownerRepository;
	private final PetRepository petRepository;
	private PetTypeRepository petTypeRepository;

	public OwnerSDJpaService(OwnerRespository ownerRepository, PetRepository petRepository,
			PetTypeRepository petTypeRepository) {
		super();
		this.ownerRepository = ownerRepository;
		this.petRepository = petRepository;
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public Owner save(Owner object) {
		ownerRepository.save(object);
		return null;
	}

	@Override
	public Owner findById(Long id) {
		Optional<Owner> optionalOwner = ownerRepository.findById(id);
		
		if(optionalOwner.isPresent())
		{
			return optionalOwner.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public Set<Owner> findAll() {
		Set<Owner> owner = new HashSet<>(); 
		ownerRepository.findAll().forEach(owner::add);
		return owner;
	}

	@Override
	public void delete(Owner Object) {
		ownerRepository.delete(Object);

	}

	@Override
	public void deleteById(Long id) {
		ownerRepository.deleteById(id);

	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return ownerRepository.findByLastName(lastName);
	}

}
