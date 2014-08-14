package ticketautomat;

public class Muenzbestand {
	
	protected static int mBestand[] = { 10, 10, 10, 10, 10, 10 };
	protected static int mAkzeptierteMuenzen[] = { 500, 200, 100, 50, 20, 10 };
	protected static int mRueckGeldAusgabe[] = { 0, 0, 0, 0, 0, 0 };
	private static int mHelpRueckgeld;
	private static double mRueckgeld;
	private static int mHelpBestand;
	public static final int MAX = 6;
	
	public static void bestandAenderung(int Position) {
		mBestand[Position]++;
		

	}
	public void berechneRueckgeld(double pRueckgeld) {
		mRueckgeld = pRueckgeld;

		for (int i=0; i<MAX; i++) {
			mHelpBestand = mBestand[i];
	
			
			if (mHelpBestand > 0) {
				mHelpRueckgeld = mAkzeptierteMuenzen[i];
				
				while (mRueckgeld >= mHelpRueckgeld) {
					if (mHelpBestand > 0) {
						mRueckgeld = mRueckgeld - mHelpRueckgeld;
						mRueckGeldAusgabe[i]++;
						mBestand[i]--;
						mHelpBestand = mBestand[i];
					}
					else {
						break;
					}
				}
			}
			else { i++;
			}
		
		}
		//for (int y=0; y<MAX; y++) {
			//System.out.println(mRueckGeldAusgabe[y] + " rueckgeldbestand");
			//System.out.println(mBestand[y]+ " lagerbestand");
			//}
		
		
	}
	
		
}
	
	


