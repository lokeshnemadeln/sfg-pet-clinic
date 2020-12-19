package lokesh.springframework.springdatajpa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import lokesh.springframework.model.Speciality;
import lokesh.springframework.repository.SpecilityRepository;
import lokesh.springframework.service.SpecialitiesService;

@Service
@Profile("springdatajpa")
public class SpecilitySDJpaService implements SpecialitiesService {

	private final SpecilityRepository specilityRepository;
	public SpecilitySDJpaService(SpecilityRepository specilityRepository) {
		super();
		this.specilityRepository = specilityRepository;
	}

	@Override
	public Speciality save(Speciality object) {
		specilityRepository.save(object);
		return null;
	}

	@Override
	public Speciality findById(Long id) {
		Optional<Speciality> optionalSecility = specilityRepository.findById(id);
		if(optionalSecility.isPresent())
		{
			return optionalSecility.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public Set<Speciality> findAll() {
		Set<Speciality> specilities = new HashSet<>();
		specilityRepository.findAll().forEach(specilities::add);
		return specilities;
	}

	@Override
	public void delete(Speciality Object) {
		specilityRepository.delete(Object);
		
	}

	@Override
	public void deleteById(Long id) {
		specilityRepository.deleteById(id);
	}

}
