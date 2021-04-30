
public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor(1,"EnginDemiro�PP","Engin","Demiro�","egitmen@eposta.com","password123","E�itmen hakk�nda metni.");
		Instructor instructor2 = new Instructor(2,"E�itmen2PP","E�itmen2","E�itmenSoyad","egitmen2@eposta.com","password321","E�itmen hakk�nda metni.");
		
		Student student1 = new Student(1,"��renci1PP","Hasret","Karci","ogrenci@eposta.com","sifre123");
		Student student2 = new Student(2, "��renci2PP", "Mehmet Ali", "Karci","ogrenci2@eposta.com","sifre321");
		
		UserManager userManager = new UserManager();
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		userManager.showCourse();
		userManager.info(instructor1);
		userManager.info(student1);
		
		instructorManager.info(instructor1);
		instructorManager.addCourse("Yaz�l�m geli�tirme");
		instructorManager.addCoursePart();
		instructorManager.setBio(instructor1, "Yeni, e�itmen hakk�nda metni");
		
		studentManager.completeAndContiniue();
		studentManager.previousLesson();
		
		

	}

}
