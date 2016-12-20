import java.util.Scanner;


public class EnemyShipTesting {

	public static void main(String[] args)
	{
		EnemyShipFactory factory=new EnemyShipFactory();
		
		EnemyShip theEnemy=null;
		
		Scanner input=new Scanner(System.in);
		System.out.println("What type of ship? U/R");
		
		if(input.hasNextLine())
		{
			String typeOfShip=input.nextLine();
			theEnemy=factory.makeEnemyShip(typeOfShip);
		}
		if(theEnemy!=null)
		{
			doStuffEnemy(theEnemy);
		}
	}
	
	public static void doStuffEnemy(EnemyShip enemyShip)
	{
		enemyShip.displayEnemyShip();
		enemyShip.followHeroShip();
		enemyShip.enemyShipShoots();
	}
}
