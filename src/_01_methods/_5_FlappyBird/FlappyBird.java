package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 350;
    int y = 450;
    int width = 30;
    int height = 30;
    int birdV = -10;
    int gravity = 1;
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
        gravity += 1;
        birdV += 1;
    }
    public void mousePressed() {
    	if(mousePressed == true) {
    		y -= birdV;
    	}
    }
    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
