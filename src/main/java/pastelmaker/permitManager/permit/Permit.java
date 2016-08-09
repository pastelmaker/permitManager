package pastelmaker.permitManager.permit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Permit {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String project;
    private String type;


	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
