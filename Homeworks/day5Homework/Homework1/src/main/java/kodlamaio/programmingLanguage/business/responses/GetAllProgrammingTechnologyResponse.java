package kodlamaio.programmingLanguage.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllProgrammingTechnologyResponse {
	private int id;
	private String name;
}
