package Scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {	
			Scanner userInputName = new Scanner(System.in);
			System.out.println("Enter username");
			
			String userName = userInputName.nextLine(); //Lire l'input de l'utilisateur si c'est une chaine de caractère
			System.out.println("Username is : " + userName);
			
			//int Input
			Scanner userInputAge = new Scanner(System.in);
			System.out.println("Enter your age");
			
			//cast into int
			int age = userInputAge.nextInt(); //Lire l'input de l'utilisateur si c'est un entier de caractère
			//Affichage
			System.out.println("Votre age : " + age );
			
			userInputName.close();
			userInputAge.close();	
		}
		catch(Exception e)
		{
			System.out.println();
		}
		
	}

}
