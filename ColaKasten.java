package flaschenpreis;

public class ColaKasten {
	static double kastenPreis(int flaschenAnzahl,
								double flaschenPreis,
								double flaschenPfand,
								double kastenPfand) {
		double preis = 0.0;
		preis = flaschenAnzahl * (flaschenPreis + flaschenPfand)
				+ kastenPfand;
		return preis;
		}
	
	public static void main(String[] args) {
		double colaPreis = 0.0,  bierPreis = 0.0;
		colaPreis = kastenPreis(12, .5, .2, 2.0);
		bierPreis = kastenPreis(20, .4, .2, 2.0);
		System.out.println(colaPreis);
		System.out.println(bierPreis);
	}

}
