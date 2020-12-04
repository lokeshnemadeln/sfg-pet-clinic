package lokesh.springframework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lokesh.springframework.service.VetService;

@Controller
public class VetController
{

	private final VetService vetService;
	
	public VetController(VetService vetService) {
		super();
		this.vetService = vetService;
	}

	@RequestMapping("/vet")
	public String getPetList(Model model)
	{
		model.addAttribute("listVet", vetService.findAll());
		return "vet/index";
	}
	
	
}
