import java.util.Scanner;

public class StudentGradeCalculator 
{
    public static void main(String[] args) 
	{
        Scanner s1 = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("");

        System.out.println("                                  Student Grade Calculator                         ");
        System.out.println("");
		System.out.println("Enter marks obtained in each subject (out of 100):");
        System.out.print("Enter number of subjects: ");
        int numSubjects = s1.nextInt();
        int[] marks = new int[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = s1.nextInt();
        }

        
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        
        double averagePercentage = (double) totalMarks / numSubjects;

        
        char grade;
        if (averagePercentage >= 90) 
		{
            grade = 'A';
        } 
		else if (averagePercentage >= 80) 
		{
            grade = 'B';
        } 
		else if (averagePercentage >= 70) 
		{
            grade = 'C';
        } 
		else if (averagePercentage >= 60) 
		{
            grade = 'D';
        } 
		else 
		{
            grade = 'F';
        }

        
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        s1.close();
    }
}
