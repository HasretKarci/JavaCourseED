
public class UserManager {
	
	public void showCourse() {
		System.out.println("Kurs g�r�nt�leniyor.");
	}
	
	public void info(User user) {
		System.out.println("ID: " + user.getId());
		System.out.println("Profil Foto�raf�: "+user.getProfilePhoto());
		System.out.println("Ad Soyad: "+user.getName()+user.getLastName());
		System.out.println("Email: "+user.geteMail());
	}
}
