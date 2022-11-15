package kodlamaio.programmingLanguage.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name="programmingLanguage")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProgrammingLanguage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="programmingLanguageId")
	private int id;
	
	@Column(name="programmingLanguageName")
	private String name;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "programmingLanguage")
	private List<ProgrammingTechnology> programmingTechnologies;
}
