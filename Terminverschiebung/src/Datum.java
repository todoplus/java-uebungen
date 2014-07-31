
public class Datum {
	int tag, monat, jahr;
	public void verschiebe() {
		monat = monat + 14;
		while (monat>12) {
			monat = monat - 12;
			jahr++;
		}
	}

}
