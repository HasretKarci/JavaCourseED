
public class CourseManager {
	
	public void joinCourse(Course course) {
		System.out.println(course.name+" kursuna kat�l�m�n�z ger�ekle�ti.");
	}
	
	public void courseInfo(Course course) {
		System.out.println("Kurs bilgileri:");
		System.out.println("Kurs e�itmeni: "+course.instuructorId);
		System.out.println("Kurs ad�: "+course.name);
		System.out.println("Kurs detay: "+course.detail);

	}

}
