package aflevering;

public class Opgave1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printud();
		
		System.out.println();
		System.out.println("eller");
		System.out.println();

		// eller
		indhold();
		System.out.println("Remember:");
		indhold();
		
		System.out.println();
		System.out.println("eller");
		System.out.println();
		
		String text = "Use  \"\\\\\" to obtain a ’backslash’ character.";
		System.out.println(text);
		System.out.println("Remember:");
		System.out.println(text);
	}

	private static void printud() {
		// TODO Auto-generated method stub
		for(int i=1;i<=2;i++){
			if(i==1){indhold();	
			System.out.println("Remember:");}
			else{indhold();}}
	}

	private static void indhold() {
		// dette er den sætning som skrives ud, der er brugt undvigelsessekvenser for at skrive \ og "
		System.out.println("Use  \"\\\\\" to obtain a ’backslash’ character.");
	}

}
