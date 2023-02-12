package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 250;
    int y = 350;
    int width = 30;
    int height = 30;
    int birdV = -10;
    int gravity = 1;
    int urectx = 450;
    int urecty = 0;
    int urectheight = 300;
    int pipeGap = 120;
    int lrecty= urectheight + pipeGap;
    int score = 0;
   
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        
    }

    @Override
    public void draw() {
        background(166, 216, 255);
        fill(247, 227, 74);
        stroke(242, 15, 34);
        ellipse(x, y, width, height);
        y += gravity;
        birdV += gravity;
        mousePressed();
        fill(104, 184, 83);
        noStroke();
        rect(urectx, urecty, 75, urectheight);
        rect(urectx, lrecty, 75, 500);
        urectx -= 2;
        teleportPipes();
        boolean check = hitsPipes();
        if(check == true) {
        	System.exit(0);
        }
        fill(20, 94, 20);
        rect(5, 595, 800, 5);
        if(y >= 595) {
        	System.exit(0);
        }
        text("Score : " + score, 5, 10);
        if(x == urectx + 30) {
        	score += 1;
        }
    }
    public void mousePressed() {
    	if(mousePressed == true) {
    		birdV = -10;
    		y += birdV;
    	}
    }
    public void teleportPipes() {
    	if(urectx <= -75) {
    		urectx = 800;
    		urectheight = (int)random(100, 400);
    	}
    }
    boolean hitsPipes() {
    	if (y < urectheight && x > urectx && x < (urectx+75)){
            return true; }
        else if (y>lrecty && x > urectx && x < (urectx+75)) {
            return true; }
        else { return false; }
    }
    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
