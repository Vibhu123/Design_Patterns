
public class Robot implements RobotPlan{

	private String head;
	private String torso;
	private String arms;
	private String legs;
	
	@Override
	public void setRobotHead(String head) {
		// TODO Auto-generated method stub
		this.head=head;
	}

	@Override
	public void setRobotTorso(String torso) {
		// TODO Auto-generated method stub
		this.torso=torso;
	}

	@Override
	public void setRobotArms(String arms) {
		// TODO Auto-generated method stub
		this.arms=arms;
	}

	@Override
	public void setRobotLegs(String legs) {
		// TODO Auto-generated method stub
		this.legs=legs;
	}
	
	public String getRobotHead()
	{
		return this.head;
	}
	
	public String getRobotTorso()
	{
		return this.torso;
	}
	
	public String getRobotArms()
	{
		return this.arms;
	}
	
	public String getRobotLegs()
	{
		return this.legs;
	}

}
