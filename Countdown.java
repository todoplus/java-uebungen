
public class Countdown {
	static void countDown(int n) {
		if (n>=0) {
			System.out.println(n);
			countDown(--n);
		}
		else {
			System.out.println("finished");
		}
	}
	
	public static void main(String[] args) {
		countDown(24);
	}

}
