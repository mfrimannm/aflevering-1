package aflevering;

public class Opgave3 {
	
	public static final int LINES = 3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		program();
	}

	private static void program() {
		// TODO Auto-generated method stub
		for(int k=0;k<=LINES;k++){
			System.out.println("F�rst skrives der ud med " + k + " linjer, derefter stiger k med �n og man k�rer programmet igen");  //egen kode
			for (int i = 1; i <= k ; i++) {
				for (int j = 1; j <= k; j++) {
					System.out.print("+-");
			}
				System.out.println("+"); // rykket
}
			System.out.println(); //egen kode
			
}
}
}
