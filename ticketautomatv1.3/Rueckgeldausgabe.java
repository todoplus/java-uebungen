package ticketautomat;


public class Rueckgeldausgabe extends Muenzbestand {
	
	private static double mHelpRueckgeldausgabe;
	private static double mHelpAkzeptierteMuenzen;
	
	public static void ausgabeRueckgeld() {
		for (int i=0; i<MAX; i++) {
			mHelpRueckgeldausgabe = mRueckGeldAusgabe[i];
			if (mHelpRueckgeldausgabe > 0) {
				mHelpAkzeptierteMuenzen = mAkzeptierteMuenzen[i];
				System.out.print("Rueckgeld: ");
				System.out.println(mHelpRueckgeldausgabe + " x "
						+ mHelpAkzeptierteMuenzen/100 +" CHF");
			}
			
		}
	}

}
