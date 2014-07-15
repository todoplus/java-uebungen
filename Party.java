package party;

public class Party {
	 final static int BIERKASTEN = 20;
	 final static int WEINKASTEN = 6;
	public static void main(String[] args) {
		int gaeste = 200;
		int bierflaschen = gaeste*3;
		int weinflaschen = gaeste/3;
		double bierkosten = (bierflaschen/BIERKASTEN)*12.5;
		bierkosten = bierkosten+(bierflaschen%BIERKASTEN)*.8;
		System.out.println(bierkosten);
		double weinkosten = (weinflaschen/WEINKASTEN)*17.5;
		weinkosten = weinkosten+(weinflaschen%WEINKASTEN)*3.2;
		System.out.println(weinkosten);
		System.out.println(bierkosten+weinkosten);
	}

}
