package javabasic;

public class SwitchCaseExample {
	
	public static void main(String[] args) {
		grading('A');
		grading('D');
		grading('C');
		grading('A');
		grading('B');
		grading('S');
		grading('E');
		
	}
	
	public static void grading(char grade) {
		int success;
		switch(grade) {
		
		case 'A':
			System.out.println("Excellent grade");
			success = 1;
			break;
		case 'B':
			System.out.println("Very good grade");
			success = 1;
			break;
		case 'C':
			System.out.println("Good grade");
			success = 1;
			break;
		case 'D':
		case 'E':
		case 'F':
			System.out.println("Low grade");
			success = 0;
			break;
		default:
			System.out.println("Unknown grade");
			success = -1;
			break;
		}
		passTheCourse(success);
	}
	
	public static void passTheCourse(int success) {
		switch(success) {
		case -1:
			System.out.println("No result!");
			break;
		case 0:
			System.out.println("No pass the course!");
			break;
		case 1:
			System.out.println("Pass the course, congratulation!");
			break;
		default:
			System.out.println("Unknown result!");
			break;
		}
	}
}
