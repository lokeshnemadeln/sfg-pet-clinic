package lokesh.springframework.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lokesh.springframework.model.Owner;
import lokesh.springframework.model.PetType;
import lokesh.springframework.model.Vet;
import lokesh.springframework.service.OwnerService;
import lokesh.springframework.service.PetTypeService;
import lokesh.springframework.service.VetService;

@Component
public class Dataloader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	
	@Autowired
	public Dataloader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}
	
	
	@Override
	public void run(String... args) throws Exception {
	
		PetType dog = new PetType();
		dog.setName("dog");
		
		PetType savedDogPetType = petTypeService.save(dog);
		
		PetType cat = new PetType();
		cat.setName("cat");
		
		PetType savedCatPetType = petTypeService.save(cat);
		
		Owner owner1 = new Owner();
		owner1.setFisrtName("Lokesh");
		owner1.setLastName("Nemade");
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setFisrtName("Mukul");
		owner2.setLastName("Z");
		ownerService.save(owner2);
		
		Vet vet1 = new Vet();
		vet1.setFisrtName("axe");
		vet1.setLastName("sam");
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFisrtName("Yogesh");
		vet2.setLastName("Gadhe");
		vetService.save(vet2);
		
		System.out.println("Owner data loaded");
		System.out.println("Vet data loaded");
	}

}
