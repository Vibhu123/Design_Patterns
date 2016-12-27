
public abstract class EnemyShipBuilding {

	protected abstract EnemyShip makeEnemyShip(String typeOfShip);
	
	public EnemyShip orderTheShip(String typeOfShip) {
		// TODO Auto-generated method stub
		EnemyShip theES=makeEnemyShip(typeOfShip);
		
		theES.makeShip();
		theES.displayEnemyShip();
		theES.followHeroShip();
		theES.enemyShipShoots();
		
		return theES;
	}

}
