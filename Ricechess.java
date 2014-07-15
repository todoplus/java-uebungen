/* package ricechess;

public class Ricechess {
	public static void main(String[] args) {
		double rice = 1;
		for (int count = 0; count < 64; count++) {
			rice = rice*2;
		}
		System.out.println(rice);
	}

}
*/

package ricechess;

public class Ricechess {
    public static void main(String[] args) {
         float korn = 1;
         for (int reihe=0; reihe<8; reihe++) {
             for (int spalte=0; spalte<8; spalte++) {
                 korn = korn * 2;
             }
             System.out.println(""+reihe+": "+korn);
         }
    }
}