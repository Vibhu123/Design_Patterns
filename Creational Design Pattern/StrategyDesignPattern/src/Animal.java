
public class Animal {
	
	public Animal()
	{
		System.out.println("Animal constructor called");
	}
	public void setSound(String sound)
	{
		System.out.println(sound);
	}
	
	public Flys flyingType;//Composition, the class is composed of objects with the right capability
	
	public String tryToFly()
	{
		return flyingType.fly();
	}
	public void setFlyingAbility(Flys newFlyType)
	{
		flyingType=newFlyType;//Dynamically Assign Object behavior to the instance var
	}
	
	
}
