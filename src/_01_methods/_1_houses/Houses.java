package _01_methods._1_houses;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	Robot rob = new Robot();
	public void run() {
		rob.setSpeed(20);
		rob.moveTo(0,550);
		rob.moveTo(700,300);
		rob.turn(-90);
		drawHouse("small");
		drawHouse("medium");
	}
	public void drawHouse(String size) {
		int height = 0;
		if(size == "small") {
			height = 100;
		} else if(size == "medium") {
			height = 200;
		} else if(size == "large") {
			height = 250;
		}
		rob.penDown();
		rob.setPenColor(49,196,60);
		rob.move(30);
		rob.turn(90);
		rob.setRandomPenColor();
		rob.move(height);
		rob.turn(-90);
		rob.move(30);
		rob.turn(-90);
		rob.move(height);
		rob.turn(90);
	}
}
