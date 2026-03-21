package _01_methods._1_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
			Robot rob;
			Random ran;
			int r;
			int g;
			int b;

	public void run() {
		rob = new Robot();
		rob.setX(5);
		rob.setY(450);
		rob.setSpeed(100);
		rob.penDown();
		small();
		medium();
		// Check the recipe to find out what code to put here
	
}
	public void RandomColor() {
	ran = new Random();
	r = ran.nextInt(256);
	g = ran.nextInt(256);
	b = ran.nextInt(256);
	rob.setPenColor(r, g, b);
	}
	public void small() {
		RandomColor();
		rob.turn(90);
		rob.move(20);
		rob.turn(-90);
		rob.move(100);
		rob.turn(45);
		rob.move(50);
		rob.turn(90);
		rob.move(50);
		rob.turn(45);
		rob.move(100);
		rob.turn(180);
	}
	public void medium() {
		
		rob.turn(90);
		rob.move(20);
		rob.turn(-90);
		rob.move(170);
		rob.turn(45);
		rob.move(50);
		rob.turn(90);
		rob.move(50);
		rob.turn(45);
		rob.move(170);
		rob.turn(180);
	}
	}
