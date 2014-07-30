
public class KartoffelTest {
	static void kocheSalzkartoffeln(int personen) {
		int salz = personen * 5;
		int kartoffeln = personen * 2;
		System.out.print(salz);
		System.out.print("g Salz und ");
		System.out.print(kartoffeln);
		System.out.println(" Kartoffeln");
	}
	
	public static void main(String[] args) {
		System.out.println("Salzkartoffeln:");
		int personen = 5;
		kocheSalzkartoffeln(personen);
	}

}
