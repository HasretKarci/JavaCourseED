
public class InstructorManager extends UserManager {
	
	public void addCourse(String course) {
		System.out.println(course+" kursu eklendi.");
	}
	
	public void addCoursePart() {
		System.out.println("Ders b�l�m� eklendi.");
	}
	
	public void setBio(Instructor instructor, String newBio) {
		instructor.setAboutInstructor(newBio);
		System.out.println("Hakk�nda k�sm� g�ncellendi.");
		System.out.println("Mevcut hal: "+instructor.getAboutInstructor());
	}
}
