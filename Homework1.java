
public class Homework1 {
	public static void main(String[] args) {
		int sec = 45000;
		int min = sec/60;
		int secrest = sec%60;
		System.out.println(sec +" seconds is " + min + " full minutes and " + secrest + " seconds");
		System.out.println("OR");
		int hours = min/60;
		int minrest = min%60;
		System.out.println(sec +" seconds is " + hours + " full hours and " + minrest + " full minutes and " + secrest + " seconds");
		System.out.println("OR");
		int days = hours/24;
		int hoursrest = hours%24;
		System.out.println(sec +" seconds is " + days + " full days and " + hoursrest +
				" full hours and " + minrest + " full minutes and " + secrest + " seconds");
		System.out.println("OR");
		int weeks = days/7;
		int weeksrest = days%7;
		System.out.println(sec +" seconds is " + weeks + " full weeks and " + weeksrest  + " full days and " + hoursrest +
				" full hours and " + minrest + " full minutes and " + secrest + " seconds");
	}
}
