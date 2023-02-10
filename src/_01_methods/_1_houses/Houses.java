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
		drawHouse("small", "Pink", "Pointy");
		drawHouse("medium", "Blue", "Flat");
		drawHouse("small", "Orange", "Pointy");
		drawHouse("small", "Blue", "Pointy");
		drawHouse("large", "Pink", "Flat");
		drawHouse("medium", "Orange", "Flat");
		drawHouse("small", "Blue", "Pointy");
		drawHouse("medium", "Orange", "Pointy");
		drawHouse("large", "Blue", "Flat");
	}
	public void drawHouse(String size, String color, String roof) {
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
		if(color == "Blue") {
			rob.setPenColor(57, 42, 199);
		} else if(color == "Pink") {
			rob.setPenColor(204, 35, 153);
		} else if(color == "Orange") {
			rob.setPenColor(204, 105, 35);
		}
		rob.move(height);
		if(roof == "Pointy") {
			drawPointyRoof();
		} else {
			drawFlatRoof();
		}
		rob.move(height);
		rob.turn(90);
	}
	public void drawPointyRoof() {
		rob.turn(-45);
		rob.move(20);
		rob.turn(-90);
		rob.move(20);
		rob.turn(-45);
	}
	public void drawFlatRoof() {
		rob.turn(-90);
		rob.move(30);
		rob.turn(-90);
	}
}
