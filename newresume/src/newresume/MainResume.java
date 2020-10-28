package newresume;



public class MainResume {

	public static void main(String[] args) {
		
		nameage obj1 = new nameage();
		birthday b = new birthday();
		workskills w = new workskills();
		workexperiences e = new workexperiences();
		subjectresult a = new subjectresult();
		cgpa q = new cgpa();
		
		System.out.println("Name: "+obj1.name);
		System.out.println("Age: " +obj1.age);
		System.out.println("Birthday : "+b.birthday);
		System.out.println("\nWorkskills: "+w.workskills);
		System.out.println("\nWork Experiences: "+e.workexperiences);
		System.out.println("Subject STIA113: "+a.STIA113 );
		q.printGPA();
		System.out.println("Final CGPA= "+q.calculateCGPA());
		
	}

}
