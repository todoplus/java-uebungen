package arrayfunktionen;
import java.util.Arrays;

public class ArraySearch {
	public static void arrayDurchsuchen() {
		int feld[] = { 1, 3, 4, 7 };
		int pos = Arrays.binarySearch(feld, 4);
		System.out.println(pos);
	}

}
