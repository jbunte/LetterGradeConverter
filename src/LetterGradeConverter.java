import java.util.Scanner;

public class LetterGradeConverter {

	public static void main(String[] args) {
		System.out.println("Welcome to the Letter Grade Converter \n");
		Scanner sc = new Scanner(System.in);
		String letterGrade = "";
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y"))
		{
		System.out.print("Enter numerical grade: ");
		int numberGrade = sc.nextInt();
		if (numberGrade > 87)
			letterGrade = "A";
		else if (numberGrade >= 80 && numberGrade <= 87)
			letterGrade = "B";
		else if (numberGrade >= 67 && numberGrade <= 79)
			letterGrade = "C";
		else if (numberGrade >= 60 && numberGrade <= 66)
			letterGrade = "D";
		else
			letterGrade = "F";
		
		System.out.println("Letter grade: " + letterGrade + "\n");

		System.out.print("Continue? (y/n):");
		choice = sc.next();

		System.out.println();
		}

	}

}
