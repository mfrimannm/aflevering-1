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
			System.out.println("Først skrives der ud med " + k + " linjer, derefter stiger k med én og man kører programmet igen");  //egen kode
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
