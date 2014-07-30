/* Wieviele Spruenge braucht der Hund, um den Fuchs einzuholen? */
public class FuchsHund {
	public static void main(String[] args) {
		int posFuchs = 60;
		int posHund = 0;
		
		while (posHund<posFuchs) {
			posFuchs = posFuchs + 9;
			posHund = posHund + 14;
		}
		System.out.print(posHund*3+7);
		System.out.println(" Hundespruenge");
	}

}
