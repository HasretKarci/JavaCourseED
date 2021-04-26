
public class CourseManager {
	
	public void joinCourse(Course course) {
		System.out.println(course.name+" kursuna katýlýmýnýz gerçekleþti.");
	}
	
	public void courseInfo(Course course) {
		System.out.println("Kurs bilgileri:");
		System.out.println("Kurs eðitmeni: "+course.instuructorId);
		System.out.println("Kurs adý: "+course.name);
		System.out.println("Kurs detay: "+course.detail);

	}

}
