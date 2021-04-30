
public class Instructor extends User {
	
	private String aboutInstructor;
	
	public Instructor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Instructor(int id, String profilePhoto, String name, String lastName, String eMail, String password, String aboutInstructor) {
		super(id, profilePhoto, name, lastName, eMail, password);
		this.aboutInstructor = aboutInstructor;
	}

	public String getAboutInstructor() {
		return aboutInstructor;
	}

	public void setAboutInstructor(String aboutInstructor) {
		this.aboutInstructor = aboutInstructor;
	}
	
	
	

}
