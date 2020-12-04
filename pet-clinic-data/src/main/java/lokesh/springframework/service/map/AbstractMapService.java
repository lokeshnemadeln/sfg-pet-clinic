package lokesh.springframework.service.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import lokesh.springframework.model.BaseEntity;

public abstract class AbstractMapService <T extends BaseEntity , ID extends Long> 
{
	protected Map <Long , T> map = new HashMap <>();
	Set <T> findAll()
	{
		return new HashSet<>(map.values());
	}

	T findById(ID id)
	{
		return map.get(id);
	}

	T save(T object)
	{
		if(object != null)
		{
			if(object.getId() == null)
			{
				object.setId(getNextID());
			}
			map.put(object.getId(), object);
		}
		else 
		{
			throw new RuntimeException("Object Cannot be null");
		}
		return object;
	}

	void deleteByID(ID id)
	{
		map.remove(id);
	}

	void delete(final T object)
	{
		map.entrySet().removeIf(entry ->entry.getValue().equals(object));
	}

	private Long getNextID()
	{
		Long nextID = null;
		try
		{
			nextID = Collections.max(map.keySet())+1;
		}
		catch(NoSuchElementException e)
		{
            nextID = 1L;
		}
		return nextID;
	}

}
