package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot myDraven = new Robot("mini");
myDraven.setSpeed(10);
	myDraven.move(150);
myDraven.turn(-360);	
myDraven.turn(360);
myDraven.move(-150);

	}
}
