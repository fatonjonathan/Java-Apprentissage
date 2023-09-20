package shapeInheritance;

public class Rectangle extends GeometricShape{
	private double longueur; //
	private double largeur;
	
	
	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur; //variable de constructeur appelé paramètres
		this.largeur = largeur; //variable de constructeur appelé paramètres
	}
	public String getName() {
		return "rectangle";
	}
	
	public double calculateArea() {
		return longueur*largeur;
	}
	
}
