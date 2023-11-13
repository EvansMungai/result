import java.util.Scanner;
import java.text.DecimalFormat;

public class results {

	public static void main(String[] args) {
		String name = "Mungai Evans Muchiri", uN1 = "Database", uN2 = "Systems", uN3 = "Algorithm", uN4 = "Statistics";
		int sem = 2;
		Scanner in = new Scanner(System.in);
		String rollNo = "C026-01-0908/2022";
		System.out.println("Enter unit code 1:");
		String uCode = in.nextLine();
		System.out.println("Enter unit code 2:");
		String uCode1 = in.nextLine();
		System.out.println("Enter unit code 3:");
		String uCode2 = in.nextLine();
		System.out.println("Enter unit code 4:");
		String uCode3 = in.nextLine();
		System.out.println("Enter score1:");
		int score1 = in.nextInt();
		System.out.println("Enter score2:");
		int score2 = in.nextInt();
		System.out.println("Enter score3:");
		int score3 = in.nextInt();
		System.out.println("Enter score4:");
		int score4 = in.nextInt();
		double total = score1 + score2 + score3 + score4;
		in.close();

		double average = total / 4;
		String grade = "0";
		DecimalFormat df = new DecimalFormat("0.00");
		if (average >= 70 && average <= 100) {
			grade = "A";
		} else if (average >= 60 && average < 70) {
			grade = "B";
		} else if (average >= 50 && average < 60) {
			grade = "C";
		} else if (average >= 40 && average < 50) {
			grade = "D";
		} else if (average < 40) {
			grade = "F";
		} else {
			System.out.println("ERROR");
		}
		System.out.println("                        Department of Computer Science                 ");
		System.out.println("                             End Semester Results                     ");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");
		System.out.println("|Name:-" + name + "\t\t|Roll_No:" + rollNo + "\t Semester:" + sem);
		System.out.println(
				"_______________________________________________________________________________________________________");
		System.out.println("|Unit Code                             \t|Unit Name:               \t Score           ");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");
		System.out.println("|" + uCode + "\t\t \t\t| " + uN1 + "\t\t\t|" + score1);
		System.out.println("|" + uCode1 + "\t \t\t\t| " + uN2 + "\t\t\t|" + score2);
		System.out.println("|" + uCode2 + "\t \t\t\t| " + uN3 + "\t\t\t|" + score3);
		System.out.println("|" + uCode3 + "\t\t \t\t| " + uN4 + "\t\t\t|" + score4);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");
		System.out.println("|Total                                                                  |" + total);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");
		System.out.println(
				"|Average                                                                |" + df.format(average));
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");
		System.out.println("|Grade                                                                  |" + grade);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");
		System.out.println("                                                          Recommendation|              ");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");
		System.out
				.println("Grading Criteria                      Overall Grade(A-D)                  Recommend Pass   ");
		System.out.println(
				"70-100          A                                                                               ");
		System.out.println(
				"60-70           B                                                                               ");
		System.out.println(
				"50-60           C                                                                               ");
		System.out.println(
				"40-50           D                                                                               ");
		System.out.println(
				"Below 40        F                                                                               ");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");
	}
}