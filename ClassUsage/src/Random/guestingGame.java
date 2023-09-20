package Random;

import java.util.Random;
import java.util.Scanner;

public class guestingGame {

	public static void main(String[] args) {
		// Demander le nombre de l'utilisatet
		Scanner userInput = new Scanner(System.in);// une fois Scanner ecris je n'ai plus besoin de le répéter une autre fois pour l'utiliser, juste appeler la variable
		Random randomNumber = new Random();
		System.out.println("Entrer votre nombre");
		int userInputNumber = userInput.nextInt();
		//Random init
		int entierRandom = randomNumber.nextInt(10);
		//Je crée une variable qui 
		

		int resultat = userInputNumber - entierRandom;
		while(resultat != 0)
		{
			System.out.println("Désoler vous avez perdu, Réessayer");
			System.out.println("Le nombre aléatoire était :" + entierRandom);
			userInput = new Scanner(System.in);
			userInputNumber = userInput.nextInt();
			
			if(resultat == 0)
			{
				System.out.println("Super vous avez trouvé *_*");
			}
		}
		
		userInput.close();
		
		
	}

}
