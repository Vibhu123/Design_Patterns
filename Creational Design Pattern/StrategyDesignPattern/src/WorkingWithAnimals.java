
public class WorkingWithAnimals {

	public static void main(String[] args)
	{
		Animal sparky=new Dog();
		Animal tweety=new Bird();
	
		System.out.println("Dog says "+sparky.tryToFly());
		System.out.println("Bird says "+tweety.tryToFly());
		
		sparky.setFlyingAbility(new ItFlys());
		
		System.out.println("Dog says "+sparky.tryToFly());
	}
	
}
