package pastelmaker.permitManager.user;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import pastelmaker.permitManager.permit.Permit;
import pastelmaker.permitManager.project.Project;

@Entity
@Table(name = "User")
public class User {

    private long id;
	private String firstName;
	private String lastName;
	private Set<Permit> permits;
	private Set<Project> projects;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@OneToMany(mappedBy = "requester", cascade = CascadeType.ALL)
	public Set<Permit> getPermits() {
		return permits;
	}

	public void setPermits(Set<Permit> permits) {
		this.permits = permits;
	}

	@OneToMany(mappedBy = "leader", cascade = CascadeType.ALL)
	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}


}
