
public class Course {
	
	public Course() {
		
	}
	
	public Course(int id, Instructor instructor, String name, String detail) {
		this.id=id;
		this.instuructorId=instructor.id;
		this.name=name;
		this.detail=detail;
	}
	
	int id;
	int instuructorId;
	String name;
	String detail;
	

}
