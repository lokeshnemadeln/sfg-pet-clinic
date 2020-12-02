package lokesh.springframework.service;

import java.util.Set;

public interface CrudService <T,ID>
{
	public T save(T object);
	public T findById(ID id);
	public Set <T> findAll();
	void delete(T Object);
	void deleteById(ID id);

}
