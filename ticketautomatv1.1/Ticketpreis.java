package ticketautomat;

public class Ticketpreis {
	private double mTicketpreis = 0;
	private double mEingeworfenerBetrag = 0;
	private double mGesamtSummeAutomat = 0;
	private double mRueckgeld = 0;
	private double mAkzeptierteMuenzen[] = { 500, 200, 100, 50, 20, 10 };
	private final int MAX = 6;
	private double  mMuenze = 0;
	private boolean mUeberpruefeMuenze;
	
	public void muenzPruefung(double pEingeworfeneMuenze) {
		mUeberpruefeMuenze = false;
		for (int i=0; i<MAX; i++) {
			mMuenze = mAkzeptierteMuenzen[i];
			if (pEingeworfeneMuenze == mMuenze) {
				geldEinwerfen(pEingeworfeneMuenze);
				mUeberpruefeMuenze = true;
			}
		}
		if (mUeberpruefeMuenze == false) {
			System.out.println("Der eingeworfene Betrag wurde nicht erkannt.");
		}
		
	}
	
	public void setTicketpreis(double pTicketpreis) {
		mTicketpreis = pTicketpreis;
	}
	
	public void getTicketpreis() {
		System.out.println("Ticketpreis: " + mTicketpreis/100 + " CHF");	
	}
	public void getEingeworfenerBetrag() {
		System.out.println("Eingeworfener Betrag: " + mEingeworfenerBetrag/100 + " CHF");
		
	}
	public double geldEinwerfen(double pEingeworfenesGeld) {
		mEingeworfenerBetrag = pEingeworfenesGeld;
		mGesamtSummeAutomat += mEingeworfenerBetrag;
		System.out.println("Bezahlt:" + mGesamtSummeAutomat/100 + " CHF");
		getEingeworfenerBetrag();
		checkGesamtSumme();
		return mGesamtSummeAutomat;
		
	}
	public void checkGesamtSumme() {
		if (mTicketpreis == mGesamtSummeAutomat) {
			druckeTicket();
		}
		else if (mTicketpreis < mGesamtSummeAutomat) {
			mRueckgeld = mGesamtSummeAutomat - mTicketpreis;
			System.out.println("Rueckgeld: " + mRueckgeld/100 + " CHF");
			druckeTicket();
		}
	}
	public void druckeTicket() {
		System.out.println("Ticket wird gedruckt.");
		
	}
	
}
