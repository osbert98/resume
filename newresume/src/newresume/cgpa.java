package newresume;

public class cgpa {


	
	double gpa[] = {3.0,3.2,3.5,3.9};
	double sum=0;
	double finalcgpa = 0;
	

	

	public void printGPA() {
		
		
		System.out.println("\nGPA Semester: ");
		System.out.println("\nSem 1: "  +gpa[0]);
		System.out.println("Sem 2: "  +gpa[1]);
		System.out.println("Sem 3: "  +gpa[2]);
		System.out.println("Sem 4: "  +gpa[3]);
		}
	
	public double calculateCGPA() {
		for(int i =0; i <gpa.length; i++) {
			
			//sum+=gpa[i];
			sum= sum+gpa[i];
		}
		
		finalcgpa = sum/gpa.length;
		System.out.println();
		return finalcgpa;
		
	}
	
}