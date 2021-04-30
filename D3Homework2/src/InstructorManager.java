
public class InstructorManager extends UserManager {
	
	public void addCourse(String course) {
		System.out.println(course+" kursu eklendi.");
	}
	
	public void addCoursePart() {
		System.out.println("Ders bölümü eklendi.");
	}
	
	public void setBio(Instructor instructor, String newBio) {
		instructor.setAboutInstructor(newBio);
		System.out.println("Hakkýnda kýsmý güncellendi.");
		System.out.println("Mevcut hal: "+instructor.getAboutInstructor());
	}
}
