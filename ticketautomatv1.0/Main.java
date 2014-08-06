package ticketautomat;

public class Main {

	public static void main(String[] args) {
		Ticketpreis ticket = new Ticketpreis();
		
		ticket.setTicketpreis(500);
		ticket.getTicketpreis();
		ticket.geldEinwerfen(300);
		ticket.geldEinwerfen(100);
		ticket.geldEinwerfen(200);
	}

}
