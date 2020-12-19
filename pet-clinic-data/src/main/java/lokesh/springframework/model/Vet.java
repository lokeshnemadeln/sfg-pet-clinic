package lokesh.springframework.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="vets")
public class Vet extends Person {

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="vet_specilities"
	,joinColumns = @JoinColumn (name="vet_id")
	, inverseJoinColumns = @JoinColumn(name="specility_id"))
	private Set <Speciality> specility = new HashSet<>();

	public Set<Speciality> getSpecility() {
		return specility;
	}

	public void setSpecility(Set<Speciality> specility) {
		this.specility = specility;
	}
	
}
