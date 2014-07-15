package guitarcalc;

public class Ersteklasse {
	public static void main(String[] args)  {
		float koffer = 50;
		float mwstsatz = 8;
		float mwst;
		mwst = koffer*mwstsatz/100;
		System.out.println(mwst);
		float preis;
		preis = mwst+koffer;
		System.out.println(preis);
	}

}
