
public class TestRobotBuilder {

	public static void main(String[] args)
	{
		RobotBuilder oldStyleRobot=new OldRobotBuilder();
		
		RobotEngineer robotEngineer=new RobotEngineer(oldStyleRobot);
		robotEngineer.makeRobot();
		
		Robot robot=robotEngineer.getRobot();
		System.out.println(robot.getRobotHead());
		System.out.println(robot.getRobotArms());
		System.out.println(robot.getRobotTorso());
		System.out.println(robot.getRobotLegs());
		
	}
}
