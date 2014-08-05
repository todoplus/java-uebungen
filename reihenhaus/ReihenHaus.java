package reihenhaus;

public class ReihenHaus {
	public static void main(String[] args) {
		int MAX = 10;
		boolean hausUngerade;
		hausUngerade = true;
		Haus haus[] = new Haus[MAX];
		for (int i=0; i<MAX; i++) {
			haus[i] = new Haus();
			if (hausUngerade == true) {
				haus[i].setZimmer(4);
				hausUngerade = false;
			}
			else {
				haus[i].setZimmer(5);
				hausUngerade = true;
			}
			
		}
		for (int i=0; i<MAX; i++) {
			System.out.print("Haus " + i + ": ");
			haus[i].getZimmer();
			haus[i].getWohnungspreis();
		}
	}

}
