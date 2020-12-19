package lokesh.springframework.springdatajpa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import lokesh.springframework.model.Visit;
import lokesh.springframework.repository.VisitRepository;
import lokesh.springframework.service.VisitService;

@Service
@Profile("Springdatajpa")
public class VisitDataJpaService implements VisitService {

	private final VisitRepository visitrepository;
	
	public VisitDataJpaService(VisitRepository visitrepository) {
		super();
		this.visitrepository = visitrepository;
	}

	@Override
	public Visit save(Visit object) {
		visitrepository.save(object);
		return null;
	}

	@Override
	public Visit findById(Long id) {
		Optional <Visit> visitOptional = visitrepository.findById(id);
		if(visitOptional.isPresent())
		{
			visitOptional.get();
		}
		else
		{
			return null;
		}
		return null;
	}

	@Override
	public Set<Visit> findAll() {
		Set<Visit> visits = new HashSet<>();
	    visitrepository.findAll().forEach(visits::add);
		return visits;
	}

	@Override
	public void delete(Visit Object) {
		visitrepository.delete(Object);
	}

	@Override
	public void deleteById(Long id) {
		visitrepository.deleteById(id);
	}

}
