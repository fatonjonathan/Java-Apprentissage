package dateFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class initDateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate currentDate = LocalDate.now(); // Création d'un objet date
		System.out.println("Date actuelle : " + currentDate);
		
		//Exemple 2 : Afficher l'heure actuelle
		LocalTime currentTime = LocalTime.now(); // Création d'un objet de temps
		System.out.println("Heure actuelle : " + currentTime);
		
		//Exemple 3 : Afficher la date et l'heure actuelle
		LocalDateTime currentDateTime = LocalDateTime.now(); // Créez un objet et d'heure
		System.out.println("Date et heure actuelle : " + currentDateTime);
		
		//Exemple 4 : Formater la date et l'heure actuelles
		LocalDateTime formattedDateTime = LocalDateTime.now();
		System.out.println("Avant le formatage : " + formattedDateTime );
		
		//Création d'un objet avec le format souhaiter
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		DateTimeFormatter myFormatObj2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		//Utiliser le formateur pour obtenir la date et l'heure au format spécifié
		String formattedDate = formattedDateTime.format(myFormatObj);
		System.out.println("Après le formatage : " + formattedDate);
		
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Entrer votre date de naissance au format suivant dd/MM/yyyy :");
		String age = userInput.nextLine();
		
		
		
		
	}

}
