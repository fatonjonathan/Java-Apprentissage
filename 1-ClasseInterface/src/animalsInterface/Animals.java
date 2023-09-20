package animalsInterface;

public class Animals implements Swim, Fly, Climb, Walk {
	private String name;
	
	public Animals (String name){
		this.name = name;
	}
	
	@Override
	public void swim()
	{
		System.out.println(name + "nage");
	}
	
	@Override
	public void climb()
	{
		System.out.println(name + "grimpe");
	}
	
	@Override 
	public void fly()
	{
		System.out.println(name + "vole");
	}
	
	@Override
	public void walk()
	{
		System.out.println(name + "marche");
	}
	
	
	
	
	
}
