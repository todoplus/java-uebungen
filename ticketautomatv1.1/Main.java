package ticketautomat;

public class Main {

	public static void main(String[] args) {
		Ticketpreis ticket = new Ticketpreis();
		
		ticket.setTicketpreis(500);
		ticket.getTicketpreis();
		ticket.muenzPruefung(300);
		ticket.muenzPruefung(100);
		ticket.muenzPruefung(500);
		
	}

}
