package InitJAVA;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Commentaires
		
		//Variables
		int num;
		num = 15;
		
		// Data Types
		int chiffre = 5;
		float monfloat = 4.50f;
		char unSeulCaractere = 'D';
		boolean monBoolean = true; // Peu être true oou false 
		String monText = "Java, le langage";
		
		//Typage avancé Java
		byte  chiffreByte = 127; //Entre -128 jusqu'a 127
		short chiffreShort = -32768; // Entre -32768 jusqu'a 32767 
		long chiffreLong; //Entre -9223372036854775808 et +9223372036854775807 (-263 et 263-1)
		double chiffreDouble = 6.48488787; // Peu prendre jusqu'a 15 décimal
		
		//Operators
		//Type Casting
		//Du plus petit type
		//byte -> short -> char ->
		
		
		//Opérateurs d'assignements
		//=			x = 5
		//+=		x += 3  équivalent x = x + 3
		//-=		x -= 3  équivalent x = x - 3
		//*=		x *= 3 	équivalent x = x * 3
		// /=		x /= 3	équivalent x = x / 3
		// %=		x %= 3	équivalent x = x % 3
		
		//Opérateur de comparaison
		// == Égale
		// === strictement égale
		
		
		// Opérateur logique
		// && 
		// ||
		// ! reverse le résultat
		
		String prenom = "Joseph";
		System.out.println("La taille du prénom est " + prenom.length());
		
		System.out.println(prenom.toUpperCase());
		System.out.println(prenom.toLowerCase());
		
		System.out.println(num);
		
		// Variable Swapping 
		int x = 100,
			y = 200;
		
		System.out.println("Avant swap");
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
		
		
		//Swaping avec trois variables
		int temp = x;
		x = y;
		y = temp;
			
			System.out.println("Aprè swaping");
			System.out.println("X = " + x);
			System.out.println("Y = " + y);
			
			
		//Math
		System.out.println("la plus grande valeur est : " + Math.max(5, 10));
		
		// Opérateurs Ternaires
		
		int time = 20;
		if(time < 18)
		{
			System.out.println("Bonjour");
		}
		else
		{
			System.out.println("Bonne soirée");
		}
		
		//Opérateur Ternaire
		String result = (time < 18) ? "Bonjour" : "Bonne soirée"; // un if else simple
		String results = (time < 15 ? "Bonjour" : time < 18 ? "il est moins de 18h" : "bonsoir il est plus de 18h" );
		System.out.println(results);
		
		int day = 4;
		switch (day)
		{
			case 1:
				System.out.println("Lundi");
				break;
			case 2:
				System.out.println("Mardi");
				break;
			case 3: 
				System.out.println("Mercredi");
				break;
		}
		
		//WHILE
		int i = 0;
		while (i < 5)
		{
			System.out.println(i);
			i++;
		}
		
		//Do while
		int f = 0;
		do {
			System.out.println(f);
			f++;
		}
		while (f < 5);
		
		// FOR LOOP
		for (int d = 0; d < 5; d++)
		{
			System.out.println("==" + d );
		}
		
		//Foreach
		String[] cars = {"Volvo", "BMW", "Renault"};
		for (String element : cars)
		{
			System.out.println(element);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
