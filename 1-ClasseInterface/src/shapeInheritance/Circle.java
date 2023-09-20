package shapeInheritance;

public class Circle extends GeometricShape{
	private double radius; //C'est une variable de classe, elle peu être utiliser pour n'importe quelle méthode ma classe
	
	public Circle(double radius) { // Ici c'est le constructeur, il sert a initialiser la classe
		this.radius = radius;
	}
	
	//Redéfinition de la méthode pour obtenir le nom de la forme
	
	@Override //C'est une méthode 
	public String getName() {
		return "Cercle";
	}
	
	//Méthode pour calculer l'aire du cercle
	/*
	 * *return Math.PI * radius * radius; calcule
	 * * l'aire d'un cercle en utilisant la formule mathématique : "r² * (pi)"
	 */
	public double calculateArea() {
		return Math.PI*radius*radius;
	}
}
