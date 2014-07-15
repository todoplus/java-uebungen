package countdeer;

public class Countdeer {
		public static void main(String[] args) {
	        int gaense=0, huehner=0, katzen=0, kuehe=0, fuesse=0;
	        while (fuesse<252) {
	            gaense++;
	            katzen = gaense*2;
	            kuehe = katzen*2;
	            huehner = kuehe*2;
	            fuesse = gaense*2+huehner*2+katzen*4+kuehe*4;
	            System.out.println(fuesse);
	        }
	        System.out.println(fuesse);
	        System.out.println(gaense);
	        System.out.println(katzen);
	        System.out.println(kuehe);
	        System.out.println(huehner);

		}	
}
