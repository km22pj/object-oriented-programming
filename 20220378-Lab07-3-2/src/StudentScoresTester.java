import java.util.Scanner;
public class StudentScoresTester {

	public static void main(String[] args) {
		StudentScores studSc = new StudentScores();
		try (Scanner in = new Scanner(System.in)) {
			boolean done = false;
			
			do {
				System.out.println("Enter a student name or -1 to end: ");
				String name = in.nextLine();
				if(name.equals("-1"))
					done = true;
				else {
					System.out.println("Enter the student's score: ");
					int score = in.nextInt();
					in.nextLine();
					studSc.add(name, score);
				}
			} while(!done);
		}
		System.out.println("The Highest Score Student is: " + studSc.getHighest());
		System.out.println("The Lowest Score Student is: " + studSc.getLowest());

	}

}
