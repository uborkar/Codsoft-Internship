package gradeCalculator;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of Subjects: ");
		int numSubjects = sc.nextInt();
		
		int [] marks = new int[numSubjects];
		
		for (int i = 0; i < numSubjects; i++) {
			System.out.println("Enter Marks for Subjects " + (i + 1) + " (Out of 100) "  + ": ");
			marks[i] = sc.nextInt();
		}
		int totalMarks = 0;
		for (int mark : marks) {
			totalMarks += mark;
		}
		double averagePercentage = (double) totalMarks / numSubjects;
		
		String grade;
		if (averagePercentage >= 90) {
			grade = "A+";
		}else if (averagePercentage >=80) {
			grade = " A";
		}else if (averagePercentage >= 70) {
			grade = " B";
		}else if (averagePercentage >= 60) {
			grade = "C";
		}else {
			grade = "F";
		}
		
		System.out.println("Total Marks: " + totalMarks);
		System.out.println("Average Percentage: " + averagePercentage + "%");
		System.out.println("Grade: " + grade);
		
		sc.close();
	}
}
