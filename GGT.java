
public class GGT {
	static int zahlen(int a, int b) {
		while (b>0) {
			if (b>a) {
				int change = a;
				a = b;
				b = change;
			}
		a = a - b;
	}
		return a;

	}
	
	public static void main(String[] args) {
		System.out.println(zahlen(28, 16));
	}
	
}
