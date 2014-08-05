package array;

public class Quadrat {
	public static void main(String[] args) {
	int quadrat[] = new int[6];
	for (int i=0; i<6; i++) {
		quadrat[i] = i*i;
		}
	for (int i=0; i<6; i++) {
		System.out.println(quadrat[i]);
	}
	}
}
