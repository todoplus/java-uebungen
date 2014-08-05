package reihenhaus;

public class Haus {
	private int zimmer = 1;
	private int preisProZimmer = 500;
	private int Preis = 0;
	public void setZimmer(int pZimmer) {
		zimmer = pZimmer;
	}
	
	public void berechneWohnungspreis() {
		int pPreis = 0;
		pPreis = zimmer*preisProZimmer;
		Preis = pPreis;	
	}
	
	public void getZimmer() {
		System.out.println("enthaelt " + zimmer + " Zimmer");
	}
	
	public void getWohnungspreis() {
		berechneWohnungspreis();
		System.out.println("Preis: " + Preis + " CHF");
		System.out.println("");
	}

}
