package kodlamaio.programmingLanguage.business.abstracts;

import java.util.List;

import kodlamaio.programmingLanguage.business.requests.CreateProgrammingTechnologyRequest;
import kodlamaio.programmingLanguage.business.responses.GetAllProgrammingTechnologyResponse;

public interface ProgrammingTechnologyService {
	List<GetAllProgrammingTechnologyResponse> getAll();
	void add(CreateProgrammingTechnologyRequest createProgrammingTechnologyRequest);
}
