package lokesh.springframework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lokesh.springframework.service.OwnerService;

@Controller
public class OwnerController 
{
	private final OwnerService ownerService;
	
	public OwnerController(OwnerService ownerService) {
		super();
		this.ownerService = ownerService;
	}

	@RequestMapping("/ownerList")
	public String listOwner(Model model)
	{
		model.addAttribute("listOwner", ownerService.findAll());
		return "owner/index";
	}

}
