package lokesh.springframework.model;

import java.util.Set;

public class Vet extends Person {

	private Set <Speciality> specility;

	public Set<Speciality> getSpecility() {
		return specility;
	}

	public void setSpecility(Set<Speciality> specility) {
		this.specility = specility;
	}
	
}
