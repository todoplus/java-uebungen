
/*public class depot {
		final static double zinssatz = 0.045;
		final static double zahlung = 2000;
		final static int maxjahr = 10;
		final static int depotgebuehr = 100;
		
		public static void main(String[] args) {
			double kapital = 2000;
		for (int jahr =0; jahr<=maxjahr; jahr++) {
			kapital = kapital * (1 + zinssatz) + zahlung - depotgebuehr;
			if (jahr == 0) {
				kapital = kapital - 2000;
			}
			System.out.print(jahr);
			System.out.print(": ");
			System.out.println(kapital);
			}
		}
}
*/

public class depot {
    public static void main(String[] args) {
        double kapital = 2000;
        for (int i=0; i<10; i++) {
            kapital = kapital * 1.045 - 100;
            System.out.println(kapital);
        }
    }
}
