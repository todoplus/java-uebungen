package arrayfunktionen;
import java.util.Arrays;

public class ArrayFill {
	public static void arrayFuellen() {
	int feld[] = new int[5];
	Arrays.fill(feld, 7);
	for (int zahl : feld) {
		System.out.print(" - ");
		System.out.print(zahl);
	}
	System.out.println("");
	}

}
