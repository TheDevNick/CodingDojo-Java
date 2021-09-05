
public class Project {
	private String name;
	private String description;
	
	public String elevatorPitch() {
		return this.name + " : " + this.description;
	}
	
	public Project() {
		this.description = "default description";
		this.name = "default name";
	}

	public Project(String projectName) {
		this.name = projectName;
		this.description = "default description";
	}

	public Project(String projectName, String projectDescription) {
		this.name = projectName;
		this.description = projectDescription;
	}
	
	
    // getter
    public String getName() {
        return name;
    }
	
    // setter
    public void setName(String newName) {
    	this.name = newName;
    }
 // getter
    public String getDescription() {
    	return description;
    }
 // setter
    public void setDescription(String newDescription) {
    	this.description = newDescription;
    }
}
