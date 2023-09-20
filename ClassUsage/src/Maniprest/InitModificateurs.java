package Maniprest;

public class InitModificateurs {

	public int variablePublique; //Variable publique
	private int variablePrivee;// Variable privée
	protected int variableProtegee; // Variable protégée
	
	
	//Constructeur par défaut
	public InitModificateurs() {
		variablePublique = 1;
		variablePrivee = 2;
		variableProtegee = 3;
	}
	
	//Méthode publlique
	public void methodePublique() {
		System.out.println("Méthode publique");
	}
	
	//Methode privée
	protected void methodeProtegee()
	{
		System.out.println("Méthode protégée");
	}
	
	//Méthode par défaut (package-private)
	void methodeParDefaut() {
		System.out.println("Methode par défaut (package-private");
	}
	
	public static void main(String[] args) {
		InitModificateurs exemple = new InitModificateurs();
		System.out.println(exemple.variablePublique); // ok, accessible depuis n'importe ou
		//System.out.println("exemple.variablePrivee"); // Erreur de compilation, inacessible depuis d'autres classes
		System.out.println(exemple.variableProtegee); //Ok accessible depuis des sous-classes
		exemple.methodePublique();//Ok, accessible depuis n'importe ou
		//exemple.methodePrivee(); //Erreur de compilation, innacessible depuis d'autres classes
		exemple.methodeProtegee(); //ok, accessible depuis des sous-classes
		exemple.methodeParDefaut(); //ok, accessible depuis le même package
	
	}
}
