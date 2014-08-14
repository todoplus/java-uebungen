

package ticketautomat;

public class Ticketpreis { 
	private static double mTicketpreis = 0;
	private static double mEingeworfenerBetrag = 0;
	private static double mGesamtSummeAutomat = 0;
	private static double mRueckgeld = 0;
	private static double mAkzeptierteMuenzen[] = { 500, 200, 100, 50, 20, 10 };
	private static double  mMuenze = 0;
	private boolean mUeberpruefeMuenze;
	
	
	public void muenzPruefung(double pEingeworfeneMuenze) {
		mUeberpruefeMuenze = false;
		for (int i=0; i<Muenzbestand.MAX; i++) {
			mMuenze = mAkzeptierteMuenzen[i];
			if (pEingeworfeneMuenze == mMuenze) {
				Muenzbestand.bestandAenderung(i);
				geldEinwerfen(pEingeworfeneMuenze);
				mUeberpruefeMuenze = true;
			}
		}
		
		if (mUeberpruefeMuenze == false) {
			System.out.println("Der eingeworfene Betrag wurde nicht erkannt.");
			System.out.println();
		}
		
	}
	
	// Set Methoden
	public void setTicketpreis(double pTicketpreis) {
		mTicketpreis = pTicketpreis;
	}
	
	// Get Methoden
	public void getTicketpreis() {
		System.out.println("Ticketpreis: " + mTicketpreis/100 + " CHF");	
		System.out.println();
	}
	
	public double getRueckgeld() {
		double pRueckgeld = mRueckgeld;
		return pRueckgeld;
	}
	
	private void getEingeworfenerBetrag() {
		System.out.println("Eingeworfener Betrag: " + mEingeworfenerBetrag/100 + " CHF");
		
	}
	
	private double geldEinwerfen(double pEingeworfenesGeld) {
		mEingeworfenerBetrag = pEingeworfenesGeld;
		mGesamtSummeAutomat += mEingeworfenerBetrag;
		System.out.println("Bezahlt: " + mGesamtSummeAutomat/100 + " CHF");
		getEingeworfenerBetrag();
		System.out.println();
		checkGesamtSumme();
		return mGesamtSummeAutomat;
		
	}
	private static void checkGesamtSumme() {

		
		if (mTicketpreis == mGesamtSummeAutomat) {
			druckeTicket();
		}
		
		else if (mTicketpreis < mGesamtSummeAutomat) {
			mRueckgeld = mGesamtSummeAutomat - mTicketpreis;
			Muenzbestand rueckgeld = new Muenzbestand();
			rueckgeld.berechneRueckgeld(mRueckgeld);
			druckeTicket();
			Rueckgeldausgabe.ausgabeRueckgeld();
			
			
		}
	}
	
	private static void druckeTicket() {
		System.out.println("Ticket wird gedruckt.");
		
	}
	
}
