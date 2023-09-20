package shapeInterface;

public class Main {

		public static void main(String[] args) {
			GeometricShape circle = new Circle(15.3);
			System.out.println(circle.getName()+ " - Aire : "+ circle.calculateArea());
			
			GeometricShape rectangle = new Rectangle (25.6, 31.9);
			System.out.println(rectangle.getName()+ " - Aire : "+ rectangle.calculateArea());
		}


}
