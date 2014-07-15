package notengebung;

public class notengebung {
	public static void main(String[] args) {
		double prozent = 44;
		int note = 0;
		
		if (prozent < 30) {
			note = 1;
		}
		else if (prozent < 50) {
			note = 2;
		}
		else if (prozent < 67) {
			note = 3;
		}
		else if (prozent < 81) {
			note = 4;
		}
		else if (prozent < 92) {
			note = 5;
		}
		else if ((prozent >= 92) && (prozent <= 100)) {
			note = 6;
		}
		else {
			note = 0;
		}
		if (note == 0) {
			System.out.println("input out of range");
		}
		else {
		System.out.println(note);
		}
		
		
		}
	}
