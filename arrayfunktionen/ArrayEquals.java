package arrayfunktionen;
import java.util.Arrays;

public class ArrayEquals {
	static private int feld1[] = { 4, 3, 7, 1 };
	static private int feld2[] = { 4, 3, 7, 1 };
	
	public static void arrayVergleich() {
		System.out.println(Arrays.equals(feld1, feld2));
	}
	
}
