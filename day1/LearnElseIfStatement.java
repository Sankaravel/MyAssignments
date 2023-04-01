package week1.day1;

public class LearnElseIfStatement {
	public static void main(String[] args) {
		int mark = 59;
		if (mark <=100 && mark >=80) {
			System.out.println("Grade A");
		}
		else if(mark < 80 && mark >=60) {
			System.out.println("Grade B");
		}
		else if (mark <60 && mark >= 35) {
			System.out.println("Grade C");
		}
		else if(mark < 35) {
			System.out.println("Grade F");
		}
	}
}
