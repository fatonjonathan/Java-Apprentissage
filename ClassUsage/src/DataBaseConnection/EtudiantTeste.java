package DataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EtudiantTeste {

    public static void main(String[] args) {
        try {
            // Insertion d'un enregistrement
            insert("Benoit", "David", "1982-12-10", "benoitdavid@jaiunmail.com", "E240");

            // Affichage de tous les enregistrements
            selectAll();

            // Mise à jour d'un enregistrement
            update("E240", "newemail@domain.com");

            // Suppression d'un enregistrement
            delete("E240");

            // Affichage de tous les enregistrements pour vérifier les modifications
            selectAll();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        String jdbcUrl = "jdbc:mysql://localhost:3306/javadatabase";
        String user = "root";
        String password = "";
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(jdbcUrl, user, password);
    }

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

    public static void update(String matricule, String newEmail) throws SQLException, ClassNotFoundException {
        Connection connection = getConnection();
        String sql = "UPDATE etudiants SET email = ? WHERE matricule = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, newEmail);
        preparedStatement.setString(2, matricule);
        int lignesAffectees = preparedStatement.executeUpdate();
        if (lignesAffectees > 0) {
            System.out.println("Mise à jour réussie");
        }
        preparedStatement.close();
        connection.close();
    }

    public static void delete(String matricule) throws SQLException, ClassNotFoundException {
        Connection connection = getConnection();
        String sql = "DELETE FROM etudiants WHERE matricule = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, matricule);
        int lignesAffectees = preparedStatement.executeUpdate();
        if (lignesAffectees > 0) {
            System.out.println("Suppression réussie");
        }
        preparedStatement.close();
        connection.close();
    }
}
