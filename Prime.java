package week1.day2;
public class Prime {
	public static void main(String[] args) {
		int num = 79;
		boolean flag = false;
		for (int i = 2; i <= num / 2; ++i) {
			if(num % i ==0) {
				flag = true;
				break;
			}
			}
		if(!flag) 
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
		}
	}


