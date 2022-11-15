package kodlamaio.programmingLanguage.webApi.concretes;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.programmingLanguage.business.abstracts.ProgrammingTechnologyService;
import kodlamaio.programmingLanguage.business.requests.CreateProgrammingTechnologyRequest;
import kodlamaio.programmingLanguage.business.responses.GetAllProgrammingTechnologyResponse;

@RestController
@RequestMapping("/api/programmingtechnologies")
public class ProgrammingTechnologiesController {
	private ProgrammingTechnologyService programmingTechnologyService;
	
	public ProgrammingTechnologiesController(ProgrammingTechnologyService programmingTechnologyService) {
		this.programmingTechnologyService = programmingTechnologyService;
	}

	@GetMapping("/getall")
	public List<GetAllProgrammingTechnologyResponse> getAll(){
		return programmingTechnologyService.getAll();
	}
	
	@PostMapping("/add")
	public void add(CreateProgrammingTechnologyRequest createProgrammingTechnologyRequest) {
		this.programmingTechnologyService.add(createProgrammingTechnologyRequest);
	}
	
}
