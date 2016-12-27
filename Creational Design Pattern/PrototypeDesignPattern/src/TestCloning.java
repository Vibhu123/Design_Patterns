
public class TestCloning {

	public static void main(String[] args)
	{
		CloneFactory animalMaker=new CloneFactory();
		
		Sheep sally=new Sheep();
		
		Sheep clonedSally=(Sheep) animalMaker.getClone(sally);
		
		System.out.println(sally);
		System.out.println("Sally hashcode "+System.identityHashCode(sally));
		
		System.out.println("Cloned sheep "+clonedSally);
		System.out.println("Cloned sheep hashcode "+System.identityHashCode(clonedSally));
	}
	
}
