
class Singleton {
	
	private static Singleton firstInstance=null;
	
	private Singleton()
	{
		System.out.println("First and only instance created");
	}
	
	public static Singleton getInstance()
	{
		if(firstInstance==null)
		{
			firstInstance=new Singleton();
		}
		return firstInstance;
	}
	public void print()
	{
		System.out.println("Func called");
	}
	
}
