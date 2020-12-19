package lokesh.springframework.service.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import lokesh.springframework.model.Speciality;
import lokesh.springframework.service.SpecialitiesService;

@Service 
@Profile({"default","map"})
public class SpecialityMapService extends AbstractMapService<Speciality , Long> implements SpecialitiesService
{
	
	@Override
	public Speciality save(Speciality object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}

	@Override
	public Speciality findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public void delete(Speciality Object) {
		// TODO Auto-generated method stub
		super.delete(Object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteByID(id);
		
	}
	@Override
	public Set<Speciality> findAll()
	{
		return super.findAll();
	}
}
