package lokesh.springframework.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import lokesh.springframework.model.PetType;
import lokesh.springframework.service.PetTypeService;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService{

	@Override
	public PetType save(PetType object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}

	@Override
	public PetType findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public void delete(PetType Object) {
		// TODO Auto-generated method stub
		super.delete(Object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteByID(id);
		
	}
	@Override
	public Set<PetType> findAll()
	{
		return super.findAll();
	}

}
