package week1.day1;

public class Fibbinocci {
	public static void main(String[] args) {
		int firstnumber=0;
		int secondnumber=1;
		int sum=0;
		for(int i=1;i<=11;i=i+1) {
			System.out.println(firstnumber+" ");
			sum=firstnumber+secondnumber;
			firstnumber = secondnumber;
			secondnumber = sum;
		}

	}
}
