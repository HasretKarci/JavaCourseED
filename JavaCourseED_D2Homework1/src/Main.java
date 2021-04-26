
public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor();
		instructor1.id=1;
		instructor1.name="Engin Demiro�";
		instructor1.about="Yaz�l�m geli�tirmeye lisede 'yaz�l�m' b�l�m�nde okurken ba�lad�m. �niversite hayat�ma �SS 2003 T�rkiye derecesiyle ba�lad�m....";
		
		Instructor instructor2 = new Instructor();
		instructor2.id=2;
		instructor2.name="Hasret Karci";
		instructor2.about="�rnek hakk�nda metni.";
		
		Instructor[] instructors = {instructor1,instructor2};
		
		Course course1 = new Course(1,instructor1,"Yaz�l�m geli�tirici yeti�tirme kamp�.","(C# + ANGULAR)");
		Course course2 = new Course(2,instructor2,"Yaz�l�m geli�tirici yeti�tirme kamp�.","(JAVA + REACT)");
		
		Course[] courses = {course1,course2};
		
		System.out.println("Kurslar: ");
		for (Course course : courses) {
			System.out.println(course.name);
			System.out.println("Kurs detay: "+course.detail);
		}
		
		System.out.println("E�itmenler: ");
		for (Instructor instructor : instructors) {
			System.out.println(instructor.name);
			System.out.println("Hakk�nda: "+instructor.about);
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.joinCourse(course2);
		courseManager.courseInfo(course2);

	}

}