
public class UFOEnemyShip extends EnemyShip {

	EnemyShipFactory enemyShipFactory;
	
	public UFOEnemyShip(EnemyShipFactory shipPartsFactory) {
		// TODO Auto-generated constructor stub
		enemyShipFactory=shipPartsFactory;
	}

	@Override
	void makeShip() {
		// TODO Auto-generated method stub
		setName("UFO");
		System.out.println("Making enemy ship "+getName());
		weapon=enemyShipFactory.addESGun();
		engine=enemyShipFactory.addESEngine();
		
	}
	

}
