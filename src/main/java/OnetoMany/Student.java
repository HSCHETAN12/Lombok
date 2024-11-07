package OnetoMany;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Student {
	@Id
	private String SName;
	private int age;
}
