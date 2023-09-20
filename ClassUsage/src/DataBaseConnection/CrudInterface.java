package DataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CrudInterface {
	
	public static void main(String[] args) {
		
        try {
            
        	Scanner userChoiceInput = new Scanner(System.in);
            int userChoice;
            System.out.println("Choisissez l'oppération à effectuer");
        	System.out.println("1: Insertion, 2: Liste des étudiants, 3: Mise à jour, 4: Supprimer");
        	userChoice = userChoiceInput.nextInt();// Pour récupérer l'entrée de l'utilisateur si c'est des nombres
      	
        	
        	while(userChoice <= 0 || userChoice > 5 ) {
        		System.out.println("Mauvais choix, Réessayer !");
        		userChoice = userChoiceInput.nextInt();// Pour récupérer l'entrée de l'utilisateur si c'est des nombres
        	}
        	
        	if(userChoice == 1)
            {
            	// Insertion d'un enregistrement
                
                Scanner userLastNameInput = new Scanner(System.in);
                System.out.println("Entrer le nom :");
                String userLastName = userLastNameInput.nextLine();
                
                
                Scanner userFirstNameInput = new Scanner(System.in);
                System.out.println("Entrer le prénom :");
                String userFirstName = userFirstNameInput.nextLine();
                
                
                Scanner userBirthInput = new Scanner(System.in);
                System.out.println("Entrer l'année de naissance yyyy/mm/jj :");
                String userBirth = userBirthInput.nextLine();
                
                Scanner userEmailInput = new Scanner(System.in);
                System.out.println("Entrer le mail :");
                String userEmail = userEmailInput.nextLine();
                
                String matricule = "E015649";
                userEmailInput.close();
                userBirthInput.close();                
                userFirstNameInput.close();
                userLastNameInput.close();
           
                insert(userLastName, userFirstName, userBirth, userEmail, matricule);
            }
            else if (userChoice == 2)
            {
            	// Affichage de tous les enregistrements
            	selectAll();
            }
            else if(userChoice == 3)
            {
            	// Mise à jour d'un enregistrement
            	//update(userId);
            }
            else if(userChoice == 4)
            {
            	 // Suppression d'un enregistrement
            	Scanner userChoiceInputDelete = new Scanner(System.in);
            	System.out.println("Entrer le matricule de l'étudiant à supprimer");
            	String userMatricule = userChoiceInputDelete.nextLine();// Pour récupérer l'entrée de l'utilisateur si c'est des caratères
            	
            	while(userMatricule.length() > 7 || userMatricule.length() < 5 ) {
            		System.out.println("Matricule incorrect, Réessayer !");
            		userMatricule = userChoiceInputDelete.nextLine();// Pour récupérer l'entrée de l'utilisateur si c'est des nombres
            	}
            	userChoiceInputDelete.close();
            	delete(userMatricule);
            }

        	
        userChoiceInput.close();
        } catch(Exception e) {
        	e.printStackTrace();
        }
	}
	
	//Initialisation de la connexion à la base de donnée
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
        String jdbcUrl = "jdbc:mysql://localhost:3306/javadatabase";
        String user = "root";
        String password = "";
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(jdbcUrl, user, password);
    }
    
	//fonction d'insertion
    public static void insert(String nom, String prenom, String date_naissance, String email, String matricule) throws SQLException, ClassNotFoundException {
        Connection connection = getConnection();
        String sql = "INSERT INTO etudiants (nom, prenom, date_naissance, email, matricule) VALUES (?, ?, ?, ?, ?)";
     
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, nom);
        preparedStatement.setString(2, prenom);
        preparedStatement.setString(3, date_naissance);
        preparedStatement.setString(4, email);
        preparedStatement.setString(5, matricule);
        int lignesAffectees = preparedStatement.executeUpdate();
        if (lignesAffectees > 0) {
            System.out.println("Insertion réussie");
        }
        else {
        	System.out.println("Erreur lors de l'insertion. Réessayer");
        }
        preparedStatement.close();
        connection.close();
    }
    
    public static void selectAll() throws SQLException, ClassNotFoundException {
        Connection connection = getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM etudiants");
        ResultSet resultat = statement.executeQuery();
        System.out.println("Liste des étudiants:");
        while (resultat.next()) {
            System.out.println("Matricule: " + resultat.getString("matricule") + ", Nom: " + resultat.getString("nom") + ", Prénom: " + resultat.getString("prenom") + ", Date de naissance: " + resultat.getString("date_naissance") + ", Email: " + resultat.getString("email"));
        }
        statement.close();
        connection.close();
    }

    public static void delete(String userMatricule) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = getConnection();
            String sql = "DELETE FROM etudiants WHERE matricule = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userMatricule);
            int lignesAffectees = preparedStatement.executeUpdate();

            if (lignesAffectees > 0) {
                System.out.println("Suppression réussie.");
            } else {
                System.out.println("Aucune ligne affectée. Vérifiez si le matricule existe.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erreur SQL : " + e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Erreur de chargement du pilote JDBC.");
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}