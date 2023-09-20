package Random;

import java.util.Random;

public class initRandom {
	public static void main(String[] args) {
			
		Random random = new Random();
		
		//Generer un nombre aléatoire 0 - 100
		double randomNumber = random.nextDouble();
		System.out.println("le nombre décimal aléatoire est : " + randomNumber);
		
		//Random init
		int entierRandom = random.nextInt(10);
		System.out.println("le nombre entier aléatoire est : " + entierRandom);
	
	}
}
