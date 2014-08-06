package arrayfunktionen;

import java.util.Arrays;

public class ArraySort {
	public static void arraySortieren() {
		int feld[] = { 4, 3, 7, 1 };
		Arrays.sort(feld);
		for (int zahl : feld) {
			System.out.print(" - ");
			System.out.print(zahl);
		}
		System.out.println("");
	}

}
