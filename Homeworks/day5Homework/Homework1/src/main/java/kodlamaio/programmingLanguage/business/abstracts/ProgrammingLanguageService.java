package kodlamaio.programmingLanguage.business.abstracts;

import java.util.List;

import kodlamaio.programmingLanguage.business.requests.CreateProgrammingLanguageRequest;
import kodlamaio.programmingLanguage.business.responses.GetAllProgrammingLanguageResponse;

public interface ProgrammingLanguageService {
	List<GetAllProgrammingLanguageResponse> getAll();
	void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest);
}
