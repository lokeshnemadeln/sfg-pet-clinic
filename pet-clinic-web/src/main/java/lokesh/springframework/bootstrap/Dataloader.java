package lokesh.springframework.bootstrap;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lokesh.springframework.model.Owner;
import lokesh.springframework.model.Pet;
import lokesh.springframework.model.PetType;
import lokesh.springframework.model.Speciality;
import lokesh.springframework.model.Vet;
import lokesh.springframework.service.OwnerService;
import lokesh.springframework.service.PetService;
import lokesh.springframework.service.PetTypeService;
import lokesh.springframework.service.SpecialitiesService;
import lokesh.springframework.service.VetService;

@Component
public class Dataloader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private final SpecialitiesService specialitiesService;
	

	@Autowired
	public Dataloader(OwnerService ownerService, VetService vetService ,PetTypeService petTypeService,SpecialitiesService specialitiesService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.specialitiesService = specialitiesService;
	}
	
	
	@Override
	public void run(String... args) throws Exception {
	
		int count = petTypeService.findAll().size();
		if(count == 0)
		{
			loadData();
		}
	
	}


	private void loadData() {
		PetType dog = new PetType();
		dog.setName("dog");
		
		PetType savedDogPetType = petTypeService.save(dog);
		
		PetType cat = new PetType();
		cat.setName("cat");
		
		PetType savedCatPetType = petTypeService.save(cat);
		
		Speciality radiology = new Speciality();
		radiology.setDescription("radiology");
		
		Speciality savedRadioLogy = specialitiesService.save(radiology);
		
		Speciality surgery = new Speciality();
		surgery.setDescription("surgery");
		
		Speciality savedSurgery = specialitiesService.save(surgery);
		
		Speciality denistry = new Speciality();
		denistry.setDescription("denistry");
		
		Speciality savedDenistry = specialitiesService.save(denistry);
		
		
		Owner owner1 = new Owner();
		owner1.setFisrtName("Lokesh");
		owner1.setLastName("Nemade");
		owner1.setAddress("pune");
		owner1.setCity("pune");
		owner1.setTelephone("123455756");
		
		Pet mikesPet = new Pet();
		mikesPet.setPetType(savedDogPetType);
		mikesPet.setOwner(owner1);
		mikesPet.setBirthdate(LocalDate.now());
		mikesPet.setName("Rosco");
		owner1.getPets().add(mikesPet);
		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setFisrtName("Mukul");
		owner2.setLastName("Z");
		owner2.setAddress("jalgaon");
		owner2.setCity("jalgaon");
		owner2.setTelephone("123456");
		
		Pet fionasCat = new Pet();
		fionasCat.setPetType(savedCatPetType);
		fionasCat.setOwner(owner2);
		fionasCat.setBirthdate(LocalDate.now());
		fionasCat.setName("Billa");
		owner2.getPets().add(fionasCat);
		
		ownerService.save(owner2);
		
		Vet vet1 = new Vet();
		vet1.setFisrtName("axe");
		vet1.setLastName("sam");
		vet1.getSpecility().add(savedRadioLogy);
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFisrtName("Yogesh");
		vet2.setLastName("Gadhe");
		vet2.getSpecility().add(savedDenistry);
		vetService.save(vet2);
		
		System.out.println("Owner data loaded");
		System.out.println("Vet data loaded");
	}

}
