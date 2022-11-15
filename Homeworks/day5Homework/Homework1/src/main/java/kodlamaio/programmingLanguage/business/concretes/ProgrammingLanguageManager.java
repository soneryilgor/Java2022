package kodlamaio.programmingLanguage.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.programmingLanguage.business.abstracts.ProgrammingLanguageService;
import kodlamaio.programmingLanguage.business.requests.CreateProgrammingLanguageRequest;
import kodlamaio.programmingLanguage.business.responses.GetAllProgrammingLanguageResponse;
import kodlamaio.programmingLanguage.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlamaio.programmingLanguage.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
	private ProgrammingLanguageRepository programmingLanguageRepository;

	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<GetAllProgrammingLanguageResponse> getAll() {
		List<ProgrammingLanguage> programmingLanguage = programmingLanguageRepository.findAll();
		List<GetAllProgrammingLanguageResponse> getAllProgrammingLanguageResponse = new ArrayList<GetAllProgrammingLanguageResponse>();
		
		for (ProgrammingLanguage programmingLanguages : programmingLanguage) {
			GetAllProgrammingLanguageResponse responsItem = new GetAllProgrammingLanguageResponse();
			responsItem.setName(programmingLanguages.getName());
			responsItem.setId(programmingLanguages.getId());
			
			getAllProgrammingLanguageResponse.add(responsItem);
		}
		return getAllProgrammingLanguageResponse;
	}

	@Override
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		programmingLanguage.setName(createProgrammingLanguageRequest.getName());
		
		this.programmingLanguageRepository.save(programmingLanguage);
	}


}
