package ticketautomat;

public class Ticketpreis {
	private double mTicketpreis = 0;
	private double mEingeworfenerBetrag = 0;
	private double mGesamtSummeAutomat = 0;
	private double mRueckgeld = 0;
	
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
