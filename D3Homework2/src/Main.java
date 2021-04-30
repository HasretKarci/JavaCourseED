
public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor(1,"EnginDemiroðPP","Engin","Demiroð","egitmen@eposta.com","password123","Eðitmen hakkýnda metni.");
		Instructor instructor2 = new Instructor(2,"Eðitmen2PP","Eðitmen2","EðitmenSoyad","egitmen2@eposta.com","password321","Eðitmen hakkýnda metni.");
		
		Student student1 = new Student(1,"Öðrenci1PP","Hasret","Karci","ogrenci@eposta.com","sifre123");
		Student student2 = new Student(2, "Öðrenci2PP", "Mehmet Ali", "Karci","ogrenci2@eposta.com","sifre321");
		
		UserManager userManager = new UserManager();
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		userManager.showCourse();
		userManager.info(instructor1);
		userManager.info(student1);
		
		instructorManager.info(instructor1);
		instructorManager.addCourse("Yazýlým geliþtirme");
		instructorManager.addCoursePart();
		instructorManager.setBio(instructor1, "Yeni, eðitmen hakkýnda metni");
		
		studentManager.completeAndContiniue();
		studentManager.previousLesson();
		
		

	}

}
