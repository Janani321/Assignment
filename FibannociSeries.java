package week1.day2;

public class FibannociSeries {
	public static void main(String[] args) {
		int n = 8, firstTerm = 0, secondTerm = 1;
	System.out.println("Fibonnaci Series till " + n +" terms:");
	for (int i = 1; i <= n; ++i) {
		System.out.println(firstTerm +", ");
		int nextTerm = firstTerm + secondTerm;
		firstTerm = secondTerm;
		secondTerm = nextTerm;
	}
	}
}
