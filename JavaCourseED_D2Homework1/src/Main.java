
public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor();
		instructor1.id=1;
		instructor1.name="Engin Demiroð";
		instructor1.about="Yazýlým geliþtirmeye lisede 'yazýlým' bölümünde okurken baþladým. Üniversite hayatýma ÖSS 2003 Türkiye derecesiyle baþladým....";
		
		Instructor instructor2 = new Instructor();
		instructor2.id=2;
		instructor2.name="Hasret Karci";
		instructor2.about="Örnek hakkýnda metni.";
		
		Instructor[] instructors = {instructor1,instructor2};
		
		Course course1 = new Course(1,instructor1,"Yazýlým geliþtirici yetiþtirme kampý.","(C# + ANGULAR)");
		Course course2 = new Course(2,instructor2,"Yazýlým geliþtirici yetiþtirme kampý.","(JAVA + REACT)");
		
		Course[] courses = {course1,course2};
		
		System.out.println("Kurslar: ");
		for (Course course : courses) {
			System.out.println(course.name);
			System.out.println("Kurs detay: "+course.detail);
		}
		
		System.out.println("Eðitmenler: ");
		for (Instructor instructor : instructors) {
			System.out.println(instructor.name);
			System.out.println("Hakkýnda: "+instructor.about);
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.joinCourse(course2);
		courseManager.courseInfo(course2);

	}

}