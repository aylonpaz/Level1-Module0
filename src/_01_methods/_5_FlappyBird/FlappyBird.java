package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int birdX = 150;
    int birdY = 300;
    int birdVelocity = -10;
    int fallSpeed = 1;
    int framesDrawn = 0;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
        
    }

    @Override
    public void setup() {
       
    }

    @Override
    public void draw() {
    	 background(40,200,40);
     fill(200, 40, 10);
     stroke(0,0,0);
     ellipse(birdX,birdY,30,30);
     if(framesDrawn %2 == 0) {
     birdVelocity -= fallSpeed;
     birdY -= birdVelocity;
     }
     framesDrawn +=1;
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
