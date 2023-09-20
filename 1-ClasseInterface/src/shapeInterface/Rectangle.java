package shapeInterface;

public class Rectangle implements GeometricShape {
	private double longueur;
	private double largeur;
	
	public Rectangle(double longueur, double largeur)
	{
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	@Override
	public String getName() {
		return "Rectangle";
	}
	@Override
	public double calculateArea()
	{
		return longueur * largeur;
	}
}
