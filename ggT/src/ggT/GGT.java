package ggT;

public class GGT {
	public static void main(String[] args) {
		int a = 24;
		int b = 36;
		
		while (b>0) {
			if (b>a) {
				int change = a;
				a = b;
				b = change;
			}
		a = a - b;
		}
		System.out.println(a);
	}

}
