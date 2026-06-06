package _01_methods._5_FlappyBird;

import javax.swing.JOptionPane;

import processing.core.PApplet;
import processing.core.PImage;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int birdX = 150;
    int birdY = 300;
    int birdVelocity = -10;
    int framesDrawn = 0;
    int gravity = 1;
    PImage topPipe;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
       
    }

    @Override
    public void setup() {
        frameRate(60);
        topPipe = loadImage("src/_01_methods/_5_FlappyBird/topPipe.png");
    }

    @Override
    public void draw() {
    	 background(40,200,40);
     fill(200, 40, 10);
     stroke(0,0,0);
     ellipse(birdX,birdY,30,30);
     image(topPipe,350, 0);
    // if(framesDrawn %2 == 0) {
     birdY += birdVelocity;
     birdVelocity += gravity;
     if(mousePressed || keyPressed) {
    	 birdVelocity = -10;
     }
     if(birdY >= height + 50 || birdY <= -50) {
    	 JOptionPane.showMessageDialog(null, "You lost!");
    	 exit();
     }
    // }
    // framesDrawn +=1;
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
