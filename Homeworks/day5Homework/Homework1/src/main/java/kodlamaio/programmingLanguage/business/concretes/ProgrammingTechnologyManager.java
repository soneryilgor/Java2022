package kodlamaio.programmingLanguage.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.programmingLanguage.business.abstracts.ProgrammingTechnologyService;
import kodlamaio.programmingLanguage.business.requests.CreateProgrammingTechnologyRequest;
import kodlamaio.programmingLanguage.business.responses.GetAllProgrammingTechnologyResponse;
import kodlamaio.programmingLanguage.dataAccess.abstracts.ProgrammingTechnologyRepository;
import kodlamaio.programmingLanguage.entities.concretes.ProgrammingTechnology;

@Service
public class ProgrammingTechnologyManager implements ProgrammingTechnologyService{
	private ProgrammingTechnologyRepository programmingTechnologyRepository;
	
	public ProgrammingTechnologyManager(ProgrammingTechnologyRepository programmingTechnologyRepository) {
		this.programmingTechnologyRepository = programmingTechnologyRepository;
	}

	@Override
	public List<GetAllProgrammingTechnologyResponse> getAll() {
		List<ProgrammingTechnology> programmingTechnology = programmingTechnologyRepository.findAll();
		List<GetAllProgrammingTechnologyResponse> getAllProgrammingTechnologyResponse = new ArrayList<GetAllProgrammingTechnologyResponse>();
		
		for (ProgrammingTechnology programmingTechnologies : programmingTechnology) {
			GetAllProgrammingTechnologyResponse responseItem = new GetAllProgrammingTechnologyResponse();
			responseItem.setName(programmingTechnologies.getName());
			responseItem.setId(programmingTechnologies.getId());
			
			getAllProgrammingTechnologyResponse.add(responseItem);
		}
		return getAllProgrammingTechnologyResponse;
	}

	@Override
	public void add(CreateProgrammingTechnologyRequest createProgrammingTechnologyRequest) {
		ProgrammingTechnology programmingTechnology = new ProgrammingTechnology();
		programmingTechnology.setName(createProgrammingTechnologyRequest.getName());
		
		this.programmingTechnologyRepository.save(programmingTechnology);
		
	}


}
